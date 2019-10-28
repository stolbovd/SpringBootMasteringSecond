package ru.inkontext.model;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.Singular;

import java.util.Map;

@Data
@Builder
public class Person {
	private String name;
	@NonNull
	private Integer age;

	@Singular("одноРыба")
	private Map<String,Integer> fish;

}
