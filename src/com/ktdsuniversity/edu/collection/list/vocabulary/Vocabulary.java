package com.ktdsuniversity.edu.collection.list.vocabulary;

import java.util.HashMap;
import java.util.Map;

public class Vocabulary implements VocabularyInterface{

	private Map<String, String> vocabulary;

	public Vocabulary() {
		this.vocabulary = new HashMap<>();
	}
	
	@Override
	public String getWord(String english) {
		String korean = vocabulary.get(english);
		if (korean == null) {
			System.out.println("해당 단어는 존재하지 않습니다");
		}
		return korean;
	}
	
	@Override
	public void addWord(String english, String korean) {
		vocabulary.put(english, korean);
		System.out.println("단어 등록 완료");
	}
	
	@Override
	public void editWord(String english, String korean) {
		if (vocabulary.containsKey(english)) {
			vocabulary.put(english, korean);
			System.out.println("단어 수정 완료");
		}else {
			System.out.println("해당 단어는 존재하지 않습니다.");
		}
	}
	
	@Override
	public void deleteWord(String english) {
		if (vocabulary.remove(english) != null) {
			System.out.println("삭제 완료");
		}else {
			System.out.println("해당 단어는 존재하지 않습니다");
		}
	}
}
