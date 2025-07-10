package com.artbox.stationery_review.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.artbox.stationery_review.model.StationeryLover;
import com.artbox.stationery_review.service.StationeryLoverService;


@RestController
@RequestMapping("/user")
public class StationeryLoverController {


    private StationeryLoverService stationeryLoverService;

    StationeryLoverController(StationeryLoverService s )
    {
            stationeryLoverService = s;

    }

    @PostMapping("/create")
    public StationeryLover createStationeryLover(@RequestBody StationeryLover entity)
    {
        return stationeryLoverService.create(entity);
    }

    @PostMapping("/createAll")
    public List<StationeryLover> createAll(@RequestBody List<StationeryLover> entities)
    {
        return stationeryLoverService.createAll(entities);
    }

    @DeleteMapping("/deleteAll")
    public ResponseEntity<Void> deleteAll() {
         stationeryLoverService.deleteAll();
         return ResponseEntity.noContent().build();
    }


   

    @GetMapping("/findAll")
    public List<StationeryLover> findAll()
    {
        return stationeryLoverService.findAll();
    }

}
