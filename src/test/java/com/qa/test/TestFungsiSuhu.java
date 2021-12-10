package com.qa.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.qa.main.function.SuhuFunction;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;


@RunWith(JUnitParamsRunner.class)
public class TestFungsiSuhu {
	
	SuhuFunction function;

	@Before
	public void setUp() throws Exception {
		function = new SuhuFunction();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@FileParameters("src/test/resources/SkenarioSuhu.csv")
	public void testLuasSuhu(double suhu, double hasil) {
		assertEquals(hasil, function.luasSuhu(suhu), 0.9 );
	}

}
