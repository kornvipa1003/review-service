package com.artbox.stationery_review.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.artbox.stationery_review.model.Stationery;
import com.artbox.stationery_review.repository.StationeryRepository;

@Service
public class StationeryService {
    @Autowired
    private StationeryRepository repo;

    public Stationery create(Stationery entity)
    {
        return repo.save(entity);
    }

    public List<Stationery> createAll( List<Stationery> entities)
    {
        return  repo.saveAll(entities);
    }

    public List<Stationery> findAll()
    {
        return repo.findAll();
    }

    public void deleteAll()
    {
         repo.deleteAll();
    }
}
