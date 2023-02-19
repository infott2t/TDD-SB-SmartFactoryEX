package com.example.domain.servicework;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceWorkService {

    private final ServiceWorkRepository serviceWorkRepository;
    
    @Transactional(readOnly = true)
    public List<ServiceWorkApiDto> searchFindAllDesc() {
        return  serviceWorkRepository.searchFindAllDesc();
    }

    @Transactional(readOnly = true)
    public ServiceWork findById(Long id) {
        return serviceWorkRepository.findById(id).orElseThrow();
    }

    @Transactional
    public void save(ServiceWork serviceWork) {
        serviceWorkRepository.save(serviceWork);
    }

    @Transactional(readOnly = true)
    public Page<ServiceWorkApiDto> searchAllV2(ServiceWorkSearchCondition condition, Pageable pageable) {
        return serviceWorkRepository.searchAllV2(condition, pageable);
    }
}