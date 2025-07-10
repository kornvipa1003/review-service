package com.artbox.stationery_review.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class CommentPostDTO {
    private String postId;
    private String userName;
    private String content;
}
