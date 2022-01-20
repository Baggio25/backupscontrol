package com.baggio.backupscontrol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baggio.backupscontrol.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
