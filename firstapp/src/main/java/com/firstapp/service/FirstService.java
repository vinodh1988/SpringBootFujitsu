package com.firstapp.service;

import org.springframework.stereotype.Service;

@Service
public class FirstService {

	 public String[] getStrings() {
		 String n[]={"Stone","Rock","Lord","Jack","Henry","Mick"};
		 return n;
	 }
}
