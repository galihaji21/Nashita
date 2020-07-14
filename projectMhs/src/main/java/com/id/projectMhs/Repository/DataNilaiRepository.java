package com.id.projectMhs.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.google.common.base.Optional;
import com.id.projectMhs.Entity.DataNilaiEntity;

public interface DataNilaiRepository extends JpaRepository<DataNilaiEntity,Long> {
	
	Optional<DataNilaiEntity> findByMahasiswaIdAndMataPelajaranId(Long mahasiswaId,Long mataPelajaranId);

}
