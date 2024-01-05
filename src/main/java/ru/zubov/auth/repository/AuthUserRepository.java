package ru.zubov.auth.repository;

import ru.zubov.auth.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthUserRepository extends JpaRepository<UserEntity, Integer> {
    Optional<UserEntity> findByUsername(String name);
}
