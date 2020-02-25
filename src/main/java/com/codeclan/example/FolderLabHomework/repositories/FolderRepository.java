package com.codeclan.example.FolderLabHomework.repositories;

import com.codeclan.example.FolderLabHomework.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
