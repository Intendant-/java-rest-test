package me.brandonmichael.test;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.HashMap;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Test {

    private HashMap<String, String> currently= new HashMap<>();

    private String summary;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public HashMap<String, String> getCurrently() {
        return currently;
    }

    public void setContent(HashMap<String, String> currently) {
        this.currently = currently;
    }
}
