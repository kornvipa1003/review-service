package com.artbox.stationery_review.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.artbox.stationery_review.model.Stationery;
import java.util.List;


public interface StationeryRepository extends MongoRepository<Stationery, String>{
    List<Stationery> findByStationeryName(String stationeryName);
}
