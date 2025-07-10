package com.artbox.stationery_review.model;



import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document(collection = "comment")
public class Comment {
    
  
    private StationeryLover commentor;
    private String content;
    private Date datetime;


}
