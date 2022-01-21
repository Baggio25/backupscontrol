package com.baggio.backupscontrol.services.generic;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface GenericService<DTO> {

	List<DTO> findAll();

	Page<DTO> findAllPaged(Pageable pageable);

	DTO findById(Long id);

	DTO insert(DTO dto);

	DTO update(DTO dto, Long id);

	void delete(Long id);
}
