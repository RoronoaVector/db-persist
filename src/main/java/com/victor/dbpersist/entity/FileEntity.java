package com.victor.dbpersist.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Table(name = "files")
@Getter
@Setter
@Entity
public class FileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    UUID id;

    @Column(name = "name_user", length = 20)
    private String nameUser;

    @Column(name = "surname", length = 50)
    private String surname;

    @Column(name = "priority", length = 20)
    private String priority;

    @Column(name = "description", length = 255)
    private String description;

}
