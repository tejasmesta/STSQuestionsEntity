package com.QuestionsEntity.QuestionsEntity.services;

import java.util.List;

import com.QuestionsEntity.QuestionsEntity.Entity.Questions;

public interface QuestionsService {
	
	public List<Questions> getQuestions();

	public Questions getQuestion(long l);

	public Questions addQuestion(Questions question);

	public Questions updateQuestion(Questions question);

	public void deleteQuestion(long parseLong);
	
}
