package com.school_online.repo;

import com.school_online.entity.Additional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdditionalRepo extends JpaRepository<Additional, Integer> {
}
