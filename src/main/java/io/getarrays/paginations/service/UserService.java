package io.getarrays.paginations.service;

import io.getarrays.paginations.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

@Repository
public interface UserService {
    Page<User> getUsers(String name, int page, int size);
}
