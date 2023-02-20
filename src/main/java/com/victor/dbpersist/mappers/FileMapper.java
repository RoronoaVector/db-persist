package com.victor.dbpersist.mappers;

import com.victor.dbpersist.dto.FileDto;
import com.victor.dbpersist.entity.FileEntity;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FileMapper {

    FileDto convert(FileEntity entity);

    FileEntity convert(FileDto dto);

}
