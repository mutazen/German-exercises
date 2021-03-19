package com.example.pruebasaleman;

public class SubstantiveData {

    private String word;
    private String wordGender;
    private String pluralWord;
    private String translation;

    public SubstantiveData() {
        setWord("");
        setWordGender("");
        setPluralWord("");
        setTranslation("");
    }

    public SubstantiveData(String word, String wordGender, String pluralWord, String translation) {
        setWord(word);
        setWordGender(wordGender);
        setPluralWord(pluralWord);
        setTranslation(translation);
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getWordGender() {
        return wordGender;
    }

    public void setWordGender(String wordGender) {
        this.wordGender = wordGender;
    }

    public String getPluralWord() {
        return pluralWord;
    }

    public void setPluralWord(String pluralWord) {
        this.pluralWord = pluralWord;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }







}
