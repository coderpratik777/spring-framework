package com.pratiti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("txtEditor")
public class TextEditor {
	
	@Autowired //dependency injection
	private SpellChecker sp;
	
	public void load(String document) {
		System.out.println("Texteditor loading the document");
		//SpellChecker s=new SpellChecker();
		sp.checkSpellingMistakes(document);
	}

}
