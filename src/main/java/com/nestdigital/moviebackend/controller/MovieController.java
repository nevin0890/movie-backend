package com.nestdigital.moviebackend.controller;

import com.nestdigital.moviebackend.dao.MovieDao;
import com.nestdigital.moviebackend.model.MovieModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    private MovieDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/movies", consumes = "application/json", produces = "application/json")
    public String addMovie(@RequestBody MovieModel movies) {

        System.out.println(movies.toString());
        dao.save(movies);
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping(path = "/movies", produces = "application/json")
    public List<MovieModel> getMovies() {
        return ( List<MovieModel>) dao.findAll();
    }

}






