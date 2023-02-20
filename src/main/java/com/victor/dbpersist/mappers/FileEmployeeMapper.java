package com.victor.dbpersist.mappers;

import com.victor.dbpersist.dto.FileEmployeeDto;
import com.victor.dbpersist.entity.FileEmployeeEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FileEmployeeMapper {

    FileEmployeeDto convert(FileEmployeeEntity entity);

    FileEmployeeEntity convert(FileEmployeeDto dto);

    List<FileEmployeeDto> convert(List<FileEmployeeEntity> all);

}