/**
 * 
 */
package com.quizapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author SAYANDIP PAUL
 *
 */
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "question")
public class Questions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private Integer qid;
	
	@Lob
	private String content;
	
	@Lob
	private String option1;
	
	@Lob
	private String option2;
	
	@Lob
	private String option3;
	
	@Lob
	private String option4;
	
	@Lob
	private String answer;
 
}
