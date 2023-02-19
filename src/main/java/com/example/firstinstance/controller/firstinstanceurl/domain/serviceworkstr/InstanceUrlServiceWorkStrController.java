package com.example.firstinstance.controller.firstinstanceurl.domain.serviceworkstr;
import lombok.RequiredArgsConstructor;
// import Service, Entity, ApiDtoForm.
import com.example.domain.serviceworkstr.ServiceWorkStr;
import com.example.domain.serviceworkstr.ServiceWorkStrApiDto;
import com.example.domain.serviceworkstr.ServiceWorkStrSearchCondition;
import com.example.domain.serviceworkstr.ServiceWorkStrService;
import com.example.firstinstance.controller.firstinstanceurl.form.ServiceWorkStrApiDtoForm;

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
public class InstanceUrlServiceWorkStrController {

    private final ServiceWorkStrService serviceWorkStrService;

    @GetMapping("/administer/instanceurl/serviceWorkStr")
    public String index(Model model, ServiceWorkStrSearchCondition condition,
                        @RequestParam(value="page", required=false) Integer page,
                        @PageableDefault(size= 10)Pageable pageable) throws Exception {

        Page<ServiceWorkStrApiDto> boards = serviceWorkStrService.searchAllV2(condition, pageable);


        model.addAttribute("boards", boards);
        model.addAttribute("condition", condition);
        model.addAttribute("page", pageable.getPageNumber()+1); // 0부터 시작, +1이 필요.

        return "firstinstance/serviceWorkStr/index";
    }

    @GetMapping("/administer/instanceurl/serviceWorkStr/insert")
    public String insert(Model model, ServiceWorkStrSearchCondition condition,
                         @RequestParam(value="page", required=false) Integer page,
                         @PageableDefault(size= 10)Pageable pageable) throws Exception{

        Page<ServiceWorkStrApiDto> boards = serviceWorkStrService.searchAllV2(condition, pageable);


        model.addAttribute("boards", boards);
        model.addAttribute("condition", condition);
        model.addAttribute("page", pageable.getPageNumber()+1); // 0부터 시작, +1이 필요.

        ServiceWorkStrApiDtoForm userForm = new ServiceWorkStrApiDtoForm();
        model.addAttribute("userForm",userForm);

        return "firstinstance/serviceWorkStr/insert";
    }

    @PostMapping("/administer/instanceurl/serviceWorkStr/insert_2")
    public String insert_2(Model model, ServiceWorkStrApiDtoForm userForm){

        ServiceWorkStr serviceWorkStr = null;

        try {
            serviceWorkStr = new ServiceWorkStr();
        DateTimeFormatter stdFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        serviceWorkStr.setWStr1(userForm.getWStr1());
        serviceWorkStr.setWStr2(userForm.getWStr2());
        serviceWorkStr.setWStr3(userForm.getWStr3());
        serviceWorkStr.setWStr4(userForm.getWStr4());
        serviceWorkStr.setWStr5(userForm.getWStr5());
        serviceWorkStr.setWStr6(userForm.getWStr6());
        serviceWorkStr.setWStr7(userForm.getWStr7());
        serviceWorkStr.setWStr8(userForm.getWStr8());
        serviceWorkStr.setWStr9(userForm.getWStr9());
        serviceWorkStr.setWStr10(userForm.getWStr10());
        serviceWorkStr.setWStr11(userForm.getWStr11());
        serviceWorkStr.setWStr12(userForm.getWStr12());
        serviceWorkStr.setWStr13(userForm.getWStr13());
        serviceWorkStr.setWStr14(userForm.getWStr14());
        serviceWorkStr.setWStr15(userForm.getWStr15());
        serviceWorkStr.setWStr16(userForm.getWStr16());
        serviceWorkStr.setWStr17(userForm.getWStr17());
        serviceWorkStr.setWStr18(userForm.getWStr18());
        serviceWorkStr.setWStr19(userForm.getWStr19());
        serviceWorkStr.setWStr20(userForm.getWStr20());
        serviceWorkStr.setWStr21(userForm.getWStr21());
        serviceWorkStr.setWStr22(userForm.getWStr22());
        serviceWorkStr.setWStr23(userForm.getWStr23());
        serviceWorkStr.setWStr24(userForm.getWStr24());
        serviceWorkStr.setWStr25(userForm.getWStr25());
        serviceWorkStr.setWStr26(userForm.getWStr26());
        serviceWorkStr.setWStr27(userForm.getWStr27());
        serviceWorkStr.setWStr28(userForm.getWStr28());
        serviceWorkStr.setWStr29(userForm.getWStr29());
        serviceWorkStr.setWStr30(userForm.getWStr30());
        serviceWorkStr.setWStr31(userForm.getWStr31());
        serviceWorkStr.setWStr32(userForm.getWStr32());
        serviceWorkStr.setWStr33(userForm.getWStr33());
        serviceWorkStr.setWStr34(userForm.getWStr34());
        serviceWorkStr.setWStr35(userForm.getWStr35());
        serviceWorkStr.setWStr36(userForm.getWStr36());
        serviceWorkStr.setWStr37(userForm.getWStr37());
        serviceWorkStr.setWStr38(userForm.getWStr38());
        serviceWorkStr.setWStr39(userForm.getWStr39());
        serviceWorkStr.setWStr40(userForm.getWStr40());
        serviceWorkStr.setWStr41(userForm.getWStr41());
        serviceWorkStr.setWStr42(userForm.getWStr42());
        serviceWorkStr.setWStr43(userForm.getWStr43());
        serviceWorkStr.setWStr44(userForm.getWStr44());
        serviceWorkStr.setWStr45(userForm.getWStr45());
        serviceWorkStr.setWStr46(userForm.getWStr46());
        serviceWorkStr.setWStr47(userForm.getWStr47());
        serviceWorkStr.setWStr48(userForm.getWStr48());
        serviceWorkStr.setWStr49(userForm.getWStr49());
        serviceWorkStr.setWStr50(userForm.getWStr50());
        serviceWorkStr.setIsDel(userForm.getIsDel());
            serviceWorkStr.setModifiedDate(LocalDateTime.now());
            serviceWorkStr.setCreatedDate(LocalDateTime.now());
            serviceWorkStr.setIsDel("N");

            serviceWorkStrService.save(serviceWorkStr);

        } catch (Exception e) {
        return "redirect:/administer/instanceurl/serviceWorkStr/insert";
        }
        return "redirect:/administer/instanceurl/serviceWorkStr/insert";}

    @GetMapping("/administer/instanceurl/serviceWorkStr/delete")
    public String delete(@RequestParam(value="id")Long id, Model model) {

        ServiceWorkStr serviceWorkStr = null;
        try {
             serviceWorkStr = serviceWorkStrService.findById(id);
        } catch (Exception e) {
            return "redirect:/administer/instanceurl/serviceWorkStr/";
        }

        serviceWorkStr.setIsDel("Y");
        serviceWorkStrService.save(serviceWorkStr);


        return "redirect:/administer/instanceurl/serviceWorkStr/";
    }

    @GetMapping("/administer/instanceurl/serviceWorkStr/update")
    public String update(Model model, @RequestParam(value="id")Long id, ServiceWorkStrSearchCondition condition,
                         @RequestParam(value="page", required=false) Integer page,
                         @PageableDefault(size= 10)Pageable pageable) throws Exception{
        Page<ServiceWorkStrApiDto> boards = serviceWorkStrService.searchAllV2(condition, pageable);


        model.addAttribute("boards", boards);
        model.addAttribute("condition", condition);
        model.addAttribute("page", pageable.getPageNumber()+1); // 0부터 시작, +1이 필요.

        ServiceWorkStrApiDtoForm userForm = new ServiceWorkStrApiDtoForm();
        ServiceWorkStr serviceWorkStr = null;

        try {
            serviceWorkStr = serviceWorkStrService.findById(id);
        }catch(Exception e){
            return "redirect:/administer/instanceurl/serviceWorkStr/insert";
        }

        userForm.setId(serviceWorkStr.getId());
              DateTimeFormatter stdFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        userForm.setId(serviceWorkStr.getId());
        userForm.setWStr1(serviceWorkStr.getWStr1());
        userForm.setWStr2(serviceWorkStr.getWStr2());
        userForm.setWStr3(serviceWorkStr.getWStr3());
        userForm.setWStr4(serviceWorkStr.getWStr4());
        userForm.setWStr5(serviceWorkStr.getWStr5());
        userForm.setWStr6(serviceWorkStr.getWStr6());
        userForm.setWStr7(serviceWorkStr.getWStr7());
        userForm.setWStr8(serviceWorkStr.getWStr8());
        userForm.setWStr9(serviceWorkStr.getWStr9());
        userForm.setWStr10(serviceWorkStr.getWStr10());
        userForm.setWStr11(serviceWorkStr.getWStr11());
        userForm.setWStr12(serviceWorkStr.getWStr12());
        userForm.setWStr13(serviceWorkStr.getWStr13());
        userForm.setWStr14(serviceWorkStr.getWStr14());
        userForm.setWStr15(serviceWorkStr.getWStr15());
        userForm.setWStr16(serviceWorkStr.getWStr16());
        userForm.setWStr17(serviceWorkStr.getWStr17());
        userForm.setWStr18(serviceWorkStr.getWStr18());
        userForm.setWStr19(serviceWorkStr.getWStr19());
        userForm.setWStr20(serviceWorkStr.getWStr20());
        userForm.setWStr21(serviceWorkStr.getWStr21());
        userForm.setWStr22(serviceWorkStr.getWStr22());
        userForm.setWStr23(serviceWorkStr.getWStr23());
        userForm.setWStr24(serviceWorkStr.getWStr24());
        userForm.setWStr25(serviceWorkStr.getWStr25());
        userForm.setWStr26(serviceWorkStr.getWStr26());
        userForm.setWStr27(serviceWorkStr.getWStr27());
        userForm.setWStr28(serviceWorkStr.getWStr28());
        userForm.setWStr29(serviceWorkStr.getWStr29());
        userForm.setWStr30(serviceWorkStr.getWStr30());
        userForm.setWStr31(serviceWorkStr.getWStr31());
        userForm.setWStr32(serviceWorkStr.getWStr32());
        userForm.setWStr33(serviceWorkStr.getWStr33());
        userForm.setWStr34(serviceWorkStr.getWStr34());
        userForm.setWStr35(serviceWorkStr.getWStr35());
        userForm.setWStr36(serviceWorkStr.getWStr36());
        userForm.setWStr37(serviceWorkStr.getWStr37());
        userForm.setWStr38(serviceWorkStr.getWStr38());
        userForm.setWStr39(serviceWorkStr.getWStr39());
        userForm.setWStr40(serviceWorkStr.getWStr40());
        userForm.setWStr41(serviceWorkStr.getWStr41());
        userForm.setWStr42(serviceWorkStr.getWStr42());
        userForm.setWStr43(serviceWorkStr.getWStr43());
        userForm.setWStr44(serviceWorkStr.getWStr44());
        userForm.setWStr45(serviceWorkStr.getWStr45());
        userForm.setWStr46(serviceWorkStr.getWStr46());
        userForm.setWStr47(serviceWorkStr.getWStr47());
        userForm.setWStr48(serviceWorkStr.getWStr48());
        userForm.setWStr49(serviceWorkStr.getWStr49());
        userForm.setWStr50(serviceWorkStr.getWStr50());
        userForm.setIsDel(serviceWorkStr.getIsDel());

        userForm.setCreatedDate(serviceWorkStr.getCreatedDate());
        userForm.setModifiedDate(serviceWorkStr.getModifiedDate());

        model.addAttribute("userForm",userForm);
        return "firstinstance/serviceWorkStr/update";
    }

    @PostMapping("/administer/instanceurl/serviceWorkStr/update_2")
    public String update_2(Model model, @RequestParam(value="id")Long id,ServiceWorkStrApiDtoForm userForm, ServiceWorkStrSearchCondition condition,
                           @RequestParam(value="page", required=false) Integer page,
                           Pageable pageable) throws Exception {


        ServiceWorkStr serviceWorkStr = null;
        try{
            serviceWorkStr = serviceWorkStrService.findById(id);
        }catch(Exception e){
            return "redirect:/administer/instanceurl/serviceWorkStr/insert";
        }

        try{
        DateTimeFormatter stdFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        serviceWorkStr.setWStr1(userForm.getWStr1());
        serviceWorkStr.setWStr2(userForm.getWStr2());
        serviceWorkStr.setWStr3(userForm.getWStr3());
        serviceWorkStr.setWStr4(userForm.getWStr4());
        serviceWorkStr.setWStr5(userForm.getWStr5());
        serviceWorkStr.setWStr6(userForm.getWStr6());
        serviceWorkStr.setWStr7(userForm.getWStr7());
        serviceWorkStr.setWStr8(userForm.getWStr8());
        serviceWorkStr.setWStr9(userForm.getWStr9());
        serviceWorkStr.setWStr10(userForm.getWStr10());
        serviceWorkStr.setWStr11(userForm.getWStr11());
        serviceWorkStr.setWStr12(userForm.getWStr12());
        serviceWorkStr.setWStr13(userForm.getWStr13());
        serviceWorkStr.setWStr14(userForm.getWStr14());
        serviceWorkStr.setWStr15(userForm.getWStr15());
        serviceWorkStr.setWStr16(userForm.getWStr16());
        serviceWorkStr.setWStr17(userForm.getWStr17());
        serviceWorkStr.setWStr18(userForm.getWStr18());
        serviceWorkStr.setWStr19(userForm.getWStr19());
        serviceWorkStr.setWStr20(userForm.getWStr20());
        serviceWorkStr.setWStr21(userForm.getWStr21());
        serviceWorkStr.setWStr22(userForm.getWStr22());
        serviceWorkStr.setWStr23(userForm.getWStr23());
        serviceWorkStr.setWStr24(userForm.getWStr24());
        serviceWorkStr.setWStr25(userForm.getWStr25());
        serviceWorkStr.setWStr26(userForm.getWStr26());
        serviceWorkStr.setWStr27(userForm.getWStr27());
        serviceWorkStr.setWStr28(userForm.getWStr28());
        serviceWorkStr.setWStr29(userForm.getWStr29());
        serviceWorkStr.setWStr30(userForm.getWStr30());
        serviceWorkStr.setWStr31(userForm.getWStr31());
        serviceWorkStr.setWStr32(userForm.getWStr32());
        serviceWorkStr.setWStr33(userForm.getWStr33());
        serviceWorkStr.setWStr34(userForm.getWStr34());
        serviceWorkStr.setWStr35(userForm.getWStr35());
        serviceWorkStr.setWStr36(userForm.getWStr36());
        serviceWorkStr.setWStr37(userForm.getWStr37());
        serviceWorkStr.setWStr38(userForm.getWStr38());
        serviceWorkStr.setWStr39(userForm.getWStr39());
        serviceWorkStr.setWStr40(userForm.getWStr40());
        serviceWorkStr.setWStr41(userForm.getWStr41());
        serviceWorkStr.setWStr42(userForm.getWStr42());
        serviceWorkStr.setWStr43(userForm.getWStr43());
        serviceWorkStr.setWStr44(userForm.getWStr44());
        serviceWorkStr.setWStr45(userForm.getWStr45());
        serviceWorkStr.setWStr46(userForm.getWStr46());
        serviceWorkStr.setWStr47(userForm.getWStr47());
        serviceWorkStr.setWStr48(userForm.getWStr48());
        serviceWorkStr.setWStr49(userForm.getWStr49());
        serviceWorkStr.setWStr50(userForm.getWStr50());
        serviceWorkStr.setIsDel(userForm.getIsDel());
        }catch(Exception e){
            return "redirect:/administer/instanceurl/serviceWorkStr/insert";
        }

        serviceWorkStr.setModifiedDate(LocalDateTime.now());

        serviceWorkStrService.save(serviceWorkStr);




        return "redirect:/administer/instanceurl/serviceWorkStr/insert";
    }


}
