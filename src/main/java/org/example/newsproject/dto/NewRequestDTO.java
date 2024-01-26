package org.example.newsproject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.newsproject.entity.Tag;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NewRequestDTO {
    private String title;
    private String content;
    private Set<TagRequestDTO> tags;
}
