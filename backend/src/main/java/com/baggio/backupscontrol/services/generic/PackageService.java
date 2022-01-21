package com.baggio.backupscontrol.services.generic;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import com.baggio.backupscontrol.dto.PackageDTO;

public class PackageService implements GenericService<PackageDTO> {

	@Transactional(readOnly = true)
	@Override
	public List<PackageDTO> findAll() {
		return null;
	}

	@Transactional(readOnly = true)
	@Override
	public Page<PackageDTO> findAllPaged(Pageable pageable) {
		return null;
	}

	@Transactional(readOnly = true)
	@Override
	public PackageDTO findById(Long id) {
		return null;
	}

	@Transactional
	@Override
	public PackageDTO insert(PackageDTO dto) {
		return null;
	}

	@Transactional
	@Override
	public PackageDTO update(PackageDTO dto, Long id) {
		return null;
	}

	@Override
	public void delete(Long id) {
		
	}

}
