package com.luv2code.spring.first.dao;

import org.bson.types.ObjectId;
import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.spring.first.entity.ListMovie;

public interface ListMovieRepositry extends JpaRepository<ListMovie, ObjectId> {

}
