package com.victor.dbpersist.repository;

import com.victor.dbpersist.entity.FileEmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface FilesEmployeeRepository extends JpaRepository<FileEmployeeEntity, UUID> {

    List<FileEmployeeEntity> findByEnterprise(String enterprise);

}