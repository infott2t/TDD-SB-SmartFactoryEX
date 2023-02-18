package com.example.firstinstance.controller.firstinstanceurl.domain.servicework;
import lombok.RequiredArgsConstructor;
// import Service, Entity, ApiDtoForm.
import com.example.domain.servicework.ServiceWork;
import com.example.domain.servicework.ServiceWorkApiDto;
import com.example.domain.servicework.ServiceWorkSearchCondition;
import com.example.domain.servicework.ServiceWorkService;
import com.example.firstinstance.controller.firstinstanceurl.form.ServiceWorkApiDtoForm;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.time.format.DateTimeFormatter;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Controller
public class InstanceUrlServiceWorkController {

    private final ServiceWorkService serviceWorkService;

    @GetMapping("/administer/instanceurl/serviceWork")
    public String index(Model model, ServiceWorkSearchCondition condition,
                        @RequestParam(value="page", required=false) Integer page,
                        @PageableDefault(size= 10)Pageable pageable) throws Exception {

        Page<ServiceWorkApiDto> boards = serviceWorkService.searchAllV2(condition, pageable);


        model.addAttribute("boards", boards);
        model.addAttribute("condition", condition);
        model.addAttribute("page", pageable.getPageNumber()+1); // 0부터 시작, +1이 필요.

        return "firstinstance/serviceWork/index";
    }

    @GetMapping("/administer/instanceurl/serviceWork/insert")
    public String insert(Model model, ServiceWorkSearchCondition condition,
                         @RequestParam(value="page", required=false) Integer page,
                         @PageableDefault(size= 10)Pageable pageable) throws Exception{

        Page<ServiceWorkApiDto> boards = serviceWorkService.searchAllV2(condition, pageable);


        model.addAttribute("boards", boards);
        model.addAttribute("condition", condition);
        model.addAttribute("page", pageable.getPageNumber()+1); // 0부터 시작, +1이 필요.

        ServiceWorkApiDtoForm userForm = new ServiceWorkApiDtoForm();
        model.addAttribute("userForm",userForm);

        return "firstinstance/serviceWork/insert";
    }

    @PostMapping("/administer/instanceurl/serviceWork/insert_2")
    public String insert_2(Model model, ServiceWorkApiDtoForm userForm){

        ServiceWork serviceWork = null;

        try {
            serviceWork = new ServiceWork();
        DateTimeFormatter stdFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        serviceWork.setCoopName(userForm.getCoopName());
        serviceWork.setCoopComment(userForm.getCoopComment());
        serviceWork.setCoopWorkName(userForm.getCoopWorkName());
        serviceWork.setWtag1(userForm.getWtag1());
        serviceWork.setWtag2(userForm.getWtag2());
        if(userForm.getStartWorkDate()!=null && !userForm.getStartWorkDate().equals("")){
            serviceWork.setStartWorkDate(LocalDateTime.parse(userForm.getStartWorkDate(),stdFormat));
        }
        if(userForm.getEndWorkDate()!=null && !userForm.getEndWorkDate().equals("")){
            serviceWork.setEndWorkDate(LocalDateTime.parse(userForm.getEndWorkDate(),stdFormat));
        }
        serviceWork.setSearchTag1(userForm.getSearchTag1());
        serviceWork.setSearchTag2(userForm.getSearchTag2());
        serviceWork.setSearchTag3(userForm.getSearchTag3());
        serviceWork.setSearchTag4(userForm.getSearchTag4());
        serviceWork.setSearchTag5(userForm.getSearchTag5());
        serviceWork.setIsDel(userForm.getIsDel());
            serviceWork.setModifiedDate(LocalDateTime.now());
            serviceWork.setCreatedDate(LocalDateTime.now());
            serviceWork.setIsDel("N");

            serviceWorkService.save(serviceWork);

        } catch (Exception e) {
        return "redirect:/administer/instanceurl/serviceWork/insert";
        }
        return "redirect:/administer/instanceurl/serviceWork/insert";}

    @GetMapping("/administer/instanceurl/serviceWork/delete")
    public String delete(@RequestParam(value="id")Long id, Model model) {

        ServiceWork serviceWork = null;
        try {
             serviceWork = serviceWorkService.findById(id);
        } catch (Exception e) {
            return "redirect:/administer/instanceurl/serviceWork/";
        }

        serviceWork.setIsDel("Y");
        serviceWorkService.save(serviceWork);


        return "redirect:/administer/instanceurl/serviceWork/";
    }

    @GetMapping("/administer/instanceurl/serviceWork/update")
    public String update(Model model, @RequestParam(value="id")Long id, ServiceWorkSearchCondition condition,
                         @RequestParam(value="page", required=false) Integer page,
                         @PageableDefault(size= 10)Pageable pageable) throws Exception{
        Page<ServiceWorkApiDto> boards = serviceWorkService.searchAllV2(condition, pageable);


        model.addAttribute("boards", boards);
        model.addAttribute("condition", condition);
        model.addAttribute("page", pageable.getPageNumber()+1); // 0부터 시작, +1이 필요.

        ServiceWorkApiDtoForm userForm = new ServiceWorkApiDtoForm();
        ServiceWork serviceWork = null;

        try {
            serviceWork = serviceWorkService.findById(id);
        }catch(Exception e){
            return "redirect:/administer/instanceurl/serviceWork/insert";
        }

        userForm.setId(serviceWork.getId());
              DateTimeFormatter stdFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        userForm.setId(serviceWork.getId());
        userForm.setCoopName(serviceWork.getCoopName());
        userForm.setCoopComment(serviceWork.getCoopComment());
        userForm.setCoopWorkName(serviceWork.getCoopWorkName());
        userForm.setWtag1(serviceWork.getWtag1());
        userForm.setWtag2(serviceWork.getWtag2());
        if(serviceWork.getStartWorkDate()!=null){
        userForm.setStartWorkDate(serviceWork.getStartWorkDate().format(stdFormat));
        }
        if(serviceWork.getEndWorkDate()!=null){
        userForm.setEndWorkDate(serviceWork.getEndWorkDate().format(stdFormat));
        }
        userForm.setSearchTag1(serviceWork.getSearchTag1());
        userForm.setSearchTag2(serviceWork.getSearchTag2());
        userForm.setSearchTag3(serviceWork.getSearchTag3());
        userForm.setSearchTag4(serviceWork.getSearchTag4());
        userForm.setSearchTag5(serviceWork.getSearchTag5());
        userForm.setIsDel(serviceWork.getIsDel());

        userForm.setCreatedDate(serviceWork.getCreatedDate());
        userForm.setModifiedDate(serviceWork.getModifiedDate());

        model.addAttribute("userForm",userForm);
        return "firstinstance/serviceWork/update";
    }

    @PostMapping("/administer/instanceurl/serviceWork/update_2")
    public String update_2(Model model, @RequestParam(value="id")Long id,ServiceWorkApiDtoForm userForm, ServiceWorkSearchCondition condition,
                           @RequestParam(value="page", required=false) Integer page,
                           Pageable pageable) throws Exception {


        ServiceWork serviceWork = null;
        try{
            serviceWork = serviceWorkService.findById(id);
        }catch(Exception e){
            return "redirect:/administer/instanceurl/serviceWork/insert";
        }

        try{
        DateTimeFormatter stdFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        serviceWork.setCoopName(userForm.getCoopName());
        serviceWork.setCoopComment(userForm.getCoopComment());
        serviceWork.setCoopWorkName(userForm.getCoopWorkName());
        serviceWork.setWtag1(userForm.getWtag1());
        serviceWork.setWtag2(userForm.getWtag2());
        if(userForm.getStartWorkDate()!=null && !userForm.getStartWorkDate().equals("")){
            serviceWork.setStartWorkDate(LocalDateTime.parse(userForm.getStartWorkDate(),stdFormat));
        }
        if(userForm.getEndWorkDate()!=null && !userForm.getEndWorkDate().equals("")){
            serviceWork.setEndWorkDate(LocalDateTime.parse(userForm.getEndWorkDate(),stdFormat));
        }
        serviceWork.setSearchTag1(userForm.getSearchTag1());
        serviceWork.setSearchTag2(userForm.getSearchTag2());
        serviceWork.setSearchTag3(userForm.getSearchTag3());
        serviceWork.setSearchTag4(userForm.getSearchTag4());
        serviceWork.setSearchTag5(userForm.getSearchTag5());
        serviceWork.setIsDel(userForm.getIsDel());
        }catch(Exception e){
            return "redirect:/administer/instanceurl/serviceWork/insert";
        }

        serviceWork.setModifiedDate(LocalDateTime.now());

        serviceWorkService.save(serviceWork);




        return "redirect:/administer/instanceurl/serviceWork/insert";
    }


}
