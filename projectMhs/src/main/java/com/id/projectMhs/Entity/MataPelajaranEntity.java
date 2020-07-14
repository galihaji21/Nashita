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
@Table(name="mata_pelajaran")
public class MataPelajaranEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_mata_pelajaran")
	private Long mataPelajaranId;
	
	
	@Column(name="nama_mata_pelajaran")
	private String namaMataPelajaran;
	
	@Column(name="id_mahasiswa")
	private Long mahasiswaId;

	public Long getMataPelajaranId() {
		return mataPelajaranId;
	}

	public void setMataPelajaranId(Long mataPelajaranId) {
		this.mataPelajaranId = mataPelajaranId;
	}

	public String getNamaMataPelajaran() {
		return namaMataPelajaran;
	}

	public void setNamaMataPelajaran(String namaMataPelajaran) {
		this.namaMataPelajaran = namaMataPelajaran;
	}

	public Long getMahasiswaId() {
		return mahasiswaId;
	}

	public void setMahasiswaId(Long mahasiswaId) {
		this.mahasiswaId = mahasiswaId;
	}
	
	
}
