package com.artbox.stationery_review.controller;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.artbox.stationery_review.dto.CommentPostDTO;
import com.artbox.stationery_review.dto.StationeryReviewPostDTO;
import com.artbox.stationery_review.model.ReviewPost;
import com.artbox.stationery_review.service.ReviewPostService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/review")
public class ReviewPostController {

    ReviewPostController(ReviewPostService service)
    {
            reviewService =service;
    }


    private ReviewPostService reviewService;

    @GetMapping("/test")
    public String test()
    {
        return "This is Stationery Review Service";
    }

  
    @PostMapping("/create")
    public ReviewPost createReviewPost(@RequestBody StationeryReviewPostDTO dto)
    {
        return reviewService.createPost(dto);
    }

    @GetMapping("/findAll")
    public List<ReviewPost> findAll()
    {
        return reviewService.findAll();
    }

    @DeleteMapping("/deleteAll")
    public ResponseEntity<Void> deleteAll() {
         reviewService.deleteAll();
         return ResponseEntity.noContent().build();
    }

    @PostMapping("/addComment")
    public ReviewPost addComment( @RequestBody CommentPostDTO dto) {
        
        return reviewService.addComment(dto);
    }
    
}
