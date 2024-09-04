package com.naw.learning;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.Test;

public class TestingPerformance {

	@Test
	void testSortingMethod_Performance() {
		SortingArray array = new SortingArray();
		int[] unsorted = { 2, 5, 1 };
		assertTimeout(Duration.ofMillis(12), () -> array.sortingArray(unsorted));
	}

}
