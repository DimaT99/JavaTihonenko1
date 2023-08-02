package com.school_online.repo;

import com.school_online.entity.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
@Component
public interface LectureRepo extends JpaRepository<Lecture, Integer> {
}
