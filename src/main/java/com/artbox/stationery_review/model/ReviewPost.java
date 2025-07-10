package com.artbox.stationery_review.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "stationeryReviewPost")
public class ReviewPost {

    @Id
    private String postId;
    private StationeryLover user;
    private Stationery stationery;
    private String content;
    private Date datetime;
    private List<Comment> comments = new ArrayList<>();

}
