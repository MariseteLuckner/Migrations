package com.example.flyway.controller;

import com.example.flyway.model.Profile;
import com.example.flyway.repository.ProfileRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@AllArgsConstructor
@RestController
@RequestMapping("/Profile")
public class ProfileController {

    private final ProfileRepository profileRepository;

    @PostMapping(produces = APPLICATION_JSON_VALUE)
    public Profile save(Profile profile) {
        return profileRepository.save(profile);
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public List<Profile> listAll() {
        return profileRepository.findAll();
    }
}
