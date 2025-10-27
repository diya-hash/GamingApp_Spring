package com.exercise.businessApp;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService{
	@Override
	public int[] retrieve() {
		return new int[] {4,5,6};
	}
}
