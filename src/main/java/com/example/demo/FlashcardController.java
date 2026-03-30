package com.example.demo;


import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/flashcards")

public class FlashcardController {


	@GetMapping
	public List<Flashcard> getFlashcards() {

	    List<Flashcard> list = new java.util.ArrayList<>();

	    list.add(new Flashcard(1L, "Client Says: We don't work with agencies", "Acknoledge the position. Then keep perspective. While many think of hot deserts, the largest desert in the world is actually the Antarctic Desert, which covers the entire continent. It is classified as a desert because it receives very little precipitation"));
	    list.add(new Flashcard(2L, "Client Says: We don't pay fees", "Another answer. Then keep perspective. While many think of hot deserts, the largest desert in the world is actually the Antarctic Desert, which covers the entire continent. It is classified as a desert because it receives very little precipitation"));
	    list.add(new Flashcard(3L, "What is API?", "Application Programming Interface"));
	    list.add(new Flashcard(4L, "What is API?", "Application Programming Interface"));
	    list.add(new Flashcard(5L, "What is API?", "Application Programming Interface"));
	    list.add(new Flashcard(6L, "What is API?", "Application Programming Interface"));
	    list.add(new Flashcard(7L, "What is API?", "Application Programming Interface"));
	    list.add(new Flashcard(8L, "What is API?", "Application Programming Interface"));
	    list.add(new Flashcard(9L, "What is API?", "Application Programming Interface"));
	    return list;
	}
	}

