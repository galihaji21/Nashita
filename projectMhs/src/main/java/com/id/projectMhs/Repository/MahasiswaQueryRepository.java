package com.id.projectMhs.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.id.projectMhs.Entity.MahasiswaQuery;

public interface MahasiswaQueryRepository extends JpaRepository<MahasiswaQuery, Long> {
	
	@Query(value ="SELECT mahasiswa.id_mahasiswa,mahasiswa.nama,mata_pelajaran.nama_mata_pelajaran,data_nilai.nilai FROM Mahasiswa LEFT JOIN mata_pelajaran ON  "
			+ "mahasiswa.id_mahasiswa=mata_pelajaran.id_mahasiswa LEFT JOIN data_nilai ON mahasiswa.id_mahasiswa=data_nilai.id_mahasiswa ", nativeQuery = true)
	List<Object[]> findMahasiswa();
	
	@Query(value="select id_mahasiswa, nama, avg(nilai) as rata from mahasiswa join data_nilai using(id_mahasiswa) GROUP by id_mahasiswa",nativeQuery = true)
	List<Object[]>findMahasiswaAvg();
	
	

}
