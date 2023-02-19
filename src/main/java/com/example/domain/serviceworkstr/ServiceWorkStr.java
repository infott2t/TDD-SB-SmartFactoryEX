package com.example.domain.serviceworkstr;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="SERVICE_WORK_STR")
public class ServiceWorkStr {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SERVICE_WORK_STR_ID")
    private Long id;

    private String wStr1;
    private String wStr2;
    private String wStr3;
    private String wStr4;
    private String wStr5;
    private String wStr6;
    private String wStr7;
    private String wStr8;
    private String wStr9;
    private String wStr10;
    private String wStr11;
    private String wStr12;
    private String wStr13;
    private String wStr14;
    private String wStr15;
    private String wStr16;
    private String wStr17;
    private String wStr18;
    private String wStr19;
    private String wStr20;
    private String wStr21;
    private String wStr22;
    private String wStr23;
    private String wStr24;
    private String wStr25;
    private String wStr26;
    private String wStr27;
    private String wStr28;
    private String wStr29;
    private String wStr30;
    private String wStr31;
    private String wStr32;
    private String wStr33;
    private String wStr34;
    private String wStr35;
    private String wStr36;
    private String wStr37;
    private String wStr38;
    private String wStr39;
    private String wStr40;
    private String wStr41;
    private String wStr42;
    private String wStr43;
    private String wStr44;
    private String wStr45;
    private String wStr46;
    private String wStr47;
    private String wStr48;
    private String wStr49;
    private String wStr50;
    private String isDel;
    private LocalDateTime modifiedDate;
    private LocalDateTime createdDate;



    @Builder
    public ServiceWorkStr(Long id, String wStr1, String wStr2, String wStr3, String wStr4, String wStr5, String wStr6, String wStr7, String wStr8, String wStr9, String wStr10, String wStr11, String wStr12, String wStr13, String wStr14, String wStr15, String wStr16, String wStr17, String wStr18, String wStr19, String wStr20, String wStr21, String wStr22, String wStr23, String wStr24, String wStr25, String wStr26, String wStr27, String wStr28, String wStr29, String wStr30, String wStr31, String wStr32, String wStr33, String wStr34, String wStr35, String wStr36, String wStr37, String wStr38, String wStr39, String wStr40, String wStr41, String wStr42, String wStr43, String wStr44, String wStr45, String wStr46, String wStr47, String wStr48, String wStr49, String wStr50, String isDel, LocalDateTime modifiedDate, LocalDateTime createdDate) {
        this.id = id;
        this.wStr1 = wStr1;
        this.wStr2 = wStr2;
        this.wStr3 = wStr3;
        this.wStr4 = wStr4;
        this.wStr5 = wStr5;
        this.wStr6 = wStr6;
        this.wStr7 = wStr7;
        this.wStr8 = wStr8;
        this.wStr9 = wStr9;
        this.wStr10 = wStr10;
        this.wStr11 = wStr11;
        this.wStr12 = wStr12;
        this.wStr13 = wStr13;
        this.wStr14 = wStr14;
        this.wStr15 = wStr15;
        this.wStr16 = wStr16;
        this.wStr17 = wStr17;
        this.wStr18 = wStr18;
        this.wStr19 = wStr19;
        this.wStr20 = wStr20;
        this.wStr21 = wStr21;
        this.wStr22 = wStr22;
        this.wStr23 = wStr23;
        this.wStr24 = wStr24;
        this.wStr25 = wStr25;
        this.wStr26 = wStr26;
        this.wStr27 = wStr27;
        this.wStr28 = wStr28;
        this.wStr29 = wStr29;
        this.wStr30 = wStr30;
        this.wStr31 = wStr31;
        this.wStr32 = wStr32;
        this.wStr33 = wStr33;
        this.wStr34 = wStr34;
        this.wStr35 = wStr35;
        this.wStr36 = wStr36;
        this.wStr37 = wStr37;
        this.wStr38 = wStr38;
        this.wStr39 = wStr39;
        this.wStr40 = wStr40;
        this.wStr41 = wStr41;
        this.wStr42 = wStr42;
        this.wStr43 = wStr43;
        this.wStr44 = wStr44;
        this.wStr45 = wStr45;
        this.wStr46 = wStr46;
        this.wStr47 = wStr47;
        this.wStr48 = wStr48;
        this.wStr49 = wStr49;
        this.wStr50 = wStr50;
        this.isDel = isDel;
        this.modifiedDate = modifiedDate;
        this.createdDate = createdDate;
    }
}