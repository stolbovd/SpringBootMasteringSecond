package ru.inkontext;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ru.inkontext.exercise.Exerciseable;

import java.util.List;

@Slf4j
@RestController
public class MathRestController {

	private MathService mathService;

	public MathRestController(MathService mathService) {
		this.mathService = mathService;
	}

	@GetMapping("/exercise/random")
	public List<Exerciseable> random(@RequestParam(value = "count", required = true) Integer count) {
		return mathService.findRandom(count);
	}
}
