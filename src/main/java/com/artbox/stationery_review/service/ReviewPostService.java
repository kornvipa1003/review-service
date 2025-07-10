package com.artbox.stationery_review.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artbox.stationery_review.dto.CommentPostDTO;
import com.artbox.stationery_review.dto.StationeryReviewPostDTO;
import com.artbox.stationery_review.model.Comment;
import com.artbox.stationery_review.model.ReviewPost;
import com.artbox.stationery_review.model.StationeryLover;
import com.artbox.stationery_review.repository.StationeryRepository;
import com.artbox.stationery_review.repository.ReviewPostRepository;
import com.artbox.stationery_review.repository.stationeryLoverRepository;

@Service
public class ReviewPostService {

    @Autowired
    private ReviewPostRepository postRepo;

    @Autowired
    private StationeryRepository stationeryRepo;


    @Autowired
    private stationeryLoverRepository userRepo;


    public ReviewPost addComment(CommentPostDTO dto) {

        StationeryLover user = userRepo.findByUserName(dto.getUserName()).get(0);
        Comment comment =new Comment(user, dto.getContent(), new Date(System.currentTimeMillis()));

        ReviewPost post = postRepo.findById(dto.getPostId())
            .orElseThrow(() -> new RuntimeException("Post not found"));
        post.getComments().add(comment);
  
        return postRepo.save(post);

    }

    public ReviewPost createPost(StationeryReviewPostDTO dto)
    {
            ReviewPost entity = new ReviewPost();
            entity.setContent(dto.getContent());
            entity.setDatetime(new Date(System.currentTimeMillis()));
            entity.setStationery(stationeryRepo.findByStationeryName(dto.getStationeryName()).get(0));
            entity.setUser(userRepo.findByUserName(dto.getUserName()).get(0));
            return postRepo.save(entity);
    }

    public void deleteAll()
    {
         postRepo.deleteAll();
    }

    public List<ReviewPost> findAll()
    {
        return postRepo.findAll();
    }

   
}
 