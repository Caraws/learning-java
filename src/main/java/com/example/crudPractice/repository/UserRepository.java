package com.example.crudPractice.repository;

import com.example.crudPractice.service.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {
    @Query(value = "SELECT * FROM users u WHERE u.name LIKE CONCAT('%', :keyword, '%')", nativeQuery = true)
    List<User> searchByKeyword (@Param("keyword") String keyword);
}
