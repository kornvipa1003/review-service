package com.artbox.stationery_review.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.artbox.stationery_review.model.ReviewPost;

public interface ReviewPostRepository extends MongoRepository<ReviewPost, String>{

}
