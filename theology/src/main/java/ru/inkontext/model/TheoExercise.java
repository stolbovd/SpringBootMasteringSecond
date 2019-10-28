package ru.inkontext.model;

import lombok.Data;
import ru.inkontext.exercise.Exercise;
import ru.inkontext.exercise.Exerciseable;

@Data
public class TheoExercise implements Exerciseable {
	private Exercise exercise;

	public TheoExercise(String question, String answer) {
		this.exercise = Exercise.builder().question(question).answer(answer).build();
	}
}
