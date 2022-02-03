package com.webmister.semicolon.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    String title;

    @Column
    String contents;

    @Column
    String writingtime;

    @ManyToOne
    @JoinColumn(name = "userInfoId")
    @JsonBackReference
    UserInfo userInfo;


}
