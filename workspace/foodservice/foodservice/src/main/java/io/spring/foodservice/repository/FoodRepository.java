package io.spring.foodservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import io.spring.foodservice.domain.Food;

@Component
public interface FoodRepository extends JpaRepository<Food, String>{
	List<Food> findAllBySpicylevelOrderById(Integer spicylevel);
}
