package ru.inkontext;

import lombok.Getter;
import org.springframework.stereotype.Component;
import ru.inkontext.exercise.Subject;
import ru.inkontext.model.MathExercise;

import java.util.List;

@Component
public class SubjectRepository {
	@Getter
	private Subject subject;

	public SubjectRepository() {
		subject = Subject.builder()
				.name("mathematics")
				.exercises(List.of(
						new MathExercise("1+2", "3"),
						new MathExercise("3+4", "5"),
						new MathExercise("3*4", "12")
				))
				.build();
	}
}
