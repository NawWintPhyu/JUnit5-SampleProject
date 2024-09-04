package com.naw.learning;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TestException {

	@Test
	void testSortingArray_Exception() {
		try {
			SortingArray array = new SortingArray();
//			int unsorted[] = { 2, 4, 5 };
//			array.sortingArray(unsorted);
//			fail();
			int unsorted[] =null;
			assertThrows(NullPointerException.class, () -> array.sortingArray(unsorted));
		} catch (NullPointerException e) {

			System.out.println("Exception Generated");
		}
	}

}
