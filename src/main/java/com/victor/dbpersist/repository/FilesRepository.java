package com.victor.dbpersist.repository;

import com.victor.dbpersist.entity.FileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FilesRepository extends JpaRepository<FileEntity, UUID> {

}
