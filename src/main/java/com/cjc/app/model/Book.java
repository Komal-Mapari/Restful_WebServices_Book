package com.cjc.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
public class Book {

	@Id
	private Integer id;
	
	private String name;
	
	private Float peice;
	
	private String author;
	
	private String publishDate;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(Integer id, String name, Float peice, String author, String publishDate) {
		super();
		this.id = id;
		this.name = name;
		this.peice = peice;
		this.author = author;
		this.publishDate = publishDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPeice() {
		return peice;
	}

	public void setPeice(Float peice) {
		this.peice = peice;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", peice=" + peice + ", author=" + author + ", publishDate="
				+ publishDate + "]";
	}
	
	
}
