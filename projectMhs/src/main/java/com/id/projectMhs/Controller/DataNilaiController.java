package com.id.projectMhs.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.id.projectMhs.Entity.DataNilaiEntity;
import com.id.projectMhs.Service.DataNilaiService;

@RestController
public class DataNilaiController {
	@Autowired
	DataNilaiService dataNilaiService;
	
	
	@PostMapping("/inputNilai")
	public ResponseEntity<DataNilaiEntity> addValue(@RequestBody DataNilaiEntity dataNilai) {
		DataNilaiEntity newValue = dataNilaiService.addStudentValue(dataNilai);
		return new ResponseEntity<>(newValue, HttpStatus.OK);
	}
	
	@PutMapping("/updateNilai")
	public ResponseEntity<DataNilaiEntity>updateValue(@RequestBody DataNilaiEntity dataNilai){
		DataNilaiEntity newValue = dataNilaiService.updateValue(dataNilai);
		return new ResponseEntity<>(newValue,HttpStatus.OK);
	}
	
	 @RequestMapping("deleteNilai/{id}")
	    public void delete(@PathVariable(value="id") Long id) {
	        dataNilaiService.DeleteNilai(id);
	        
	    }	
	 
	 
	
	
	 

}
