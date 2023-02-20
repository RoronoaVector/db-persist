package com.victor.dbpersist.mappers;

import com.victor.dbpersist.dto.FileEmployeeDto;
import com.victor.dbpersist.dto.FileEmployeeDto.FileEmployeeDtoBuilder;
import com.victor.dbpersist.entity.FileEmployeeEntity;
import com.victor.dbpersist.entity.FileEmployeeEntity.FileEmployeeEntityBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-21T00:27:07+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class FileEmployeeMapperImpl implements FileEmployeeMapper {

    @Override
    public FileEmployeeDto convert(FileEmployeeEntity entity) {
        if ( entity == null ) {
            return null;
        }

        FileEmployeeDtoBuilder fileEmployeeDto = FileEmployeeDto.builder();

        fileEmployeeDto.name( entity.getName() );
        fileEmployeeDto.surname( entity.getSurname() );
        fileEmployeeDto.telephone( entity.getTelephone() );
        fileEmployeeDto.mail( entity.getMail() );
        fileEmployeeDto.enterprise( entity.getEnterprise() );

        return fileEmployeeDto.build();
    }

    @Override
    public FileEmployeeEntity convert(FileEmployeeDto dto) {
        if ( dto == null ) {
            return null;
        }

        FileEmployeeEntityBuilder fileEmployeeEntity = FileEmployeeEntity.builder();

        fileEmployeeEntity.name( dto.getName() );
        fileEmployeeEntity.surname( dto.getSurname() );
        fileEmployeeEntity.telephone( dto.getTelephone() );
        fileEmployeeEntity.mail( dto.getMail() );
        fileEmployeeEntity.enterprise( dto.getEnterprise() );

        return fileEmployeeEntity.build();
    }

    @Override
    public List<FileEmployeeDto> convert(List<FileEmployeeEntity> all) {
        if ( all == null ) {
            return null;
        }

        List<FileEmployeeDto> list = new ArrayList<FileEmployeeDto>( all.size() );
        for ( FileEmployeeEntity fileEmployeeEntity : all ) {
            list.add( convert( fileEmployeeEntity ) );
        }

        return list;
    }
}
