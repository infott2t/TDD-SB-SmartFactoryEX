package com.example.domain.servicework;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import javax.persistence.EntityManager;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.List;

import static com.example.domain.servicework.QServiceWork.serviceWork;
import static org.springframework.util.StringUtils.hasText;



public class ServiceWorkRepositoryImpl implements ServiceWorkRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    public ServiceWorkRepositoryImpl(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(em);
    }


   @Override
    public Page<ServiceWorkApiDto> searchAllV2(ServiceWorkSearchCondition condition, Pageable pageable) {

        List<ServiceWorkApiDto> content = queryFactory.
                select(Projections.constructor(ServiceWorkApiDto.class,
                        serviceWork.id,
                        serviceWork.coopName,
                        serviceWork.coopComment,
                        serviceWork.coopWorkName,
                        serviceWork.wtag1,
                        serviceWork.wtag2,
                        serviceWork.startWorkDate,
                        serviceWork.endWorkDate,
                        serviceWork.searchTag1,
                        serviceWork.searchTag2,
                        serviceWork.searchTag3,
                        serviceWork.searchTag4,
                        serviceWork.searchTag5,
                        serviceWork.isDel,
                        serviceWork.modifiedDate,
                        serviceWork.createdDate                )).from(serviceWork)
                .where(
                        searchAllV2Predicate(condition)
                ).where(serviceWork.isDel.eq("N"))
                .orderBy(serviceWork.id.desc())
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();

        long total = queryFactory
                .select(serviceWork.count())
                .from(serviceWork)
                .where(
                        searchAllV2Predicate(condition)
                ).where(serviceWork.isDel.eq("N"))
                .fetch().get(0);

        return new PageImpl<>(content, pageable, total);
    }




    private BooleanBuilder searchAllV2Predicate(ServiceWorkSearchCondition condition){
        return new BooleanBuilder()
                .and(condS(condition.getField(), condition.getS()))
                .and(condSdate(condition.getSdate()))
                .and(condEdate(condition.getEdate()));

    }

    private Predicate condS(String field, String s){
        BooleanBuilder builder = new BooleanBuilder();

        if(hasText(field) && hasText(s)) {
           if(field.equals("id")) {

                builder.or(serviceWork.id.eq(Long.valueOf(s)));

            }
        }

        return builder;
    }

    private Predicate condSdate( String sdate){
        BooleanBuilder builder = new BooleanBuilder();

        if(hasText(sdate)){
            try {
                LocalDateTime localDateTime = LocalDateTime.parse(sdate + "T00:00:00");
                builder.or(serviceWork.modifiedDate.goe(localDateTime)); // isrtDate >= sdate

            } catch (DateTimeParseException e) {
            }
        }
        return builder;
    }

    private Predicate condEdate( String edate){
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(edate)) {
            try {
                LocalDateTime localDateTime = LocalDateTime.parse(edate + "T00:00:00");
                builder.or(serviceWork.modifiedDate.loe(localDateTime)); // isrtDate <= edate

            } catch (DateTimeParseException e) {
            }
        }
        return builder;
    }



    @Override
    public List<ServiceWorkApiDto> searchFindAllDesc() {
        List<ServiceWorkApiDto> content = queryFactory.
                select(Projections.constructor(ServiceWorkApiDto.class,
                        serviceWork.id,
                        serviceWork.coopName,
                        serviceWork.coopComment,
                        serviceWork.coopWorkName,
                        serviceWork.wtag1,
                        serviceWork.wtag2,
                        serviceWork.startWorkDate,
                        serviceWork.endWorkDate,
                        serviceWork.searchTag1,
                        serviceWork.searchTag2,
                        serviceWork.searchTag3,
                        serviceWork.searchTag4,
                        serviceWork.searchTag5,
                        serviceWork.isDel,
                        serviceWork.modifiedDate,
                        serviceWork.createdDate                )).from(serviceWork).where(serviceWork.isDel.eq("N"))
                .orderBy(serviceWork.id.asc())
                .fetch();


        return content;
    }
}