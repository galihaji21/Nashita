package com.id.projectMhs.Service;

import com.id.projectMhs.Entity.DataNilaiEntity;
import com.mysql.fabric.xmlrpc.base.Data;


public interface DataNilaiService {

	DataNilaiEntity addStudentValue(DataNilaiEntity dataNilai);
	
	DataNilaiEntity updateValue(DataNilaiEntity dataNilai);
	
	void DeleteNilai(Long id);
	
	DataNilaiEntity findByMahasiswaIdAndMataPelajaranId(Long mahasiswaId,Long mataPelajaranId);

}
