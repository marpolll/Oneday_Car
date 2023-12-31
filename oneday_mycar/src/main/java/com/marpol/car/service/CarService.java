package com.marpol.car.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.marpol.car.models.CarDto;

@Service
public interface CarService {
	
	public List<CarDto> selectAll();
	public CarDto findById(long c_no);
	
	public int insert(CarDto carDto);
	public int update(CarDto carDto);
	public int delete(long c_no);

}
