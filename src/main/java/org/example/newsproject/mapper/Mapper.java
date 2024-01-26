package org.example.newsproject.mapper;

import java.util.Set;

public interface Mapper<RQ, RS, E> {
    E toEntity(RQ rq);
    RS toDTO(E e);
    Set<RS> toDTOs(Set<E> es);
}
