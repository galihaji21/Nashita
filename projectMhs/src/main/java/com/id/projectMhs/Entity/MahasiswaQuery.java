package com.id.projectMhs.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mahasiswa")
public class MahasiswaQuery {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_mahasiswa")
	private Long mahasiswaId;
	
	@Column(name="nama")
	private String nama;
	
	@Column(name="nama_mata_pelajaran")
	private String namaMataPelajaran;
	
	@Column(name="nilai")
	private double nilai;

	
	public Long getMahasiswaId() {
		return mahasiswaId;
	}

	public void setMahasiswaId(Long mahasiswaId) {
		this.mahasiswaId = mahasiswaId;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getNamaMataPelajaran() {
		return namaMataPelajaran;
	}

	public void setNamaMataPelajaran(String namaMataPelajaran) {
		this.namaMataPelajaran = namaMataPelajaran;
	}

	public double getNilai() {
		return nilai;
	}

	public void setNilai(double nilai) {
		this.nilai = nilai;
	}
	
	
	
}
