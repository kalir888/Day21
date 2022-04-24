package com.moodanalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenMessage_WhenHaveWordSad_ReturnSad() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Iam in Sad Mood");
        String userMood = String.valueOf(moodAnalyzer.analyzeMood());
        Assertions.assertEquals("SAD",userMood);
    }

    @Test
    public void givenMessage_WhenHaveWordAny_ReturnHappy() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Iam in Any Mood");
        String userMood = String.valueOf(moodAnalyzer.analyzeMood());
        Assertions.assertEquals("HAPPY",userMood);
    }

    @Test
    public void givenMessage_WhenNull_ThrowMyCustomException() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        try {
            moodAnalyzer.analyzeMood();
        }catch(MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMessage_WhenEmpty_ThrowMyCustomException() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(" ");
        try {
            moodAnalyzer.analyzeMood();
        }catch(MoodAnalysisException e) {
            e.printStackTrace();
        }
    }
}
