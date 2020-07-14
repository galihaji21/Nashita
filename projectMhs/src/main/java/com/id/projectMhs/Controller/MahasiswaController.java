package com.id.projectMhs.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.id.projectMhs.Entity.DataNilaiEntity;
import com.id.projectMhs.Entity.MahasiswaQuery;
import com.id.projectMhs.Entity.MahasiswaQueryAVG;
import com.id.projectMhs.Service.MahasiswaQueryService;

@RestController
public class MahasiswaController  {
	
	@Autowired
	MahasiswaQueryService mahasiswaQueryService;
	
	@GetMapping("/LihatMahasiswa")
	public ResponseEntity<List<MahasiswaQuery>> getAllMahasiswa(){
		List<MahasiswaQuery> mhs = mahasiswaQueryService.getMahiswa();
		return new ResponseEntity<>(mhs,HttpStatus.OK);
	}
	
	@GetMapping("/NilaiRata")
	public ResponseEntity<List<MahasiswaQueryAVG>> getAvgReport(){
		List<MahasiswaQueryAVG> mhs = mahasiswaQueryService.getAvg();
		return new ResponseEntity<>(mhs,HttpStatus.OK);
	}
	
	

}
