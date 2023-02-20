package com.victor.dbpersist.service.impl;

import com.victor.dbpersist.dto.FileEmployeeDto;
import com.victor.dbpersist.mappers.FileEmployeeMapper;
import com.victor.dbpersist.repository.FilesEmployeeRepository;
import com.victor.dbpersist.service.FileEmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FileEmployeeServiceImpl implements FileEmployeeService {

    private final FileEmployeeMapper mapper;
    private final FilesEmployeeRepository repository;

    @Override
    public void persist(FileEmployeeDto employeeDto) {
        repository.save(mapper.convert(employeeDto));
    }

    @Override
    public List<FileEmployeeDto> findAll() {
        return mapper.convert(repository.findAll());
    }

    @Override
    public List<FileEmployeeDto> findByEnterprise(String enterprise) {
        return mapper.convert(repository.findByEnterprise(enterprise));
    }
}
