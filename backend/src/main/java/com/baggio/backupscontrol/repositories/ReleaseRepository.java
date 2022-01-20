package com.baggio.backupscontrol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baggio.backupscontrol.entities.Release;

public interface ReleaseRepository extends JpaRepository<Release, Long>{

}
