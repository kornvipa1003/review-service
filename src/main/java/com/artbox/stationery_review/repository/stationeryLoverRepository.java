package com.artbox.stationery_review.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.artbox.stationery_review.model.StationeryLover;

public interface stationeryLoverRepository extends MongoRepository<StationeryLover, String>{
     List<StationeryLover> findByUserName(String userName);
}
