package com.baggio.backupscontrol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baggio.backupscontrol.entities.Call;

public interface CallRepository extends JpaRepository<Call, Long>{

}
