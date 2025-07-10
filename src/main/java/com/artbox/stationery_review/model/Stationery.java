package com.artbox.stationery_review.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Document(collection = "stationery")
public class Stationery {


    @Id
    private String stationeryId;
    private String stationeryName;
    private String description;

}
