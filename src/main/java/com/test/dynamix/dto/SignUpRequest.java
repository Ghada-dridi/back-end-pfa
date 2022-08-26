package com.test.dynamix.dto;

import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class SignUpRequest {

	
	    @NotBlank
	    @Size(min = 3, max = 20)
	    private String name;

	    @NotBlank
	    @Size(min = 3, max = 20)
	    private String Lastname;
	 
	    @NotBlank
	    @Size(max = 50)
	    @Email
	    private String email;
	    
	    private Set<String> role;
	    
	    @NotBlank
	    @Size(min = 6, max = 40)
	    private String password;
	
}
