/**
 * 
 */
package com.quizapp.service;

import com.quizapp.model.CreateQuiz;
import com.quizapp.model.Questions;
import com.quizapp.model.UserResponse;

/**
 * @author SAYANDIP PAUL
 *
 */
public interface QuizService {

	public UserResponse createQuiz(CreateQuiz createQuiz);
	
	public UserResponse getQuiz();
	
	public UserResponse createQuestion(Questions questions);
	
	public UserResponse getQuestion(Integer qId);
	
	public UserResponse deleteQuiz(Integer qId);
}
