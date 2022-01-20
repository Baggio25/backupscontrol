package com.baggio.backupscontrol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baggio.backupscontrol.entities.System;

public interface SystemRepository extends JpaRepository<System, Long>{

}
