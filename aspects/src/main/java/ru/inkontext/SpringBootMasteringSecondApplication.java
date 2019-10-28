package ru.inkontext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.inkontext.services.Task;

@SpringBootApplication
public class SpringBootMasteringSecondApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootMasteringSecondApplication.class, args);
		context.getBeansOfType(Task.class).values().forEach(Task::doWork);
	}

//	Person person = Person.builder()
}
