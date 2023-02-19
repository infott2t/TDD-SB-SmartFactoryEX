package com.example.domain.serviceworkstr;
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

import static com.example.domain.serviceworkstr.QServiceWorkStr.serviceWorkStr;
import static org.springframework.util.StringUtils.hasText;



public class ServiceWorkStrRepositoryImpl implements ServiceWorkStrRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    public ServiceWorkStrRepositoryImpl(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(em);
    }


   @Override
    public Page<ServiceWorkStrApiDto> searchAllV3(ServiceWorkStrSearchCondition2 condition2, Pageable pageable) {

        List<ServiceWorkStrApiDto> content = queryFactory.
                select(Projections.constructor(ServiceWorkStrApiDto.class,
                        serviceWorkStr.id,
                        serviceWorkStr.wStr1,
                        serviceWorkStr.wStr2,
                        serviceWorkStr.wStr3,
                        serviceWorkStr.wStr4,
                        serviceWorkStr.wStr5,
                        serviceWorkStr.wStr6,
                        serviceWorkStr.wStr7,
                        serviceWorkStr.wStr8,
                        serviceWorkStr.wStr9,
                        serviceWorkStr.wStr10,
                        serviceWorkStr.wStr11,
                        serviceWorkStr.wStr12,
                        serviceWorkStr.wStr13,
                        serviceWorkStr.wStr14,
                        serviceWorkStr.wStr15,
                        serviceWorkStr.wStr16,
                        serviceWorkStr.wStr17,
                        serviceWorkStr.wStr18,
                        serviceWorkStr.wStr19,
                        serviceWorkStr.wStr20,
                        serviceWorkStr.wStr21,
                        serviceWorkStr.wStr22,
                        serviceWorkStr.wStr23,
                        serviceWorkStr.wStr24,
                        serviceWorkStr.wStr25,
                        serviceWorkStr.wStr26,
                        serviceWorkStr.wStr27,
                        serviceWorkStr.wStr28,
                        serviceWorkStr.wStr29,
                        serviceWorkStr.wStr30,
                        serviceWorkStr.wStr31,
                        serviceWorkStr.wStr32,
                        serviceWorkStr.wStr33,
                        serviceWorkStr.wStr34,
                        serviceWorkStr.wStr35,
                        serviceWorkStr.wStr36,
                        serviceWorkStr.wStr37,
                        serviceWorkStr.wStr38,
                        serviceWorkStr.wStr39,
                        serviceWorkStr.wStr40,
                        serviceWorkStr.wStr41,
                        serviceWorkStr.wStr42,
                        serviceWorkStr.wStr43,
                        serviceWorkStr.wStr44,
                        serviceWorkStr.wStr45,
                        serviceWorkStr.wStr46,
                        serviceWorkStr.wStr47,
                        serviceWorkStr.wStr48,
                        serviceWorkStr.wStr49,
                        serviceWorkStr.wStr50,
                        serviceWorkStr.isDel,
                        serviceWorkStr.modifiedDate,
                        serviceWorkStr.createdDate              )).from(serviceWorkStr)
                .where(
                        searchAllV3Predicate(condition2)
                ).where(serviceWorkStr.isDel.eq("N"))
                .orderBy(serviceWorkStr.id.desc())
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();

        long total = queryFactory
                .select(serviceWorkStr.count())
                .from(serviceWorkStr)
                .where(
                        searchAllV3Predicate(condition2)
                ).where(serviceWorkStr.isDel.eq("N"))
                .fetch().get(0);

        return new PageImpl<>(content, pageable, total);
    }

    private Predicate searchAllV3Predicate(ServiceWorkStrSearchCondition2 condition2) {
        return new BooleanBuilder()
                        .and(condId(condition2.getId()))
                        .and(condWStr1(condition2.getWStr1()))
                        .and(condWStr2(condition2.getWStr2()))
                        .and(condWStr3(condition2.getWStr3()))
                        .and(condWStr4(condition2.getWStr4()))
                        .and(condWStr5(condition2.getWStr5()))
                        .and(condWStr6(condition2.getWStr6()))
                        .and(condWStr7(condition2.getWStr7()))
                        .and(condWStr8(condition2.getWStr8()))
                        .and(condWStr9(condition2.getWStr9()))
                        .and(condWStr10(condition2.getWStr10()))
                        .and(condWStr11(condition2.getWStr11()))
                        .and(condWStr12(condition2.getWStr12()))
                        .and(condWStr13(condition2.getWStr13()))
                        .and(condWStr14(condition2.getWStr14()))
                        .and(condWStr15(condition2.getWStr15()))
                        .and(condWStr16(condition2.getWStr16()))
                        .and(condWStr17(condition2.getWStr17()))
                        .and(condWStr18(condition2.getWStr18()))
                        .and(condWStr19(condition2.getWStr19()))
                        .and(condWStr20(condition2.getWStr20()))
                        .and(condWStr21(condition2.getWStr21()))
                        .and(condWStr22(condition2.getWStr22()))
                        .and(condWStr23(condition2.getWStr23()))
                        .and(condWStr24(condition2.getWStr24()))
                        .and(condWStr25(condition2.getWStr25()))
                        .and(condWStr26(condition2.getWStr26()))
                        .and(condWStr27(condition2.getWStr27()))
                        .and(condWStr28(condition2.getWStr28()))
                        .and(condWStr29(condition2.getWStr29()))
                        .and(condWStr30(condition2.getWStr30()))
                        .and(condWStr31(condition2.getWStr31()))
                        .and(condWStr32(condition2.getWStr32()))
                        .and(condWStr33(condition2.getWStr33()))
                        .and(condWStr34(condition2.getWStr34()))
                        .and(condWStr35(condition2.getWStr35()))
                        .and(condWStr36(condition2.getWStr36()))
                        .and(condWStr37(condition2.getWStr37()))
                        .and(condWStr38(condition2.getWStr38()))
                        .and(condWStr39(condition2.getWStr39()))
                        .and(condWStr40(condition2.getWStr40()))
                        .and(condWStr41(condition2.getWStr41()))
                        .and(condWStr42(condition2.getWStr42()))
                        .and(condWStr43(condition2.getWStr43()))
                        .and(condWStr44(condition2.getWStr44()))
                        .and(condWStr45(condition2.getWStr45()))
                        .and(condWStr46(condition2.getWStr46()))
                        .and(condWStr47(condition2.getWStr47()))
                        .and(condWStr48(condition2.getWStr48()))
                        .and(condWStr49(condition2.getWStr49()))
                        .and(condWStr50(condition2.getWStr50()))
                        .and(condIsDel(condition2.getIsDel()))
                        .and(condModifiedDate(condition2.getModifiedDate()))
                        .and(condCreatedDate(condition2.getCreatedDate()))
                .and(condS2(condition2.getField(), condition2.getS()))
                .and(condSdate2(condition2.getSdate()))
                .and(condEdate2(condition2.getEdate()));
    }




    private Predicate condId(String id) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(id)){
            builder.or(serviceWorkStr.id.eq(Long.valueOf(id)));
        }
        return builder;
    }

    private Predicate condWStr1(String wStr1) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr1)){
            builder.or(serviceWorkStr.wStr1.eq(wStr1));
        }
        return builder;
    }

    private Predicate condWStr2(String wStr2) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr2)){
            builder.or(serviceWorkStr.wStr2.eq(wStr2));
        }
        return builder;
    }

    private Predicate condWStr3(String wStr3) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr3)){
            builder.or(serviceWorkStr.wStr3.eq(wStr3));
        }
        return builder;
    }

    private Predicate condWStr4(String wStr4) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr4)){
            builder.or(serviceWorkStr.wStr4.eq(wStr4));
        }
        return builder;
    }

    private Predicate condWStr5(String wStr5) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr5)){
            builder.or(serviceWorkStr.wStr5.eq(wStr5));
        }
        return builder;
    }

    private Predicate condWStr6(String wStr6) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr6)){
            builder.or(serviceWorkStr.wStr6.eq(wStr6));
        }
        return builder;
    }

    private Predicate condWStr7(String wStr7) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr7)){
            builder.or(serviceWorkStr.wStr7.eq(wStr7));
        }
        return builder;
    }

    private Predicate condWStr8(String wStr8) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr8)){
            builder.or(serviceWorkStr.wStr8.eq(wStr8));
        }
        return builder;
    }

    private Predicate condWStr9(String wStr9) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr9)){
            builder.or(serviceWorkStr.wStr9.eq(wStr9));
        }
        return builder;
    }

    private Predicate condWStr10(String wStr10) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr10)){
            builder.or(serviceWorkStr.wStr10.eq(wStr10));
        }
        return builder;
    }

    private Predicate condWStr11(String wStr11) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr11)){
            builder.or(serviceWorkStr.wStr11.eq(wStr11));
        }
        return builder;
    }

    private Predicate condWStr12(String wStr12) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr12)){
            builder.or(serviceWorkStr.wStr12.eq(wStr12));
        }
        return builder;
    }

    private Predicate condWStr13(String wStr13) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr13)){
            builder.or(serviceWorkStr.wStr13.eq(wStr13));
        }
        return builder;
    }

    private Predicate condWStr14(String wStr14) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr14)){
            builder.or(serviceWorkStr.wStr14.eq(wStr14));
        }
        return builder;
    }

    private Predicate condWStr15(String wStr15) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr15)){
            builder.or(serviceWorkStr.wStr15.eq(wStr15));
        }
        return builder;
    }

    private Predicate condWStr16(String wStr16) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr16)){
            builder.or(serviceWorkStr.wStr16.eq(wStr16));
        }
        return builder;
    }

    private Predicate condWStr17(String wStr17) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr17)){
            builder.or(serviceWorkStr.wStr17.eq(wStr17));
        }
        return builder;
    }

    private Predicate condWStr18(String wStr18) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr18)){
            builder.or(serviceWorkStr.wStr18.eq(wStr18));
        }
        return builder;
    }

    private Predicate condWStr19(String wStr19) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr19)){
            builder.or(serviceWorkStr.wStr19.eq(wStr19));
        }
        return builder;
    }

    private Predicate condWStr20(String wStr20) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr20)){
            builder.or(serviceWorkStr.wStr20.eq(wStr20));
        }
        return builder;
    }

    private Predicate condWStr21(String wStr21) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr21)){
            builder.or(serviceWorkStr.wStr21.eq(wStr21));
        }
        return builder;
    }

    private Predicate condWStr22(String wStr22) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr22)){
            builder.or(serviceWorkStr.wStr22.eq(wStr22));
        }
        return builder;
    }

    private Predicate condWStr23(String wStr23) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr23)){
            builder.or(serviceWorkStr.wStr23.eq(wStr23));
        }
        return builder;
    }

    private Predicate condWStr24(String wStr24) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr24)){
            builder.or(serviceWorkStr.wStr24.eq(wStr24));
        }
        return builder;
    }

    private Predicate condWStr25(String wStr25) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr25)){
            builder.or(serviceWorkStr.wStr25.eq(wStr25));
        }
        return builder;
    }

    private Predicate condWStr26(String wStr26) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr26)){
            builder.or(serviceWorkStr.wStr26.eq(wStr26));
        }
        return builder;
    }

    private Predicate condWStr27(String wStr27) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr27)){
            builder.or(serviceWorkStr.wStr27.eq(wStr27));
        }
        return builder;
    }

    private Predicate condWStr28(String wStr28) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr28)){
            builder.or(serviceWorkStr.wStr28.eq(wStr28));
        }
        return builder;
    }

    private Predicate condWStr29(String wStr29) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr29)){
            builder.or(serviceWorkStr.wStr29.eq(wStr29));
        }
        return builder;
    }

    private Predicate condWStr30(String wStr30) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr30)){
            builder.or(serviceWorkStr.wStr30.eq(wStr30));
        }
        return builder;
    }

    private Predicate condWStr31(String wStr31) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr31)){
            builder.or(serviceWorkStr.wStr31.eq(wStr31));
        }
        return builder;
    }

    private Predicate condWStr32(String wStr32) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr32)){
            builder.or(serviceWorkStr.wStr32.eq(wStr32));
        }
        return builder;
    }

    private Predicate condWStr33(String wStr33) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr33)){
            builder.or(serviceWorkStr.wStr33.eq(wStr33));
        }
        return builder;
    }

    private Predicate condWStr34(String wStr34) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr34)){
            builder.or(serviceWorkStr.wStr34.eq(wStr34));
        }
        return builder;
    }

    private Predicate condWStr35(String wStr35) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr35)){
            builder.or(serviceWorkStr.wStr35.eq(wStr35));
        }
        return builder;
    }

    private Predicate condWStr36(String wStr36) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr36)){
            builder.or(serviceWorkStr.wStr36.eq(wStr36));
        }
        return builder;
    }

    private Predicate condWStr37(String wStr37) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr37)){
            builder.or(serviceWorkStr.wStr37.eq(wStr37));
        }
        return builder;
    }

    private Predicate condWStr38(String wStr38) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr38)){
            builder.or(serviceWorkStr.wStr38.eq(wStr38));
        }
        return builder;
    }

    private Predicate condWStr39(String wStr39) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr39)){
            builder.or(serviceWorkStr.wStr39.eq(wStr39));
        }
        return builder;
    }

    private Predicate condWStr40(String wStr40) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr40)){
            builder.or(serviceWorkStr.wStr40.eq(wStr40));
        }
        return builder;
    }

    private Predicate condWStr41(String wStr41) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr41)){
            builder.or(serviceWorkStr.wStr41.eq(wStr41));
        }
        return builder;
    }

    private Predicate condWStr42(String wStr42) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr42)){
            builder.or(serviceWorkStr.wStr42.eq(wStr42));
        }
        return builder;
    }

    private Predicate condWStr43(String wStr43) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr43)){
            builder.or(serviceWorkStr.wStr43.eq(wStr43));
        }
        return builder;
    }

    private Predicate condWStr44(String wStr44) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr44)){
            builder.or(serviceWorkStr.wStr44.eq(wStr44));
        }
        return builder;
    }

    private Predicate condWStr45(String wStr45) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr45)){
            builder.or(serviceWorkStr.wStr45.eq(wStr45));
        }
        return builder;
    }

    private Predicate condWStr46(String wStr46) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr46)){
            builder.or(serviceWorkStr.wStr46.eq(wStr46));
        }
        return builder;
    }

    private Predicate condWStr47(String wStr47) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr47)){
            builder.or(serviceWorkStr.wStr47.eq(wStr47));
        }
        return builder;
    }

    private Predicate condWStr48(String wStr48) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr48)){
            builder.or(serviceWorkStr.wStr48.eq(wStr48));
        }
        return builder;
    }

    private Predicate condWStr49(String wStr49) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr49)){
            builder.or(serviceWorkStr.wStr49.eq(wStr49));
        }
        return builder;
    }

    private Predicate condWStr50(String wStr50) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(wStr50)){
            builder.or(serviceWorkStr.wStr50.eq(wStr50));
        }
        return builder;
    }

    private Predicate condIsDel(String isDel) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(isDel)){
            builder.or(serviceWorkStr.isDel.eq(isDel));
        }
        return builder;
    }

    private Predicate condModifiedDate(String modifiedDate) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(modifiedDate)){
            builder.or(serviceWorkStr.modifiedDate.eq(LocalDateTime.parse(modifiedDate)));
        }
        return builder;
    }

    private Predicate condCreatedDate(String createdDate) {
        BooleanBuilder builder = new BooleanBuilder();
        if(hasText(createdDate)){
            builder.or(serviceWorkStr.createdDate.eq(LocalDateTime.parse(createdDate)));
        }
        return builder;
    }


    private Predicate condS2(String field, String s) {
        BooleanBuilder builder = new BooleanBuilder();

        if(hasText(field) && hasText(s)){
            if(field.equals("id")){
                builder.or(serviceWorkStr.id.eq(Long.valueOf(s)));
            }
            if(field.equals("wStr1")){
                builder.or(serviceWorkStr.wStr1.like("%"+s+"%"));
            }
            if(field.equals("wStr2")){
                builder.or(serviceWorkStr.wStr2.like("%"+s+"%"));
            }
            if(field.equals("wStr3")){
                builder.or(serviceWorkStr.wStr3.like("%"+s+"%"));
            }
            if(field.equals("wStr4")){
                builder.or(serviceWorkStr.wStr4.like("%"+s+"%"));
            }
            if(field.equals("wStr5")){
                builder.or(serviceWorkStr.wStr5.like("%"+s+"%"));
            }
            if(field.equals("wStr6")){
                builder.or(serviceWorkStr.wStr6.like("%"+s+"%"));
            }
            if(field.equals("wStr7")){
                builder.or(serviceWorkStr.wStr7.like("%"+s+"%"));
            }
            if(field.equals("wStr8")){
                builder.or(serviceWorkStr.wStr8.like("%"+s+"%"));
            }
            if(field.equals("wStr9")){
                builder.or(serviceWorkStr.wStr9.like("%"+s+"%"));
            }
            if(field.equals("wStr10")){
                builder.or(serviceWorkStr.wStr10.like("%"+s+"%"));
            }
            if(field.equals("wStr11")){
                builder.or(serviceWorkStr.wStr11.like("%"+s+"%"));
            }
            if(field.equals("wStr12")){
                builder.or(serviceWorkStr.wStr12.like("%"+s+"%"));
            }
            if(field.equals("wStr13")){
                builder.or(serviceWorkStr.wStr13.like("%"+s+"%"));
            }
            if(field.equals("wStr14")){
                builder.or(serviceWorkStr.wStr14.like("%"+s+"%"));
            }
            if(field.equals("wStr15")){
                builder.or(serviceWorkStr.wStr15.like("%"+s+"%"));
            }
            if(field.equals("wStr16")){
                builder.or(serviceWorkStr.wStr16.like("%"+s+"%"));
            }
            if(field.equals("wStr17")){
                builder.or(serviceWorkStr.wStr17.like("%"+s+"%"));
            }
            if(field.equals("wStr18")){
                builder.or(serviceWorkStr.wStr18.like("%"+s+"%"));
            }
            if(field.equals("wStr19")){
                builder.or(serviceWorkStr.wStr19.like("%"+s+"%"));
            }
            if(field.equals("wStr20")){
                builder.or(serviceWorkStr.wStr20.like("%"+s+"%"));
            }
            if(field.equals("wStr21")){
                builder.or(serviceWorkStr.wStr21.like("%"+s+"%"));
            }
            if(field.equals("wStr22")){
                builder.or(serviceWorkStr.wStr22.like("%"+s+"%"));
            }
            if(field.equals("wStr23")){
                builder.or(serviceWorkStr.wStr23.like("%"+s+"%"));
            }
            if(field.equals("wStr24")){
                builder.or(serviceWorkStr.wStr24.like("%"+s+"%"));
            }
            if(field.equals("wStr25")){
                builder.or(serviceWorkStr.wStr25.like("%"+s+"%"));
            }
            if(field.equals("wStr26")){
                builder.or(serviceWorkStr.wStr26.like("%"+s+"%"));
            }
            if(field.equals("wStr27")){
                builder.or(serviceWorkStr.wStr27.like("%"+s+"%"));
            }
            if(field.equals("wStr28")){
                builder.or(serviceWorkStr.wStr28.like("%"+s+"%"));
            }
            if(field.equals("wStr29")){
                builder.or(serviceWorkStr.wStr29.like("%"+s+"%"));
            }
            if(field.equals("wStr30")){
                builder.or(serviceWorkStr.wStr30.like("%"+s+"%"));
            }
            if(field.equals("wStr31")){
                builder.or(serviceWorkStr.wStr31.like("%"+s+"%"));
            }
            if(field.equals("wStr32")){
                builder.or(serviceWorkStr.wStr32.like("%"+s+"%"));
            }
            if(field.equals("wStr33")){
                builder.or(serviceWorkStr.wStr33.like("%"+s+"%"));
            }
            if(field.equals("wStr34")){
                builder.or(serviceWorkStr.wStr34.like("%"+s+"%"));
            }
            if(field.equals("wStr35")){
                builder.or(serviceWorkStr.wStr35.like("%"+s+"%"));
            }
            if(field.equals("wStr36")){
                builder.or(serviceWorkStr.wStr36.like("%"+s+"%"));
            }
            if(field.equals("wStr37")){
                builder.or(serviceWorkStr.wStr37.like("%"+s+"%"));
            }
            if(field.equals("wStr38")){
                builder.or(serviceWorkStr.wStr38.like("%"+s+"%"));
            }
            if(field.equals("wStr39")){
                builder.or(serviceWorkStr.wStr39.like("%"+s+"%"));
            }
            if(field.equals("wStr40")){
                builder.or(serviceWorkStr.wStr40.like("%"+s+"%"));
            }
            if(field.equals("wStr41")){
                builder.or(serviceWorkStr.wStr41.like("%"+s+"%"));
            }
            if(field.equals("wStr42")){
                builder.or(serviceWorkStr.wStr42.like("%"+s+"%"));
            }
            if(field.equals("wStr43")){
                builder.or(serviceWorkStr.wStr43.like("%"+s+"%"));
            }
            if(field.equals("wStr44")){
                builder.or(serviceWorkStr.wStr44.like("%"+s+"%"));
            }
            if(field.equals("wStr45")){
                builder.or(serviceWorkStr.wStr45.like("%"+s+"%"));
            }
            if(field.equals("wStr46")){
                builder.or(serviceWorkStr.wStr46.like("%"+s+"%"));
            }
            if(field.equals("wStr47")){
                builder.or(serviceWorkStr.wStr47.like("%"+s+"%"));
            }
            if(field.equals("wStr48")){
                builder.or(serviceWorkStr.wStr48.like("%"+s+"%"));
            }
            if(field.equals("wStr49")){
                builder.or(serviceWorkStr.wStr49.like("%"+s+"%"));
            }
            if(field.equals("wStr50")){
                builder.or(serviceWorkStr.wStr50.like("%"+s+"%"));
            }
            if(field.equals("isDel")){
                builder.or(serviceWorkStr.isDel.like("%"+s+"%"));
            }
            if(field.equals("modifiedDate")){
                builder.or(serviceWorkStr.modifiedDate.eq(LocalDateTime.parse(s)));
            }
            if(field.equals("createdDate")){
                builder.or(serviceWorkStr.createdDate.eq(LocalDateTime.parse(s)));
            }
        }
        return builder;
    }

    private Predicate condSdate2(String sdate) {
        BooleanBuilder builder = new BooleanBuilder();

        if(hasText(sdate)){
            try {
                LocalDateTime localDateTime = LocalDateTime.parse(sdate + "T00:00:00");
                builder.or(serviceWorkStr.modifiedDate.goe(localDateTime)); // isrtDate >= sdate

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
                builder.or(serviceWorkStr.modifiedDate.loe(localDateTime)); // isrtDate <= edate

            } catch (DateTimeParseException e) {
            }
        }
        return builder;
    }


    @Override
    public Page<ServiceWorkStrApiDto> searchAllV2(ServiceWorkStrSearchCondition condition, Pageable pageable) {

        List<ServiceWorkStrApiDto> content = queryFactory.
                select(Projections.constructor(ServiceWorkStrApiDto.class,
                        serviceWorkStr.id,
                        serviceWorkStr.wStr1,
                        serviceWorkStr.wStr2,
                        serviceWorkStr.wStr3,
                        serviceWorkStr.wStr4,
                        serviceWorkStr.wStr5,
                        serviceWorkStr.wStr6,
                        serviceWorkStr.wStr7,
                        serviceWorkStr.wStr8,
                        serviceWorkStr.wStr9,
                        serviceWorkStr.wStr10,
                        serviceWorkStr.wStr11,
                        serviceWorkStr.wStr12,
                        serviceWorkStr.wStr13,
                        serviceWorkStr.wStr14,
                        serviceWorkStr.wStr15,
                        serviceWorkStr.wStr16,
                        serviceWorkStr.wStr17,
                        serviceWorkStr.wStr18,
                        serviceWorkStr.wStr19,
                        serviceWorkStr.wStr20,
                        serviceWorkStr.wStr21,
                        serviceWorkStr.wStr22,
                        serviceWorkStr.wStr23,
                        serviceWorkStr.wStr24,
                        serviceWorkStr.wStr25,
                        serviceWorkStr.wStr26,
                        serviceWorkStr.wStr27,
                        serviceWorkStr.wStr28,
                        serviceWorkStr.wStr29,
                        serviceWorkStr.wStr30,
                        serviceWorkStr.wStr31,
                        serviceWorkStr.wStr32,
                        serviceWorkStr.wStr33,
                        serviceWorkStr.wStr34,
                        serviceWorkStr.wStr35,
                        serviceWorkStr.wStr36,
                        serviceWorkStr.wStr37,
                        serviceWorkStr.wStr38,
                        serviceWorkStr.wStr39,
                        serviceWorkStr.wStr40,
                        serviceWorkStr.wStr41,
                        serviceWorkStr.wStr42,
                        serviceWorkStr.wStr43,
                        serviceWorkStr.wStr44,
                        serviceWorkStr.wStr45,
                        serviceWorkStr.wStr46,
                        serviceWorkStr.wStr47,
                        serviceWorkStr.wStr48,
                        serviceWorkStr.wStr49,
                        serviceWorkStr.wStr50,
                        serviceWorkStr.isDel,
                        serviceWorkStr.modifiedDate,
                        serviceWorkStr.createdDate              )).from(serviceWorkStr)
                .where(
                        searchAllV2Predicate(condition)
                ).where(serviceWorkStr.isDel.eq("N"))
                .orderBy(serviceWorkStr.id.desc())
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();

        long total = queryFactory
                .select(serviceWorkStr.count())
                .from(serviceWorkStr)
                .where(
                        searchAllV2Predicate(condition)
                ).where(serviceWorkStr.isDel.eq("N"))
                .fetch().get(0);

        return new PageImpl<>(content, pageable, total);
    }





    private BooleanBuilder searchAllV2Predicate(ServiceWorkStrSearchCondition condition){
        return new BooleanBuilder()
                .and(condS(condition.getField(), condition.getS()))
                .and(condSdate(condition.getSdate()))
                .and(condEdate(condition.getEdate()));

    }

    private Predicate condS(String field, String s) {
        BooleanBuilder builder = new BooleanBuilder();

        if(hasText(field) && hasText(s)){
            if(field.equals("id")){
                builder.or(serviceWorkStr.id.eq(Long.valueOf(s)));
            }
            if(field.equals("wStr1")){
                builder.or(serviceWorkStr.wStr1.like("%"+s+"%"));
            }
            if(field.equals("wStr2")){
                builder.or(serviceWorkStr.wStr2.like("%"+s+"%"));
            }
            if(field.equals("wStr3")){
                builder.or(serviceWorkStr.wStr3.like("%"+s+"%"));
            }
            if(field.equals("wStr4")){
                builder.or(serviceWorkStr.wStr4.like("%"+s+"%"));
            }
            if(field.equals("wStr5")){
                builder.or(serviceWorkStr.wStr5.like("%"+s+"%"));
            }
            if(field.equals("wStr6")){
                builder.or(serviceWorkStr.wStr6.like("%"+s+"%"));
            }
            if(field.equals("wStr7")){
                builder.or(serviceWorkStr.wStr7.like("%"+s+"%"));
            }
            if(field.equals("wStr8")){
                builder.or(serviceWorkStr.wStr8.like("%"+s+"%"));
            }
            if(field.equals("wStr9")){
                builder.or(serviceWorkStr.wStr9.like("%"+s+"%"));
            }
            if(field.equals("wStr10")){
                builder.or(serviceWorkStr.wStr10.like("%"+s+"%"));
            }
            if(field.equals("wStr11")){
                builder.or(serviceWorkStr.wStr11.like("%"+s+"%"));
            }
            if(field.equals("wStr12")){
                builder.or(serviceWorkStr.wStr12.like("%"+s+"%"));
            }
            if(field.equals("wStr13")){
                builder.or(serviceWorkStr.wStr13.like("%"+s+"%"));
            }
            if(field.equals("wStr14")){
                builder.or(serviceWorkStr.wStr14.like("%"+s+"%"));
            }
            if(field.equals("wStr15")){
                builder.or(serviceWorkStr.wStr15.like("%"+s+"%"));
            }
            if(field.equals("wStr16")){
                builder.or(serviceWorkStr.wStr16.like("%"+s+"%"));
            }
            if(field.equals("wStr17")){
                builder.or(serviceWorkStr.wStr17.like("%"+s+"%"));
            }
            if(field.equals("wStr18")){
                builder.or(serviceWorkStr.wStr18.like("%"+s+"%"));
            }
            if(field.equals("wStr19")){
                builder.or(serviceWorkStr.wStr19.like("%"+s+"%"));
            }
            if(field.equals("wStr20")){
                builder.or(serviceWorkStr.wStr20.like("%"+s+"%"));
            }
            if(field.equals("wStr21")){
                builder.or(serviceWorkStr.wStr21.like("%"+s+"%"));
            }
            if(field.equals("wStr22")){
                builder.or(serviceWorkStr.wStr22.like("%"+s+"%"));
            }
            if(field.equals("wStr23")){
                builder.or(serviceWorkStr.wStr23.like("%"+s+"%"));
            }
            if(field.equals("wStr24")){
                builder.or(serviceWorkStr.wStr24.like("%"+s+"%"));
            }
            if(field.equals("wStr25")){
                builder.or(serviceWorkStr.wStr25.like("%"+s+"%"));
            }
            if(field.equals("wStr26")){
                builder.or(serviceWorkStr.wStr26.like("%"+s+"%"));
            }
            if(field.equals("wStr27")){
                builder.or(serviceWorkStr.wStr27.like("%"+s+"%"));
            }
            if(field.equals("wStr28")){
                builder.or(serviceWorkStr.wStr28.like("%"+s+"%"));
            }
            if(field.equals("wStr29")){
                builder.or(serviceWorkStr.wStr29.like("%"+s+"%"));
            }
            if(field.equals("wStr30")){
                builder.or(serviceWorkStr.wStr30.like("%"+s+"%"));
            }
            if(field.equals("wStr31")){
                builder.or(serviceWorkStr.wStr31.like("%"+s+"%"));
            }
            if(field.equals("wStr32")){
                builder.or(serviceWorkStr.wStr32.like("%"+s+"%"));
            }
            if(field.equals("wStr33")){
                builder.or(serviceWorkStr.wStr33.like("%"+s+"%"));
            }
            if(field.equals("wStr34")){
                builder.or(serviceWorkStr.wStr34.like("%"+s+"%"));
            }
            if(field.equals("wStr35")){
                builder.or(serviceWorkStr.wStr35.like("%"+s+"%"));
            }
            if(field.equals("wStr36")){
                builder.or(serviceWorkStr.wStr36.like("%"+s+"%"));
            }
            if(field.equals("wStr37")){
                builder.or(serviceWorkStr.wStr37.like("%"+s+"%"));
            }
            if(field.equals("wStr38")){
                builder.or(serviceWorkStr.wStr38.like("%"+s+"%"));
            }
            if(field.equals("wStr39")){
                builder.or(serviceWorkStr.wStr39.like("%"+s+"%"));
            }
            if(field.equals("wStr40")){
                builder.or(serviceWorkStr.wStr40.like("%"+s+"%"));
            }
            if(field.equals("wStr41")){
                builder.or(serviceWorkStr.wStr41.like("%"+s+"%"));
            }
            if(field.equals("wStr42")){
                builder.or(serviceWorkStr.wStr42.like("%"+s+"%"));
            }
            if(field.equals("wStr43")){
                builder.or(serviceWorkStr.wStr43.like("%"+s+"%"));
            }
            if(field.equals("wStr44")){
                builder.or(serviceWorkStr.wStr44.like("%"+s+"%"));
            }
            if(field.equals("wStr45")){
                builder.or(serviceWorkStr.wStr45.like("%"+s+"%"));
            }
            if(field.equals("wStr46")){
                builder.or(serviceWorkStr.wStr46.like("%"+s+"%"));
            }
            if(field.equals("wStr47")){
                builder.or(serviceWorkStr.wStr47.like("%"+s+"%"));
            }
            if(field.equals("wStr48")){
                builder.or(serviceWorkStr.wStr48.like("%"+s+"%"));
            }
            if(field.equals("wStr49")){
                builder.or(serviceWorkStr.wStr49.like("%"+s+"%"));
            }
            if(field.equals("wStr50")){
                builder.or(serviceWorkStr.wStr50.like("%"+s+"%"));
            }
            if(field.equals("isDel")){
                builder.or(serviceWorkStr.isDel.like("%"+s+"%"));
            }
            if(field.equals("modifiedDate")){
                builder.or(serviceWorkStr.modifiedDate.eq(LocalDateTime.parse(s)));
            }
            if(field.equals("createdDate")){
                builder.or(serviceWorkStr.createdDate.eq(LocalDateTime.parse(s)));
            }
        }
        return builder;
    }

    private Predicate condSdate( String sdate){
        BooleanBuilder builder = new BooleanBuilder();

        if(hasText(sdate)){
            try {
                LocalDateTime localDateTime = LocalDateTime.parse(sdate + "T00:00:00");
                builder.or(serviceWorkStr.modifiedDate.goe(localDateTime)); // isrtDate >= sdate

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
                builder.or(serviceWorkStr.modifiedDate.loe(localDateTime)); // isrtDate <= edate

            } catch (DateTimeParseException e) {
            }
        }
        return builder;
    }



    @Override
    public List<ServiceWorkStrApiDto> searchFindAllDesc() {
        List<ServiceWorkStrApiDto> content = queryFactory.
                select(Projections.constructor(ServiceWorkStrApiDto.class,
                        serviceWorkStr.id,
                        serviceWorkStr.wStr1,
                        serviceWorkStr.wStr2,
                        serviceWorkStr.wStr3,
                        serviceWorkStr.wStr4,
                        serviceWorkStr.wStr5,
                        serviceWorkStr.wStr6,
                        serviceWorkStr.wStr7,
                        serviceWorkStr.wStr8,
                        serviceWorkStr.wStr9,
                        serviceWorkStr.wStr10,
                        serviceWorkStr.wStr11,
                        serviceWorkStr.wStr12,
                        serviceWorkStr.wStr13,
                        serviceWorkStr.wStr14,
                        serviceWorkStr.wStr15,
                        serviceWorkStr.wStr16,
                        serviceWorkStr.wStr17,
                        serviceWorkStr.wStr18,
                        serviceWorkStr.wStr19,
                        serviceWorkStr.wStr20,
                        serviceWorkStr.wStr21,
                        serviceWorkStr.wStr22,
                        serviceWorkStr.wStr23,
                        serviceWorkStr.wStr24,
                        serviceWorkStr.wStr25,
                        serviceWorkStr.wStr26,
                        serviceWorkStr.wStr27,
                        serviceWorkStr.wStr28,
                        serviceWorkStr.wStr29,
                        serviceWorkStr.wStr30,
                        serviceWorkStr.wStr31,
                        serviceWorkStr.wStr32,
                        serviceWorkStr.wStr33,
                        serviceWorkStr.wStr34,
                        serviceWorkStr.wStr35,
                        serviceWorkStr.wStr36,
                        serviceWorkStr.wStr37,
                        serviceWorkStr.wStr38,
                        serviceWorkStr.wStr39,
                        serviceWorkStr.wStr40,
                        serviceWorkStr.wStr41,
                        serviceWorkStr.wStr42,
                        serviceWorkStr.wStr43,
                        serviceWorkStr.wStr44,
                        serviceWorkStr.wStr45,
                        serviceWorkStr.wStr46,
                        serviceWorkStr.wStr47,
                        serviceWorkStr.wStr48,
                        serviceWorkStr.wStr49,
                        serviceWorkStr.wStr50,
                        serviceWorkStr.isDel,
                        serviceWorkStr.modifiedDate,
                        serviceWorkStr.createdDate              )).from(serviceWorkStr).where(serviceWorkStr.isDel.eq("N"))
                .orderBy(serviceWorkStr.id.asc())
                .fetch();


        return content;
    }
}