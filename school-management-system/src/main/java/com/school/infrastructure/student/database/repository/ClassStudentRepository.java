package com.school.infrastructure.student.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.school.infrastructure.student.database.entity.ClassStudentEntity;

@Repository
public interface ClassStudentRepository
		extends JpaRepository<ClassStudentEntity, Integer>, JpaSpecificationExecutor<ClassStudentEntity> {

}
