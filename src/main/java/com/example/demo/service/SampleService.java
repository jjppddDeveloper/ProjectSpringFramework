package com.example.demo.service;

import java.util.Optional;

import com.example.demo.entity.Sample;

public interface SampleService {
	Iterable<Sample> SelectAll();
	Optional<Sample> SelectOneById(Integer id);
	void InsertSample(Sample sample);
}