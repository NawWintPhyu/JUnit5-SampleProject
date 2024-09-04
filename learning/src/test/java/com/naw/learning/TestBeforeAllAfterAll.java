package com.naw.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestBeforeAllAfterAll {
	TestBeforeAllAfterAll() {
		System.out.println("Test obj is created before test method.");
	}

	@BeforeAll
	void beforeAll() {

		System.out.println("Before all test");
	}

	@AfterAll
	void afterAll() {
		System.out.println("test all test");
	}

	Shapes shape;

	@BeforeEach
	void init() {
		shape = new Shapes();
		System.out.println("Before Test");
	}

	@Test
	void testComputeSquareArea() {

		assertEquals(78.5, shape.computeCircleArea(5));
		System.out.println("Actual test running.");
	}

	@Test
	void testComputeCircleArea() {

		assertEquals(78.5, shape.computeCircleArea(5));
		System.out.println("Actual test running.");

	}

	@AfterEach
	void destroy() {
		System.out.println("After test clean up");
	}

}
