package com.br.db1.start.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.br.db1.start.classes.ExerciciosDouble;

class DoubleTest {

	@Test
	void testDouble() {

		ExerciciosDouble valores = new ExerciciosDouble(10d, 20d);
		ExerciciosDouble valores2 = new ExerciciosDouble(30d, 10d, 20d);

		assertEquals(10d, valores.menorValorEmDois().doubleValue());

		assertEquals(10d, valores2.menorValorEmTres().doubleValue());

		assertEquals(20d, valores2.retornaMedia().doubleValue());

		assertEquals(100d, valores.calculaAreaTriangulo().doubleValue());

	}

}
