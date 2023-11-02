package com.app.repositories;

import com.app.models.Models;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelsRepository extends JpaRepository<Models, Integer> {
}
