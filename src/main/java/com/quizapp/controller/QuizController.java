/**
 * 
 */
package com.quizapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quizapp.model.CreateQuiz;
import com.quizapp.model.Questions;
import com.quizapp.model.UserResponse;
import com.quizapp.service.QuizService;

/**
 * @author SAYANDIP PAUL
 *
 */
@RestController
@CrossOrigin
@RequestMapping("quiz")
public class QuizController {

	@Autowired
	private QuizService quizService;
	
	@PostMapping("/createQuiz")
	public UserResponse createQuiz(@RequestBody CreateQuiz createQuiz) {
		
		return quizService.createQuiz(createQuiz);
	}
	
	@GetMapping("/getQuizData")
	public UserResponse getQuiz() {
		return quizService.getQuiz();
	}
	
	@PostMapping("/createQuestion")
	public UserResponse createQuestion(@RequestBody Questions questions) {
		return quizService.createQuestion(questions) ;
	}
	
	@GetMapping("/getQuestions/{qid}")
	public UserResponse getQuestions(@PathVariable("qid") Integer qid) {
		return quizService.getQuestion(qid);
	}
	
	@DeleteMapping("/deleteQuiz/{qid}")
	public UserResponse deleteQuiz(@PathVariable("qid") Integer qid) {
		return quizService.deleteQuiz(qid);
	}
}
