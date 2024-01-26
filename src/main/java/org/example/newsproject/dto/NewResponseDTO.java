package org.example.newsproject.dto;

import lombok.*;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class NewResponseDTO {
    private Integer id;
    private String title;
    private String content;
    private Set<TagResponseDTO> tags;
}
