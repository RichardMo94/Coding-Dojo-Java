package com.codingdojo.controllerandviews.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.codingdojo.controllerandviews.models.User;
import com.codingdojo.controllerandviews.services.UserService;
import com.codingdojo.controllerandviews.validators.UserValidator;

@Controller
public class UserController {
	@Autowired
	private UserService userServ;
	
	@Autowired
	private UserValidator userValid;
	
	@GetMapping("")
	public String index(@ModelAttribute("userObj") User emptyUser) {
		return "index.jsp";
	}
	
	@PostMapping("/registration")
	public String register(@Valid @ModelAttribute("userObj") User filledUser, BindingResult results, HttpSession session){
		userValid.validate(filledUser, results);
		if(results.hasErrors()) {
			return "index.jsp";
		}else {
			User newUser = userServ.registerUser(filledUser);
			session.setAttribute("user_id", newUser.getId());
			return "redirect:/home";
		}
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("email") String email, @RequestParam("password") String password, HttpSession session, RedirectAttributes redirectAttributes) {
		if(userServ.authenticateUser(email, password)) {
			User user = userServ.findByEmail(email);
			session.setAttribute("user_id", user.getId());
			return "redirect:/home";
		}else {
			redirectAttributes.addFlashAttribute("error", "Invalid Credentials!");
			return "redirect:/";
		}
	}
	
	@GetMapping("/home")
	public String home(HttpSession session, Model model) {
		Long user_id = (Long) session.getAttribute("user_id");
		User u = userServ.findById(user_id);
		model.addAttribute("user", u);
		return "home.jsp";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("user");
		return "redirect:/";
	}
	
	
	
	 
}
