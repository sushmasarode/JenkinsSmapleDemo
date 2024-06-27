package com.cybage.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cybage.Model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
