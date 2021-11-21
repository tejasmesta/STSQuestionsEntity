package com.QuestionsEntity.QuestionsEntity.Entity;


public class Questions {
	private int ID;
	private String Question;
	private Options options;
	private String Answer;
	
	public Questions(int iD, String question, Options options, String answer) {
		super();
		ID = iD;
		Question = question;
		this.options = options;
		Answer = answer;
	}

	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public Options getOptions() {
		return options;
	}

	public void setOptions(Options options) {
		this.options = options;
	}

	public String getAnswer() {
		return Answer;
	}

	public void setAnswer(String answer) {
		Answer = answer;
	}

	@Override
	public String toString() {
		return "Questions [ID=" + ID + ", Question=" + Question + ", options=" + options + ", Answer=" + Answer
				+ ", getID()=" + getID() + ", getQuestion()=" + getQuestion() + ", getOptions()=" + getOptions()
				+ ", getAnswer()=" + getAnswer() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
