package com.dailycodebuffer.spring_boot.tutorial.repository;

import com.dailycodebuffer.spring_boot.tutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
