package com.victor.dbpersist.mappers;

import com.victor.dbpersist.dto.FileDto;
import com.victor.dbpersist.dto.FileDto.FileDtoBuilder;
import com.victor.dbpersist.entity.FileEntity;
import com.victor.dbpersist.entity.FileEntity.FileEntityBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-20T23:45:49+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class FileMapperImpl implements FileMapper {

    @Override
    public FileDto convert(FileEntity entity) {
        if ( entity == null ) {
            return null;
        }

        FileDtoBuilder fileDto = FileDto.builder();

        fileDto.nameUser( entity.getNameUser() );
        fileDto.surname( entity.getSurname() );
        fileDto.priority( entity.getPriority() );
        fileDto.description( entity.getDescription() );

        return fileDto.build();
    }

    @Override
    public FileEntity convert(FileDto dto) {
        if ( dto == null ) {
            return null;
        }

        FileEntityBuilder fileEntity = FileEntity.builder();

        fileEntity.nameUser( dto.getNameUser() );
        fileEntity.surname( dto.getSurname() );
        fileEntity.priority( dto.getPriority() );
        fileEntity.description( dto.getDescription() );

        return fileEntity.build();
    }
}
