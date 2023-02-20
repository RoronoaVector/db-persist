package com.victor.dbpersist.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "files_employees")
@Getter
@Setter
@Entity
@NoArgsConstructor
public class FileEmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    UUID id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "surname", length = 100)
    private String surname;

    @Column(name = "telephone", length = 9)
    private String telephone;

    @Column(name = "mail", length = 255)
    private String mail;

    @Column(name = "enterprise", length = 150)
    private String enterprise;

}
