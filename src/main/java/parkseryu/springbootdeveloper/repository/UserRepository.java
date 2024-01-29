package parkseryu.springbootdeveloper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import parkseryu.springbootdeveloper.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    // JPA는 메서드 규칙에 맞춰 메서드를 선언하면 이름을 분석해 자동으로 쿼리를 생성해줌.
}
