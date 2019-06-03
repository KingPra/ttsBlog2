package com.tts.TTSBlog2.BlogPost;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BlogPost {

	// the @Id annotation sets private long id as our primary id;
	// @annotation only affects the variable directly under it.
	// @GenerationValue(...) tells id to auto generate.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String title;
	private String author;
	private String blogEntry;

	public BlogPost() {
		// non-argument constructor needed for JPA
	}

	public BlogPost(long id, String title, String author, String blogEntry) {
		this.title = title;
		this.author = author;
		this.blogEntry = blogEntry;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getBlogEntry() {
		return blogEntry;
	}

	public long getId() {
		return id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setBlogEntry(String blogEntry) {
		this.blogEntry = blogEntry;
	}

	@Override
	public String toString() {
		return "BlogEntry= [id=" + id + ", title=" + title + ", author=" + author + ", blogEntry=" + blogEntry + "]";
	}
}
