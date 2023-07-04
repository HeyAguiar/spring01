package course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
