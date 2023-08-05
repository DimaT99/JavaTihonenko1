package school_online.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import school_online.entity.Additional;

@Repository
public interface AdditionalRepo extends JpaRepository<Additional, Integer> {
}
