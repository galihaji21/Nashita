package com.id.projectMhs.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Optional;
import com.id.projectMhs.Entity.DataNilaiEntity;
import com.id.projectMhs.Entity.MahasiswaQueryAVG;
import com.id.projectMhs.Repository.DataNilaiRepository;

@Service
public class DataNilaiServiceImpl implements DataNilaiService{

	@Autowired
	DataNilaiRepository dataNilaiRepository;
	
	@Override
	public DataNilaiEntity addStudentValue(DataNilaiEntity dataNilai) {
		DataNilaiEntity data = new DataNilaiEntity();
		data.setMahasiswaId(dataNilai.getMahasiswaId());
		data.setMataPelajaranId(dataNilai.getMataPelajaranId());
		data.setNilai(dataNilai.getNilai());
		data.setKeterangan(dataNilai.getKeterangan());
		return dataNilaiRepository.save(data);
	}

	@Override
	public DataNilaiEntity updateValue(DataNilaiEntity dataNilai) {
		DataNilaiEntity data = new DataNilaiEntity();
		data.setId(dataNilai.getId());
		data.setMahasiswaId(dataNilai.getMahasiswaId());
		data.setMataPelajaranId(dataNilai.getMataPelajaranId());
		data.setNilai(dataNilai.getNilai());
		data.setKeterangan(dataNilai.getKeterangan());
		return dataNilaiRepository.save(data);
	}

	@Override
	public void DeleteNilai(Long id) {
		// TODO Auto-generated method stub
		dataNilaiRepository.deleteById(id);
	}

	@Override
	public DataNilaiEntity findByMahasiswaIdAndMataPelajaranId(Long mahasiswaId, Long mataPelajaranId) {
		// TODO Auto-generated method stub
		Optional<DataNilaiEntity>optional = dataNilaiRepository.findByMahasiswaIdAndMataPelajaranId(mahasiswaId,mataPelajaranId);
		DataNilaiEntity data = new DataNilaiEntity();
			if (optional.isPresent()) {
				data= optional.get();
			}
			return data;
	}


	 

	

}
