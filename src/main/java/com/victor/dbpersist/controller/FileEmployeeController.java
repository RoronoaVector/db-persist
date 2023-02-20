package com.victor.dbpersist.controller;

import com.victor.dbpersist.dto.FileEmployeeDto;
import com.victor.dbpersist.service.FileEmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FileEmployeeController {

    private final FileEmployeeService service;

    @GetMapping("/employees")
    public List<FileEmployeeDto> getAllEmployees() {
        return service.findAll();
    }

    @GetMapping("/employees/enterprise/{enterprise}")
    public List<FileEmployeeDto> getAllEmployeesByEnterprise(@PathVariable String enterprise) {
        return service.findByEnterprise(enterprise);
    }

}
