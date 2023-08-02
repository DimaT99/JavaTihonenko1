package com.school_online.repo;

import com.school_online.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface TeacherRepo extends JpaRepository<Teacher, Integer> {
}
