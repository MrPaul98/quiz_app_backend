/**
 * 
 */
package com.quizapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author SAYANDIP PAUL
 *
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {

	private Integer status;
	
	private String message;
	
	private Object object;
}
