package io.techerd.userservice.repository;

import io.techerd.userservice.models.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser, Long> {
    public AppUser findByUsername(String username);
}
