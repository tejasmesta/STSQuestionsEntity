package com.QuestionsEntity.QuestionsEntity.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.QuestionsEntity.QuestionsEntity.Entity.Questions;
import com.QuestionsEntity.QuestionsEntity.services.QuestionsService;

@RestController
public class MyController {
	
	@Autowired
	private QuestionsService service;
	
	@GetMapping("/home")
	public String home()
	{
		return "This is homepage";
	}
	
	@GetMapping("/Questions")
	public List<Questions> getQuestions()
	{
		return this.service.getQuestions();
	}
	
	@GetMapping("/Questions/{questionId}")
	public Questions getQuestion(@PathVariable String questionId)
	{
		return this.service.getQuestion(Long.parseLong(questionId));
	}
	
	@PostMapping("/add")
	public Questions addQuestion(@RequestBody Questions question)
	{
		return this.service.addQuestion(question);
		
	}
	
	@PutMapping("/update")
	public Questions updateQuestion(@RequestBody Questions question)
	{
		return ((QuestionsService) this.service).updateQuestion(question);
	}
	
	@DeleteMapping("/Questions/{questiondId}")
	public ResponseEntity<HttpStatus> deleteQuestion(@PathVariable String questionId)
	{
		try
		{
			this.service.deleteQuestion(Long.parseLong(questionId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
				
	}
	
	
	
	
	
	
	
}
