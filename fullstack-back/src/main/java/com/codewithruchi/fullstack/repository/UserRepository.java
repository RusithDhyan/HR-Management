package com.codewithruchi.fullstack.repository;

import com.codewithruchi.fullstack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
