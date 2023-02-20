package com.victor.dbpersist.service;

import com.victor.dbpersist.dto.FileEmployeeDto;

import java.util.List;

public interface FileEmployeeService {

    void persist(FileEmployeeDto employeeDto);

    List<FileEmployeeDto> findAll();

    List<FileEmployeeDto> findByEnterprise(String enterprise);

}
