package com.baggio.backupscontrol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baggio.backupscontrol.entities.Package;

public interface PackageRepository extends JpaRepository<Package, Long>{

}
