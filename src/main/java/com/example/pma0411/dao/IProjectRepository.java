package com.example.pma0411.dao;

import com.example.pma0411.entities.Project;
import org.springframework.data.repository.CrudRepository;

public interface IProjectRepository extends CrudRepository<Project, Long> {
}
