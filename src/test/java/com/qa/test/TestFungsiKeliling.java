package com.qa.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.qa.main.function.KelilingFunction;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class TestFungsiKeliling {
	
	KelilingFunction function;

	@Before
	public void setUp() throws Exception {
		function = new KelilingFunction();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@FileParameters("src/test/resources/SkenarioKeliling.csv")
	public void testLuasKeliling(double panjang, double lebar, double tinggi, double hasil) {
		assertEquals(hasil, function.luasKeliling(panjang,lebar,tinggi), 0.0 );
	}
	
	@Test
	@FileParameters("src/test/resources/SkenarioVolume.csv")
	public void testLuasVolume(double panjang, double lebar, double tinggi, double hasil) {
		assertEquals(hasil, function.luasVolume(panjang,lebar,tinggi), 0.0 );
	}

}
