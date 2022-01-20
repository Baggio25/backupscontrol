package com.baggio.backupscontrol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baggio.backupscontrol.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}
