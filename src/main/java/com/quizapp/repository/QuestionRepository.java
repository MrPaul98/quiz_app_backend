/**
 * 
 */
package com.quizapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quizapp.model.Questions;

/**
 * @author SAYANDIP PAUL
 *
 */
public interface QuestionRepository extends JpaRepository<Questions, Integer>{

	public List<Questions> findByQid(Integer qid);
	
	public void deleteAllByQid(Integer qid);
}
