package com.victor.dbpersist.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class FileDto {

    private String nameUser;
    private String surname;
    private String priority;
    private String description;

}
