package ru.inkontext;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.inkontext.model.Exam;

import java.util.Map;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ExamRestController {

	private final ExamService examService;

	@PostMapping("/exam")
	public Exam random(@RequestBody Map<String, Integer> subjects) {
		return examService.createExam(subjects);
	}
}
