package org.example.newsproject.controller;

import lombok.RequiredArgsConstructor;
import org.example.newsproject.entity.New;
import org.example.newsproject.repository.TagRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/api/tag")
@RequiredArgsConstructor
public class TagController {
    private final TagRepository repository;
    @GetMapping
    public New getNews(){
        New news = repository.getReferenceById(1).getNews().iterator().next();
        System.out.printf(news.toString());
        return news;
    }
}
