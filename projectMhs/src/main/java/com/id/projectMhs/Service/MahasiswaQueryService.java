package com.id.projectMhs.Service;
import java.util.List;

import com.id.projectMhs.Entity.DataNilaiEntity;
import com.id.projectMhs.Entity.MahasiswaEntity;
import com.id.projectMhs.Entity.MahasiswaQuery;
import com.id.projectMhs.Entity.MahasiswaQueryAVG;

public interface MahasiswaQueryService {
	public List<MahasiswaQuery> getMahiswa();
	public List<MahasiswaQueryAVG> getAvg();
	MahasiswaEntity findByMahasiswaId(Long mahasiswaId);


}
