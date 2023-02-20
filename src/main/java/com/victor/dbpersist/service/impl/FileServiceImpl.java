package com.victor.dbpersist.service.impl;

import com.victor.dbpersist.dto.FileDto;
import com.victor.dbpersist.mappers.FileMapper;
import com.victor.dbpersist.repository.FilesRepository;
import com.victor.dbpersist.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FileServiceImpl implements FileService {

    private final FilesRepository repository;
    private final FileMapper mapper;

    @Override
    public void persist(FileDto fileDto) {

        repository.save(mapper.convert(fileDto));

    }

}
