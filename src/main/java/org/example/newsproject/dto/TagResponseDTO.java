package org.example.newsproject.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TagResponseDTO {
    private Integer id;
    private String name;
}
