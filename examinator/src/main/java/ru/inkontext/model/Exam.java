package ru.inkontext.model;

import lombok.Data;
import ru.inkontext.exercise.Exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class Exam {
	private Map<String, List<Exercise>> subjects;

	public Exam() {
		subjects = new HashMap<>();
	}

	public void addSubject(String subject, List<Exercise> exercises) {
		subjects.put(subject, exercises);
	}
}
