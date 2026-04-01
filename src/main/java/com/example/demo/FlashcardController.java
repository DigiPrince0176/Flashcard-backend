package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/flashcards")


public class FlashcardController {

    @Autowired
    private FlashcardRepository repo;

    // GET all flashcards
    @GetMapping
    public List<Flashcard> getAll() {
        return repo.findAll();
    }

    // ADD new flashcard
    @PostMapping
    public Flashcard add(@RequestBody Flashcard card) {
        return repo.save(card);
    }
    
    @PutMapping("/{id}")
    public Flashcard update(@PathVariable Long id, @RequestBody Flashcard updated) {
        Flashcard card = repo.findById(id).orElseThrow();

        card.setQuestion(updated.getQuestion());
        card.setAnswer(updated.getAnswer());

        return repo.save(card);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
    
}