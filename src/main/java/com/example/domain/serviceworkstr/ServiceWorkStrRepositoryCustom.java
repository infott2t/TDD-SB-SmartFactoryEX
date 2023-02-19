package com.example.domain.serviceworkstr;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ServiceWorkStrRepositoryCustom {

    Page<ServiceWorkStrApiDto> searchAllV2(ServiceWorkStrSearchCondition condition, Pageable pageable);

    Page<ServiceWorkStrApiDto> searchAllV3(ServiceWorkStrSearchCondition2 condition, Pageable pageable);

  List<ServiceWorkStrApiDto> searchFindAllDesc();


}