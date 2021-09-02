package io.spring.foodservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.spring.foodservice.domain.Food;
import io.spring.foodservice.repository.FoodRepository;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class FoodController {

	FoodRepository foodRepository;
	
	public FoodController(FoodRepository foodRepository) {
		this.foodRepository = foodRepository;
	}
	
	@GetMapping("/food/{id}")
	public Food getFood(@PathVariable String id) {
		log.debug("Getting Food id : " + id);
		
		return foodRepository.getOne(id);
	}
	
	@GetMapping("/food")
	public List<Food> getFood(@RequestParam("spicylevel") Integer spicylevel){
		log.debug("Getting Food List by spicylevel : " + spicylevel);
		
		return foodRepository.findAllBySpicylevelOrderById(spicylevel);
	}
	
}
