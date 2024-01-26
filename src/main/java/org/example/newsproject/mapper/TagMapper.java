package org.example.newsproject.mapper;

import org.example.newsproject.dto.TagRequestDTO;
import org.example.newsproject.dto.TagResponseDTO;
import org.example.newsproject.entity.Tag;

import java.util.Set;
import java.util.stream.Collectors;

public class TagMapper implements Mapper<TagRequestDTO, TagResponseDTO, Tag>{
    @Override
    public Tag toEntity(TagRequestDTO tagRequestDTO) {
        return Tag.builder()
                .name(tagRequestDTO.getName())
                .build();
    }

    @Override
    public TagResponseDTO toDTO(Tag tag) {
        return TagResponseDTO.builder()
                .id(tag.getId())
                .name(tag.getName())
                .build();
    }

    @Override
    public Set<TagResponseDTO> toDTOs(Set<Tag> tags) {
        return tags.stream()
                .map(this::toDTO)
                .collect(Collectors.toSet());
    }
}
