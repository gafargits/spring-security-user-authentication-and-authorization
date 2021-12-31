package io.techerd.userservice.services;

import io.techerd.userservice.models.AppUser;
import io.techerd.userservice.models.Role;

import java.util.List;

public interface UserService {
    AppUser saveUser(AppUser user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    AppUser getUser(String username);
    List<AppUser> getUsers();
}
