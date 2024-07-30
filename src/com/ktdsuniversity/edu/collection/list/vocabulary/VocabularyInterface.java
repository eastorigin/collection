package com.ktdsuniversity.edu.collection.list.vocabulary;

public interface VocabularyInterface {

	void addWord(String english, String korean);
	String getWord(String english);
	void editWord(String english, String korean);
	void deleteWord(String english);
}
