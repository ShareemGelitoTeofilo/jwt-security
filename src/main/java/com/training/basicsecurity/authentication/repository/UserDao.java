package com.training.basicsecurity.authentication.repository;

import com.training.basicsecurity.authentication.model.DAOUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<DAOUser, Integer> {
    DAOUser findByUsername(String username);
}
