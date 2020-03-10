package ru.inkontext;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TheoController {
	@GetMapping("/theo/title")
	public String index(Model model) {
		model.addAttribute("theo", "Hello from Theo");
		return "theo";
	}
}
