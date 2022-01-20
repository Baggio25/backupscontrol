package com.baggio.backupscontrol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baggio.backupscontrol.entities.State;

public interface StateRepository extends JpaRepository<State, Long>{

}
