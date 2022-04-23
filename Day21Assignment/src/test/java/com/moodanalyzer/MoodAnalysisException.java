package com.moodanalyzer;

public class MoodAnalysisException extends Exception {
    public MoodAnalysisException(String message) {
        super(message);
    }
    public MoodAnalysisException(String message, MoodAnalyzer.Mood mood) {
        super(message);
        System.out.println(message + mood);
    }
}
