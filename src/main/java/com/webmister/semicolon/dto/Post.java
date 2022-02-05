package com.webmister.semicolon.dto;

import com.webmister.semicolon.domain.Report;
import lombok.Data;

@Data
public class Post {
    String title;
    String contents;
    String description;
    String writingtime;

    public Post(Report report){
        this.title = report.getTitle();
        this.contents = report.getContents();
        this.writingtime = report.getWritingtime();
        this.description ="임시";
    }
}
