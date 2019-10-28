package ru.inkontext.services;

import org.springframework.stereotype.Service;

@Service
public class Design implements Task {
	@Override
	@Deprecated
	public void doWork() {
		System.out.println("Design application");
	}
}
