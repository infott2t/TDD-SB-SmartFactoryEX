package com.example.domain.serviceworkstr;
import com.example.domain.serviceworkstr.ServiceWorkStr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceWorkStrRepository extends JpaRepository<ServiceWorkStr, Long>,
        QuerydslPredicateExecutor<ServiceWorkStr>, ServiceWorkStrRepositoryCustom {


}