package com.pratiti.component;

import org.springframework.stereotype.Component;

@Component("spellChecker")
public class SpellChecker {
	
	
	public void checkSpellingMistakes(String document) {
		System.out.println("spellcehcker checking spelling mistakes");
	}

}
