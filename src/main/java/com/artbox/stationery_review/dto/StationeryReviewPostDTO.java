package com.artbox.stationery_review.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StationeryReviewPostDTO {
    
    private String userName;
    private String stationeryName;
    private String content;
}
