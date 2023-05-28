package com.spring.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.quiz.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
