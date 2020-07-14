package com.id.projectMhs.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mahasiswa")
public class MahasiswaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_mahasiswa")
	private Long mahasiswaId;
	
	@Column(name="nama")
	private String nama;
	
	@Column(name="alamat")
	private String alamat;

	

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

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	
	
	
	

}
