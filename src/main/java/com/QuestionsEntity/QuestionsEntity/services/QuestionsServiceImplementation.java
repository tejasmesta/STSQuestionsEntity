package com.QuestionsEntity.QuestionsEntity.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.QuestionsEntity.QuestionsEntity.Entity.Options;
import com.QuestionsEntity.QuestionsEntity.Entity.Questions;

@Service
public class QuestionsServiceImplementation implements QuestionsService{

	List<Questions> list;
	
	public QuestionsServiceImplementation() {
		list = new ArrayList<>();
		
		list.add(new Questions(1,"What is India's capital",new Options("Mumbai","New Delhi","Kolkata","Jaipur"),"New Delhi"));
		list.add(new Questions(2,"Which city is known as Pink city",new Options("Pune","Banglore","Kanpur","Jaipur"),"Jaipur"));
	}
	
	@Override
	public List<Questions> getQuestions() {
		return list;
	}

	@Override
	public Questions getQuestion(long questionId) {
		Questions q = null;
		for(Questions qs : list)
		{
			if(qs.getID()==questionId)
			{
				q = qs;
				break;
			}
		}
		return q;
	}

	@Override
	public Questions addQuestion(Questions question) {
		list.add(question);
		return question;
	}

	@Override
	public Questions updateQuestion(Questions question) {
		for(Questions q:list)
		{
			if(q.getID()==question.getID())
			{
				q.setQuestion(question.getQuestion());
				q.setOptions(question.getOptions());
				q.setAnswer(question.getAnswer());
			}
		}
		return question;
	}
	
	public void deleteQuestion(long questionId)
	{
		list = this.list.stream().filter(e->e.getID()!=questionId).collect(Collectors.toList());
	}

}
