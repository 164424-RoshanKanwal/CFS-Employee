package com.cfs.admin.models;

public class Feedback {

	private String question;
	private String answer;	
	
	public Feedback() {
		
	}
	public Feedback(String question, String answer) {
		super();
		this.question = question;
		this.answer = answer;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	@Override
	public String toString() {
		return "Feedback [question=" + question + ", answer=" + answer + "]";
	}
	
	
}
