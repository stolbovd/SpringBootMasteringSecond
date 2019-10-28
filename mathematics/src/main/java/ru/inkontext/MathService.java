package ru.inkontext;

import org.springframework.stereotype.Service;
import ru.inkontext.exercise.Exerciseable;

import java.util.List;

@Service
public class MathService {

	private SubjectRepository subjectRepository;

	public MathService(SubjectRepository subjectRepository) {
		this.subjectRepository = subjectRepository;
	}

	public List<Exerciseable> findRandom(Integer count) {
		return subjectRepository.getSubject().getRandomExercise(count);
	}
}
