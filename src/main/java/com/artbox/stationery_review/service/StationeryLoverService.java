package com.artbox.stationery_review.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.artbox.stationery_review.model.StationeryLover;
import com.artbox.stationery_review.repository.stationeryLoverRepository;

@Service
public class StationeryLoverService {

    private stationeryLoverRepository repo;
    StationeryLoverService(stationeryLoverRepository stationeryLoverRepository)
    {
            repo=stationeryLoverRepository; 
    }

   
    public StationeryLover create(StationeryLover entity)
    {
        return  repo.save(entity);

    }

    public List<StationeryLover> createAll( List<StationeryLover> entities)
    {
        return  repo.saveAll(entities);
    }


    public void deleteAll()
    {
         repo.deleteAll();
    }

    public List<StationeryLover> findAll()
    {
        return repo.findAll();
    }
}
