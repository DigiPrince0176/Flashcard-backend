package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.List;



public class Flashcard {
	
	private Long id;
    private String question;
    private String answer;

    public Flashcard(Long id, String question, String answer) {
        this.id = id;
        this.question = question;
        this.answer = answer;
    }

    public Long getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}


