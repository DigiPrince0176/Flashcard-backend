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
	    list.add(new Flashcard(3L, "Client Says: We don't have any budget for this right now.", "Acknowledge the financial focus. Then keep perspective. While we often think of the Great Wall of China as a single line, it is actually a network of walls and fortifications stretching over 13,000 miles, built across several different dynasties"));
	    list.add(new Flashcard(4L, "Client Says: We’re already happy with our current provider.", "Acknowledge the loyalty. Then keep perspective. While many believe the Eiffel Tower is a static height, it actually grows up to 15 centimeters during the summer because the iron expands in the heat."));
	    list.add(new Flashcard(5L, "Client Says: Just send me an email and I'll look at it later.", "Acknowledge the request for info. Then keep perspective. While most people think of bulls as being enraged by the color red, they are actually color-blind to it; they are reacting to the movement of the matador's cape."));
	    list.add(new Flashcard(6L, "Client Says: This isn't a good time; call us back in six months.", "Acknowledge the schedule. Then keep perspective. While many think of Venus as the closest planet to Earth on average, Mercury is actually the closest neighbor to Earth the majority of the time due to its tight orbit."));
	    list.add(new Flashcard(7L, "Client Says: We’re not interested in new software.", "Acknowledge the current stack. Then keep perspective. While most people think of a \"jiffy\" as an informal term for a short time, it is actually an actual unit of time used in physics, representing the time it takes for light to travel one centimeter in a vacuum."));
	    list.add(new Flashcard(8L, "Client Says: I'm not the person who makes these decisions.", "Acknowledge the role. Then keep perspective. While many think of the \"m\" in M&Ms as standing for \"Mars,\" it actually stands for Mars and Murrie, the two founders who created the candy back in 1941."));
	    list.add(new Flashcard(9L, "Client Says: We tried something like this before and it didn't work.", "Acknowledge the past experience. Then keep perspective. While many think of sharks as mindless predators, the Greenland shark is the longest-living vertebrate on Earth, with some individuals estimated to be over 400 years old."));
	    return list;
	}
	}

