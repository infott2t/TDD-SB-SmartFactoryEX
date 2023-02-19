package com.example.domain.servicework;
import com.example.domain.servicework.ServiceWork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceWorkRepository extends JpaRepository<ServiceWork, Long>,
        QuerydslPredicateExecutor<ServiceWork>, ServiceWorkRepositoryCustom {


}