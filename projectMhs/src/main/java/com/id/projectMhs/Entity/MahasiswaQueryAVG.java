package com.id.projectMhs.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class MahasiswaQueryAVG {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_mahasiswa")
	private Long mahasiswaId;
	private String nama;
	private Double nilaiRataRata;
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
	public Double getNilaiRataRata() {
		return nilaiRataRata;
	}
	public void setNilaiRataRata(Double nilaiRataRata) {
		this.nilaiRataRata = nilaiRataRata;
	}
	
	
	
	
	
}
