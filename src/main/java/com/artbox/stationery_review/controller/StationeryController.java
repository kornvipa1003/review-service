package com.artbox.stationery_review.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.artbox.stationery_review.model.Stationery;
import com.artbox.stationery_review.service.StationeryService;

@RestController
@RequestMapping("/item")
public class StationeryController {
    private StationeryService stationeryService;

    StationeryController(StationeryService service)
    {
        stationeryService =service;
    }

    
    @PostMapping("/create")
    public Stationery createStationery(@RequestBody Stationery entity)
    {
        return stationeryService.create(entity);
    }
    
    @PostMapping("/createAll")
    public List<Stationery> createAll(@RequestBody List<Stationery> entities)
    {
        return stationeryService.createAll(entities);
    }

    @GetMapping("/findAll")
    public List<Stationery> findAllStationery()
    {
        return stationeryService.findAll();
    }

    @DeleteMapping("/deleteAll")
    public ResponseEntity<Void> deleteAll() {
         stationeryService.deleteAll();
        return ResponseEntity.noContent().build();
    }
}
