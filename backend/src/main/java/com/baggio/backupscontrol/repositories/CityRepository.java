package com.baggio.backupscontrol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baggio.backupscontrol.entities.City;

public interface CityRepository extends JpaRepository<City, Long>{

}
