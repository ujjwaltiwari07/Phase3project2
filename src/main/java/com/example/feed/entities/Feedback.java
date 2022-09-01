package com.example.feed.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "feedback")
public class Feedback {
	@Id
	@GeneratedValue
	private int id;

	@Column(name = "rating", length = 10)
	private String rating;

	@Column(name = "feed")
	private String feed;

	@Column(name = "username")
	private String username;

	public Feedback() {
		// TODO Auto-generated constructor stub
	}

	public Feedback(String rating, String feed, String username) {
		super();

		this.rating = rating;
		this.feed = feed;
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getFeed() {
		return feed;
	}

	public void setFeed(String feed) {
		this.feed = feed;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "Feedback [id=" + id + ", rating=" + rating + ", feed=" + feed + ", username=" + username + "]";
	}

}
