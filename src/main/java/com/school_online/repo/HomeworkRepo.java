package com.school_online.repo;

import com.school_online.entity.Homework;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeworkRepo extends JpaRepository<Homework, Integer> {
}
