package com.example.domain.servicework;

import com.example.domain.serviceworkstr.ServiceWorkStr;
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
@Table(name="SERVICE_WORK")
public class ServiceWork {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SERVICE_WORK_ID")
    private Long id;

    private String coopName;
    private String coopComment;
    private String coopWorkName;
    private String wtag1;
    private String wtag2;
    private LocalDateTime startWorkDate;
    private LocalDateTime endWorkDate;
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

    @ManyToOne(targetEntity = ServiceWorkStr.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "SERVICE_WORK_STR_ID")
    private ServiceWorkStr serviceWorkStr;



    @Builder
    public ServiceWork(Long id, String coopName, String coopComment, String coopWorkName, String wtag1, String wtag2, LocalDateTime startWorkDate, LocalDateTime endWorkDate, String searchTag1, String searchTag2, String searchTag3, String searchTag4, String searchTag5, Long viewCount, Long likeCount, Long starCount, Long starAll, Long starPairMan, String isDel, LocalDateTime modifiedDate, LocalDateTime createdDate, ServiceWorkStr serviceWorkStr) {
        this.id = id;
        this.coopName = coopName;
        this.coopComment = coopComment;
        this.coopWorkName = coopWorkName;
        this.wtag1 = wtag1;
        this.wtag2 = wtag2;
        this.startWorkDate = startWorkDate;
        this.endWorkDate = endWorkDate;
        this.searchTag1 = searchTag1;
        this.searchTag2 = searchTag2;
        this.searchTag3 = searchTag3;
        this.searchTag4 = searchTag4;
        this.searchTag5 = searchTag5;
        this.viewCount = viewCount;
        this.likeCount = likeCount;
        this.starCount = starCount;
        this.starAll = starAll;
        this.starPairMan = starPairMan;
        this.isDel = isDel;
        this.modifiedDate = modifiedDate;
        this.createdDate = createdDate;
        this.serviceWorkStr = serviceWorkStr;
    }
}