package com.luv2code.spring.first.dao;

import org.bson.types.ObjectId;
import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.spring.first.entity.Movie;

public interface MovieRepositry extends JpaRepository<Movie,ObjectId> {

}
