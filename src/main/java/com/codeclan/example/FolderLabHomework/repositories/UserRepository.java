package com.codeclan.example.FolderLabHomework.repositories;

import com.codeclan.example.FolderLabHomework.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
