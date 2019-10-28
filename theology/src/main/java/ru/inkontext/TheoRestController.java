package ru.inkontext;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ru.inkontext.exercise.Exerciseable;

import java.util.List;

@Slf4j
@RestController
public class TheoRestController {

	private TheoService theoService;

	public TheoRestController(TheoService theoService) {
		this.theoService = theoService;
	}

	@GetMapping("/exercise/random")
	public List<Exerciseable> random(@RequestParam(value = "count", required = true) Integer count) {
		return theoService.findRandom(count);
	}

	@GetMapping("/param/{param}")
	public String random(@PathVariable String param) {
		return "hello " + param;
	}
}
