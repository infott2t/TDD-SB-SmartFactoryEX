package com.example.domain.servicework;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ServiceWorkRepositoryCustom {

    Page<ServiceWorkApiDto> searchAllV2(ServiceWorkSearchCondition condition, Pageable pageable);

    Page<ServiceWorkApiDto> searchAllV3(ServiceWorkSearchCondition2 condition, Pageable pageable);

  List<ServiceWorkApiDto> searchFindAllDesc();


}