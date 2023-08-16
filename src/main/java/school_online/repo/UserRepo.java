package school_online.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import school_online.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    User findByUsername(String nickname);

}
