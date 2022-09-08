package com.finzly.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finzly.Model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
