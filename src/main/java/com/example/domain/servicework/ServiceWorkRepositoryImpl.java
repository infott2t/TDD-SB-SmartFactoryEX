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
import static com.example.domain.serviceworkstr.QServiceWorkStr.serviceWorkStr;
import static org.springframework.util.StringUtils.hasText;



public class ServiceWorkRepositoryImpl implements ServiceWorkRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    public ServiceWorkRepositoryImpl(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(em);
    }


   @Override
    public Page<ServiceWorkApiDto> searchAllV3(ServiceWorkSearchCondition2 condition2, Pageable pageable) {

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
                        serviceWork.viewCount,
                        serviceWork.likeCount,
                        serviceWork.starCount,
                        serviceWork.starAll,
                        serviceWork.starPairMan,
                        serviceWork.isDel,
                        serviceWork.modifiedDate,
                        serviceWork.createdDate,
                        serviceWork.serviceWorkStr              )).from(serviceWork)
                        .leftJoin(serviceWork.serviceWorkStr, serviceWorkStr)
                .where(
                        searchAllV3Predicate(condition2)
                ).where(serviceWork.isDel.eq("N"))
                .orderBy(serviceWork.id.desc())
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();

        long total = queryFactory
                .select(serviceWork.count())
                .from(serviceWork)
                .where(
                        searchAllV3Predicate(condition2)
                ).where(serviceWork.isDel.eq("N"))
                .fetch().get(0);

        return new PageImpl<>(content, pageable, total);
    }

    private Predicate searchAllV3Predicate(ServiceWorkSearchCondition2 condition2) {
        return new BooleanBuilder()
                        .and(condId(condition2.getId()))
                        .and(condCoopName(condition2.getCoopName()))
                        .and(condCoopComment(condition2.getCoopComment()))
                        .and(condCoopWorkName(condition2.getCoopWorkName()))
                        .and(condWtag1(condition2.getWtag1()))
                        .and(condWtag2(condition2.getWtag2()))
                        .and(condStartWorkDate(condition2.getStartWorkDate()))
                        .and(condEndWorkDate(condition2.getEndWorkDate()))
                        .and(condSearchTag1(condition2.getSearchTag1()))
                        .and(condSearchTag2(condition2.getSearchTag2()))
                        .and(condSearchTag3(condition2.getSearchTag3()))
                        .and(condSearchTag4(condition2.getSearchTag4()))
                        .and(condSearchTag5(condition2.getSearchTag5()))
                        .and(condViewCount(condition2.getViewCount()))
                        .and(condLikeCount(condition2.getLikeCount()))
                        .and(condStarCount(condition2.getStarCount()))
                        .and(condStarAll(condition2.getStarAll()))
                        .and(condStarPairMan(condition2.getStarPairMan()))
                        .and(condIsDel(condition2.getIsDel()))
                        .and(condModifiedDate(condition2.getModifiedDate()))
                        .and(condCreatedDate(condition2.getCreatedDate()))
                        .and(condServiceWorkStrId(condition2.getServiceWorkStrId()))
                .and(condS2(condition2.getField(), condition2.getS()))
                .and(condSdate2(condition2.getSdate()))
                .and(condEdate2(condition2.getEdate()));
    }




    private Predicate condId(String id) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(id)){
            builder.or(serviceWork.id.eq(Long.valueOf(id)));
        }
        return builder;
    }

    private Predicate condCoopName(String coopName) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(coopName)){
            builder.or(serviceWork.coopName.eq(coopName));
        }
        return builder;
    }

    private Predicate condCoopComment(String coopComment) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(coopComment)){
            builder.or(serviceWork.coopComment.eq(coopComment));
        }
        return builder;
    }

    private Predicate condCoopWorkName(String coopWorkName) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(coopWorkName)){
            builder.or(serviceWork.coopWorkName.eq(coopWorkName));
        }
        return builder;
    }

    private Predicate condWtag1(String wtag1) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wtag1)){
            builder.or(serviceWork.wtag1.eq(wtag1));
        }
        return builder;
    }

    private Predicate condWtag2(String wtag2) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wtag2)){
            builder.or(serviceWork.wtag2.eq(wtag2));
        }
        return builder;
    }

    private Predicate condStartWorkDate(String startWorkDate) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(startWorkDate)){
            builder.or(serviceWork.startWorkDate.eq(LocalDateTime.parse(startWorkDate)));
        }
        return builder;
    }

    private Predicate condEndWorkDate(String endWorkDate) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(endWorkDate)){
            builder.or(serviceWork.endWorkDate.eq(LocalDateTime.parse(endWorkDate)));
        }
        return builder;
    }

    private Predicate condSearchTag1(String searchTag1) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(searchTag1)){
            builder.or(serviceWork.searchTag1.eq(searchTag1));
        }
        return builder;
    }

    private Predicate condSearchTag2(String searchTag2) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(searchTag2)){
            builder.or(serviceWork.searchTag2.eq(searchTag2));
        }
        return builder;
    }

    private Predicate condSearchTag3(String searchTag3) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(searchTag3)){
            builder.or(serviceWork.searchTag3.eq(searchTag3));
        }
        return builder;
    }

    private Predicate condSearchTag4(String searchTag4) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(searchTag4)){
            builder.or(serviceWork.searchTag4.eq(searchTag4));
        }
        return builder;
    }

    private Predicate condSearchTag5(String searchTag5) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(searchTag5)){
            builder.or(serviceWork.searchTag5.eq(searchTag5));
        }
        return builder;
    }

    private Predicate condViewCount(String viewCount) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(viewCount)){
            builder.or(serviceWork.viewCount.eq(Long.valueOf(viewCount)));
        }
        return builder;
    }

    private Predicate condLikeCount(String likeCount) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(likeCount)){
            builder.or(serviceWork.likeCount.eq(Long.valueOf(likeCount)));
        }
        return builder;
    }

    private Predicate condStarCount(String starCount) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(starCount)){
            builder.or(serviceWork.starCount.eq(Long.valueOf(starCount)));
        }
        return builder;
    }

    private Predicate condStarAll(String starAll) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(starAll)){
            builder.or(serviceWork.starAll.eq(Long.valueOf(starAll)));
        }
        return builder;
    }

    private Predicate condStarPairMan(String starPairMan) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(starPairMan)){
            builder.or(serviceWork.starPairMan.eq(Long.valueOf(starPairMan)));
        }
        return builder;
    }

    private Predicate condIsDel(String isDel) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(isDel)){
            builder.or(serviceWork.isDel.eq(isDel));
        }
        return builder;
    }

    private Predicate condModifiedDate(String modifiedDate) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(modifiedDate)){
            builder.or(serviceWork.modifiedDate.eq(LocalDateTime.parse(modifiedDate)));
        }
        return builder;
    }

    private Predicate condCreatedDate(String createdDate) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(createdDate)){
            builder.or(serviceWork.createdDate.eq(LocalDateTime.parse(createdDate)));
        }
        return builder;
    }

    private Predicate condServiceWorkStrId (String serviceWorkStrId) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(serviceWorkStrId)){
            builder.or(serviceWork.serviceWorkStr.id.eq(Long.valueOf(serviceWorkStrId)));
        }
        return builder;
    }


    private Predicate condS2(String field, String s) {
        BooleanBuilder builder = new BooleanBuilder();

        if(hasText(field) && hasText(s)){
            if(field.equals("id")){
                builder.or(serviceWork.id.eq(Long.valueOf(s)));
            }
            if(field.equals("coopName")){
                builder.or(serviceWork.coopName.like("%"+s+"%"));
            }
            if(field.equals("coopComment")){
                builder.or(serviceWork.coopComment.like("%"+s+"%"));
            }
            if(field.equals("coopWorkName")){
                builder.or(serviceWork.coopWorkName.like("%"+s+"%"));
            }
            if(field.equals("wtag1")){
                builder.or(serviceWork.wtag1.like("%"+s+"%"));
            }
            if(field.equals("wtag2")){
                builder.or(serviceWork.wtag2.like("%"+s+"%"));
            }
            if(field.equals("startWorkDate")){
                builder.or(serviceWork.startWorkDate.eq(LocalDateTime.parse(s)));
            }
            if(field.equals("endWorkDate")){
                builder.or(serviceWork.endWorkDate.eq(LocalDateTime.parse(s)));
            }
            if(field.equals("searchTag1")){
                builder.or(serviceWork.searchTag1.like("%"+s+"%"));
            }
            if(field.equals("searchTag2")){
                builder.or(serviceWork.searchTag2.like("%"+s+"%"));
            }
            if(field.equals("searchTag3")){
                builder.or(serviceWork.searchTag3.like("%"+s+"%"));
            }
            if(field.equals("searchTag4")){
                builder.or(serviceWork.searchTag4.like("%"+s+"%"));
            }
            if(field.equals("searchTag5")){
                builder.or(serviceWork.searchTag5.like("%"+s+"%"));
            }
            if(field.equals("viewCount")){
                builder.or(serviceWork.viewCount.eq(Long.valueOf(s)));
            }
            if(field.equals("likeCount")){
                builder.or(serviceWork.likeCount.eq(Long.valueOf(s)));
            }
            if(field.equals("starCount")){
                builder.or(serviceWork.starCount.eq(Long.valueOf(s)));
            }
            if(field.equals("starAll")){
                builder.or(serviceWork.starAll.eq(Long.valueOf(s)));
            }
            if(field.equals("starPairMan")){
                builder.or(serviceWork.starPairMan.eq(Long.valueOf(s)));
            }
            if(field.equals("isDel")){
                builder.or(serviceWork.isDel.like("%"+s+"%"));
            }
            if(field.equals("modifiedDate")){
                builder.or(serviceWork.modifiedDate.eq(LocalDateTime.parse(s)));
            }
            if(field.equals("createdDate")){
                builder.or(serviceWork.createdDate.eq(LocalDateTime.parse(s)));
            }
            if(field.equals("serviceWorkStrId")){
                builder.or(serviceWork.serviceWorkStr.id.eq(Long.valueOf(s)));
            }
        }
        return builder;
    }

    private Predicate condSdate2(String sdate) {
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
    private Predicate condEdate2(String edate) {
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
                        serviceWork.viewCount,
                        serviceWork.likeCount,
                        serviceWork.starCount,
                        serviceWork.starAll,
                        serviceWork.starPairMan,
                        serviceWork.isDel,
                        serviceWork.modifiedDate,
                        serviceWork.createdDate,
                        serviceWork.serviceWorkStr              )).from(serviceWork)
                        .leftJoin(serviceWork.serviceWorkStr, serviceWorkStr)
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

    private Predicate condS(String field, String s) {
        BooleanBuilder builder = new BooleanBuilder();

        if(hasText(field) && hasText(s)){
            if(field.equals("id")){
                builder.or(serviceWork.id.eq(Long.valueOf(s)));
            }
            if(field.equals("coopName")){
                builder.or(serviceWork.coopName.like("%"+s+"%"));
            }
            if(field.equals("coopComment")){
                builder.or(serviceWork.coopComment.like("%"+s+"%"));
            }
            if(field.equals("coopWorkName")){
                builder.or(serviceWork.coopWorkName.like("%"+s+"%"));
            }
            if(field.equals("wtag1")){
                builder.or(serviceWork.wtag1.like("%"+s+"%"));
            }
            if(field.equals("wtag2")){
                builder.or(serviceWork.wtag2.like("%"+s+"%"));
            }
            if(field.equals("startWorkDate")){
                builder.or(serviceWork.startWorkDate.eq(LocalDateTime.parse(s)));
            }
            if(field.equals("endWorkDate")){
                builder.or(serviceWork.endWorkDate.eq(LocalDateTime.parse(s)));
            }
            if(field.equals("searchTag1")){
                builder.or(serviceWork.searchTag1.like("%"+s+"%"));
            }
            if(field.equals("searchTag2")){
                builder.or(serviceWork.searchTag2.like("%"+s+"%"));
            }
            if(field.equals("searchTag3")){
                builder.or(serviceWork.searchTag3.like("%"+s+"%"));
            }
            if(field.equals("searchTag4")){
                builder.or(serviceWork.searchTag4.like("%"+s+"%"));
            }
            if(field.equals("searchTag5")){
                builder.or(serviceWork.searchTag5.like("%"+s+"%"));
            }
            if(field.equals("viewCount")){
                builder.or(serviceWork.viewCount.eq(Long.valueOf(s)));
            }
            if(field.equals("likeCount")){
                builder.or(serviceWork.likeCount.eq(Long.valueOf(s)));
            }
            if(field.equals("starCount")){
                builder.or(serviceWork.starCount.eq(Long.valueOf(s)));
            }
            if(field.equals("starAll")){
                builder.or(serviceWork.starAll.eq(Long.valueOf(s)));
            }
            if(field.equals("starPairMan")){
                builder.or(serviceWork.starPairMan.eq(Long.valueOf(s)));
            }
            if(field.equals("isDel")){
                builder.or(serviceWork.isDel.like("%"+s+"%"));
            }
            if(field.equals("modifiedDate")){
                builder.or(serviceWork.modifiedDate.eq(LocalDateTime.parse(s)));
            }
            if(field.equals("createdDate")){
                builder.or(serviceWork.createdDate.eq(LocalDateTime.parse(s)));
            }
            if(field.equals("serviceWorkStrId")){
                builder.or(serviceWork.serviceWorkStr.id.eq(Long.valueOf(s)));
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
                        serviceWork.viewCount,
                        serviceWork.likeCount,
                        serviceWork.starCount,
                        serviceWork.starAll,
                        serviceWork.starPairMan,
                        serviceWork.isDel,
                        serviceWork.modifiedDate,
                        serviceWork.createdDate,
                        serviceWork.serviceWorkStr              )).from(serviceWork).where(serviceWork.isDel.eq("N"))
                        .leftJoin(serviceWork.serviceWorkStr, serviceWorkStr)
                .orderBy(serviceWork.id.asc())
                .fetch();


        return content;
    }
}