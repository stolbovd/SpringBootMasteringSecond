package ru.inkontext;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.inkontext.exercise.Exercise;
import ru.inkontext.model.Exam;

import java.util.List;
import java.util.Map;

@Service
public class ExamService {

	private RestTemplate restTemplate;

	public ExamService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public Exam createExam(Map<String, Integer> subjects) {
		Exam exam = new Exam();
		subjects.forEach((subject, count) -> {
			ResponseEntity<List<Exercise>> response = restTemplate.exchange(
					"http://"+subject+"/exercise/random?count=" + count,
					HttpMethod.GET,
					null,
					new ParameterizedTypeReference<List<Exercise>>() {
					});
			List<Exercise> exercises = response.getBody();
			exam.addSubject(subject, exercises);
		});

		return exam;
	}
}