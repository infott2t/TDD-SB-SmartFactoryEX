package com.example.domain.servicework;

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
    private String isDel;
    private LocalDateTime modifiedDate;
    private LocalDateTime createdDate;



    @Builder
    public ServiceWork(Long id, String coopName, String coopComment, String coopWorkName, String wtag1, String wtag2, LocalDateTime startWorkDate, LocalDateTime endWorkDate, String searchTag1, String searchTag2, String searchTag3, String searchTag4, String searchTag5, String isDel, LocalDateTime modifiedDate, LocalDateTime createdDate) {
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
        this.isDel = isDel;
        this.modifiedDate = modifiedDate;
        this.createdDate = createdDate;
    }
}