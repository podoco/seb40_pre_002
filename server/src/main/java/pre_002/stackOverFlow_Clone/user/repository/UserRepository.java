package pre_002.stackOverFlow_Clone.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pre_002.stackOverFlow_Clone.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
