package io.techerd.userservice.repository;

import io.techerd.userservice.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    public Role findByRole(String name);
}
