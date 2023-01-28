/**
 * 
 */
package com.quizapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quizapp.model.CreateQuiz;

/**
 * @author SAYANDIP PAUL
 *
 */
public interface QuizRepository extends JpaRepository<CreateQuiz, Integer>{

}
