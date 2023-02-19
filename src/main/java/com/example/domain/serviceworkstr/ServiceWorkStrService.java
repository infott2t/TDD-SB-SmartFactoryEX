package com.example.domain.serviceworkstr;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceWorkStrService {

    private final ServiceWorkStrRepository serviceWorkStrRepository;
    
    @Transactional(readOnly = true)
    public List<ServiceWorkStrApiDto> searchFindAllDesc() {
        return  serviceWorkStrRepository.searchFindAllDesc();
    }

    @Transactional(readOnly = true)
    public ServiceWorkStr findById(Long id) {
        return serviceWorkStrRepository.findById(id).orElseThrow();
    }

    @Transactional
    public void save(ServiceWorkStr serviceWorkStr) {
        serviceWorkStrRepository.save(serviceWorkStr);
    }

    @Transactional(readOnly = true)
    public Page<ServiceWorkStrApiDto> searchAllV2(ServiceWorkStrSearchCondition condition, Pageable pageable) {
        return serviceWorkStrRepository.searchAllV2(condition, pageable);
    }
}