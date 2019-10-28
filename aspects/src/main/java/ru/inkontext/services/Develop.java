package ru.inkontext.services;

import org.springframework.stereotype.Service;

@Service
public class Develop implements Task {
	@Override
	public void doWork() {
		System.out.println("Develop application");
	}
}
