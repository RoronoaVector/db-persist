package com.victor.dbpersist.mappers;

import com.victor.dbpersist.dto.FileDto;
import com.victor.dbpersist.dto.FileDto.FileDtoBuilder;
import com.victor.dbpersist.entity.FileEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-13T23:31:25+0100",
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

        fileDto.name( entity.getName() );
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

        FileEntity fileEntity = new FileEntity();

        fileEntity.setName( dto.getName() );
        fileEntity.setSurname( dto.getSurname() );
        fileEntity.setPriority( dto.getPriority() );
        fileEntity.setDescription( dto.getDescription() );

        return fileEntity;
    }
}
