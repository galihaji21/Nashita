package com.id.projectMhs.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="data_nilai")
public class DataNilaiEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	
	@Column(name="id_mahasiswa")
	private Long mahasiswaId;
	
	@Column(name="id_mata_pelajaran")
	private Long mataPelajaranId;
	
	@Column(name="nilai")
	private double nilai;
	
	@Column(name="keterangan")
	private String keterangan;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMahasiswaId() {
		return mahasiswaId;
	}

	public void setMahasiswaId(Long mahasiswaId) {
		this.mahasiswaId = mahasiswaId;
	}

	public Long getMataPelajaranId() {
		return mataPelajaranId;
	}

	public void setMataPelajaranId(Long mataPelajaranId) {
		this.mataPelajaranId = mataPelajaranId;
	}

	public double getNilai() {
		return nilai;
	}

	public void setNilai(double nilai) {
		this.nilai = nilai;
	}

	public String getKeterangan() {
		return keterangan;
	}

	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}

	
	
	
		
	
}
