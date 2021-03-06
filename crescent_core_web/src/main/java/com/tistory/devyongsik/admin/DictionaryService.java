package com.tistory.devyongsik.admin;

import java.util.List;

import com.tistory.devyongsik.analyzer.dictionary.DictionaryType;

public interface DictionaryService {
	public List<String> getDictionary(DictionaryType dicType);
	public void addWordToDictionary (DictionaryType dicType, String word);
	public void removeWordFromDictionary (DictionaryType dicType, String word);
	public List<String> findWordFromDictionary (DictionaryType dicType, String word);
	public void writeToDictionaryFile(DictionaryType dicType);
	public void rebuildDictionary(DictionaryType dictionaryType);
}
