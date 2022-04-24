package com.moodanalyzer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.moodanalyzer.MoodAnalyzer.Mood.*;

public class MoodAnalyzer {
    public String userMood;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String userMood) {
        this.userMood = userMood;
    }

    public enum Mood {HAPPY,SAD,EMPTY,NULL,INVALID_INPUT}

    public Mood analyzeMood() throws MoodAnalysisException {
        try {
            Pattern sadMood = Pattern.compile("sad",Pattern.CASE_INSENSITIVE);
            Pattern happyMood = Pattern.compile("happy|any",Pattern.CASE_INSENSITIVE);
            Pattern emptyMood = Pattern.compile("^\\s+$");
            Matcher matchSad = sadMood.matcher(userMood);
            Matcher matchHappy = happyMood.matcher(userMood);
            Matcher matchEmpty = emptyMood.matcher(userMood);
            if (matchHappy.find())
                return HAPPY;
            else if(matchSad.find())
                return SAD;
            else if(matchEmpty.find()) {
                throw new MoodAnalysisException("Mood is ", EMPTY);
            }else
                return INVALID_INPUT;
        }catch(NullPointerException nullPointerException) {
            throw new MoodAnalysisException("Mood cannot be ", NULL);
        }
    }
}
