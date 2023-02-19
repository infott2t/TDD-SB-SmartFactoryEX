package com.example.firstinstance.controller.firstinstanceurl.form;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ServiceWorkApiDtoForm {

    private Long id;
    private String coopName;
    private String coopComment;
    private String coopWorkName;
    private String wtag1;
    private String wtag2;
    private String startWorkDate;
    private String endWorkDate;
    private String searchTag1;
    private String searchTag2;
    private String searchTag3;
    private String searchTag4;
    private String searchTag5;
    private Long viewCount;
    private Long likeCount;
    private Long starCount;
    private Long starAll;
    private Long starPairMan;

    private String isDel;
    private LocalDateTime modifiedDate;
    private LocalDateTime createdDate;
    private Long serviceWorkStrId;
}