package ru.inkontext;

import lombok.Getter;
import org.springframework.stereotype.Component;
import ru.inkontext.exercise.Subject;
import ru.inkontext.model.TheoExercise;

import java.util.List;

@Component
public class SubjectRepository {
	@Getter
	private Subject subject;

	public SubjectRepository() {
		subject = Subject.builder()
				.name("theology")
				.exercises(List.of(
						new TheoExercise("Сколько Богов", "Один"),
						new TheoExercise("Первая заповедь", "Да не будет у тебя других Богов"),
						new TheoExercise("Что есть Бог", "Бог есть Любовь")
				))
				.build();
	}
}
