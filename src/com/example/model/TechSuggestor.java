package com.example.model;

import java.util.ArrayList;

public class TechSuggestor {
	
	public ArrayList<String> getLanguageSuggestions(String feature) {
		ArrayList<String> languages = new ArrayList<String>();
		if(feature.equals("stable")) {
			languages.add("C");
			languages.add("C++");
		}
		else if(feature.equals("morefeatures")) {
			languages.add("Java");
			languages.add("Python");
			languages.add("C++");
		}
		else if(feature.equals("lessmemory")) {
			languages.add("C");
			languages.add("C++");
			languages.add("Pascal");
		}
		else if(feature.equals("robust")) {
			languages.add("Java");
			languages.add("Python");
		}
		else if(feature.equals("compiled")) {
			languages.add("C");
			languages.add("C++");
			languages.add("Pascal");
		}
		else {
			languages.add("Java");
			languages.add("Python");
			languages.add("Perl");
		}
		return languages;
	}

}
