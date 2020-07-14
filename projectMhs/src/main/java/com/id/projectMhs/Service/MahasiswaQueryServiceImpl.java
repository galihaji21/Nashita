package com.id.projectMhs.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.id.projectMhs.Entity.MahasiswaEntity;
import com.id.projectMhs.Entity.MahasiswaQuery;
import com.id.projectMhs.Entity.MahasiswaQueryAVG;
import com.id.projectMhs.Repository.MahasiswaQueryRepository;

@Service
public class MahasiswaQueryServiceImpl implements MahasiswaQueryService {
	
	@Autowired
	MahasiswaQueryRepository mahasiswaQueryRepository;
	
	@Override
	public List<MahasiswaQuery> getMahiswa() {
		// TODO Auto-generated method stub
		
		List<Object[]>mahasiswas= mahasiswaQueryRepository.findMahasiswa();
		List<MahasiswaQuery>mahasiswa = new ArrayList<MahasiswaQuery>();
			for (Object[] obj : mahasiswas) {
				MahasiswaQuery mhs = new MahasiswaQuery();
				mhs.setMahasiswaId(Long.valueOf(obj[0].toString()));
				mhs.setNama(obj[1].toString());
				mhs.setNamaMataPelajaran(obj[2].toString());
				mhs.setNilai(Double.valueOf(obj[3].toString()));
				mahasiswa.add(mhs);
			}
		
		return mahasiswa;
	}

	@Override
	public List<MahasiswaQueryAVG> getAvg() {
		List<Object[]>mahasiswas= mahasiswaQueryRepository.findMahasiswaAvg();
		List<MahasiswaQueryAVG>mahasiswa = new ArrayList<MahasiswaQueryAVG>();
			for (Object[] obj : mahasiswas) {
				MahasiswaQueryAVG mhs = new MahasiswaQueryAVG();
				mhs.setMahasiswaId(Long.valueOf(obj[0].toString()));
				mhs.setNama(obj[1].toString());
				mhs.setNilaiRataRata(Double.valueOf(obj[2].toString()));
				mahasiswa.add(mhs);
			}
		
		return mahasiswa;
	}

	@Override
	public MahasiswaEntity findByMahasiswaId(Long mahasiswaId) {
		// TODO Auto-generated method stub
		return null;
	}

}
