package com.game.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "games")
public class Games {
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String platform;
	private Double score;
	private String genre;
	private String editors_choice;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getEditors_choice() {
		return editors_choice;
	}
	public void setEditors_choice(String editors_choice) {
		this.editors_choice = editors_choice;
	}
	public Games() {
		
	}
	public Games(Long id, String title, String platform, Double score, String genre, String editors_choice) {
		super();
		this.id = id;
		this.title = title;
		this.platform = platform;
		this.score = score;
		this.genre = genre;
		this.editors_choice = editors_choice;
	}
	@Override
	public String toString() {
		return "Games [id=" + id + ", title=" + title + ", platform=" + platform + ", score=" + score + ", genre="
				+ genre + ", editors_choice=" + editors_choice + "]";
	}
	
	

}
