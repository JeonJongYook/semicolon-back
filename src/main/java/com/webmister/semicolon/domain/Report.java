package com.webmister.semicolon.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.security.Timestamp;

@Entity
@Data
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    @Column
    @CreationTimestamp
    private Timestamp reportCreatTime;


    @Column
    private String comment;

    @Column
    private String reportImageUrl;

    @Column
    private int likeCount;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String contents;

    @Column
    String writingtime;

    @ManyToOne
    @JoinColumn(name = "userInfoId")
    @JsonBackReference
    UserInfo userInfo;


}
