package com.codingdojo.controllerandviews.validators;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.codingdojo.controllerandviews.models.User;
import com.codingdojo.controllerandviews.services.UserService;

@Component
public class UserValidator implements Validator{
	
	@Autowired
	private UserService userServ;
	
	@Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }
    
    // 2
    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;
        
        if (!user.getPasswordConfirmation().equals(user.getPassword())) {
            errors.rejectValue("passwordConfirmation", "Match");
        }
        if(userServ.findByEmail(user.getEmail()) != null) {
        	errors.rejectValue("duplicate", "Duplicate");
        }
        
    }
}
