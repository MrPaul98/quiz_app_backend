/**
 * 
 */
package com.quizapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizapp.model.CreateQuiz;
import com.quizapp.model.Questions;
import com.quizapp.model.UserResponse;
import com.quizapp.repository.QuestionRepository;
import com.quizapp.repository.QuizRepository;

/**
 * @author SAYANDIP PAUL
 *
 */
@Service
public class QuizServiceimpl implements QuizService {

	@Autowired
	private QuizRepository repository;

	@Autowired
	private QuestionRepository questionRepository;

	@Override
	public UserResponse createQuiz(CreateQuiz createQuiz) {

		UserResponse response = new UserResponse();
		if (createQuiz != null) {
			try {
				repository.save(createQuiz);
				response.setMessage("Question has sucessfully created");
				response.setStatus(200);
				response.setObject(createQuiz);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return response;
	}

	@Override
	public UserResponse getQuiz() {

		UserResponse response = new UserResponse();
		try {
			List<CreateQuiz> quizList = repository.findAll();
			if (quizList != null) {
				response.setMessage("Quiz found sucessfully.");
				response.setStatus(200);
				response.setObject(quizList);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return response;
	}

	@Override
	public UserResponse createQuestion(Questions questions) {
		UserResponse response = new UserResponse();
		try {
			questionRepository.save(questions);
			response.setStatus(200);
			response.setMessage("Question created sucessfully");
			response.setObject(questions);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return response;
	}

	@Override
	public UserResponse getQuestion(Integer qId) {
		UserResponse response = new UserResponse();
		try {
			List<Questions> questions = questionRepository.findByQid(qId);
			if(questions != null) {
				response.setStatus(200);
				response.setMessage("Question found Sucessfully");
				response.setObject(questions);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return response;
	}

	@Override
	public UserResponse deleteQuiz(Integer qId) {
		UserResponse response = new UserResponse();
		try {
			repository.deleteById(qId);
			try {
				questionRepository.deleteAllByQid(qId);
				response.setStatus(200);
				response.setMessage("The quiz was deleted sucessfully.");
			} catch (Exception e) {
				// TODO: handle exception
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return response;
	}

}
