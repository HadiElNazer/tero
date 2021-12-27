package com.luv2code.spring.first.entity;

import java.util.Date;
import java.util.LinkedList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.bson.types.ObjectId;

@Entity
@Table(name="listMovie")
public class ListMovie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private  int id ; 
	
	@Column(name ="name")
	private String name ;
	
	@Column(name ="date")
	private Date date;
	@Column(name="listMovie")
	private LinkedList<Integer> listMovie;
	
	
}
