package com.example.flyway.controller;

import com.example.flyway.model.Achievement;
import com.example.flyway.model.User;
import com.example.flyway.repository.AchievementRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@AllArgsConstructor
@RequestMapping("/achievement")
public class AchievementController {

    private final AchievementRepository achievementRepository;

    @PostMapping(produces = APPLICATION_JSON_VALUE)
    public Achievement save(@RequestBody Achievement achievement) {
        return achievementRepository.save(achievement);
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public List<Achievement> listAll() {
        return achievementRepository.findAll();
    }
}
