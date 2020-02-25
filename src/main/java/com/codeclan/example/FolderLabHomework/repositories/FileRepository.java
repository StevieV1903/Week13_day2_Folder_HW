package com.codeclan.example.FolderLabHomework.repositories;

import com.codeclan.example.FolderLabHomework.models.FileType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<FileType, Long> {
}
