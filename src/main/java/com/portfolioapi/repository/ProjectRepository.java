package com.portfolioapi.repository;

import com.portfolioapi.entity.Project;
import com.portfolioapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    List<Project> findByUser(User user);
}
