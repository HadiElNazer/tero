package com.luv2code.spring.first.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movie")
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public int id ;
	
	@Column(name = "title")
	public String title;
	
	@Column(name = "genre")
	public String genre;
	
	@Column(name = "releaseDate")
	public Date releaseDate ;
	
	@Column(name = "directorName")
	public String directorName;
	
	public Movie() {
	}
	
	public Movie(String title, String genre, Date releaseDate, String directorName) {
		this.title = title;
		this.genre = genre;
		this.releaseDate = releaseDate;
		this.directorName = directorName;
	}
	

}
