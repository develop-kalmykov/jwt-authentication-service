package com.security.jwtserver.model.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDate;

@MappedSuperclass
@Data
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @CreatedDate
    @Column(name="created")
    private LocalDate created;

    @LastModifiedDate
    @Column(name="modified")
    private LocalDate modified;

    @Enumerated(EnumType.STRING)
    @Column(name="status")
    private Status status;

    private static enum Status {
        ACTIVE,
        NOT_ACTIVE,
        DELETED,
        BANNED
    }
}
