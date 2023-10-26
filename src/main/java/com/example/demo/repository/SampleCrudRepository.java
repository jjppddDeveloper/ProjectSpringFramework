package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Sample;

public interface SampleCrudRepository extends CrudRepository<Sample, Integer> {
}