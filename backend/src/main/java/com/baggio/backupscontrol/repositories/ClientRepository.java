package com.baggio.backupscontrol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baggio.backupscontrol.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
