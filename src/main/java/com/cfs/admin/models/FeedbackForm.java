package com.cfs.admin.models;

import java.util.Arrays;

public class FeedbackForm {

	private String title;
	private String trainerName;
	private Feedback feedback[];
	private int rating;
	private String comment;
	
	public FeedbackForm() {
		
	}

	public FeedbackForm(String title, String trainerName, Feedback[] feedback, int rating, String comment) {
		super();
		this.title = title;
		this.trainerName = trainerName;
		this.feedback = feedback;
		this.rating = rating;
		this.comment = comment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public Feedback[] getFeedback() {
		return feedback;
	}

	public void setFeedback(Feedback[] feedback) {
		this.feedback = feedback;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "FeedbackForm [title=" + title + ", trainerName=" + trainerName + ", feedback="
				+ Arrays.toString(feedback) + ", rating=" + rating + ", comment=" + comment + "]";
	}

	
	
}
