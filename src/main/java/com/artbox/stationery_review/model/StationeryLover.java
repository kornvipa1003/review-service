package com.artbox.stationery_review.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document(collection = "stationeryLover")
public class StationeryLover {
    @Id
    private String userId;
    private String userName;
    private String facebook;
    private int year;
    private String favoriteItem;
    private String style;
}
