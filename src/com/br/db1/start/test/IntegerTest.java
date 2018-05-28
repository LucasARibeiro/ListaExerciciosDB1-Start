package com.br.db1.start.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.br.db1.start.classes.ExerciciosInteger;

class IntegerTest {

	@Test
	void testInteger() {

		ExerciciosInteger valores = new ExerciciosInteger(10, 10);
		ExerciciosInteger valorMaior = new ExerciciosInteger(20, 10);
		ExerciciosInteger valor = new ExerciciosInteger(10);
		ExerciciosInteger impares = new ExerciciosInteger(0);

		assertEquals(20, valores.somar().intValue());

		assertEquals(0, valores.subtrair().intValue());

		assertEquals(100, valores.multiplicar().intValue());

		assertEquals(1, valores.dividir().intValue());

		assertEquals(Boolean.TRUE, valor.isPar());

		assertEquals(20, valorMaior.retornaMaior().intValue());

		assertEquals(50, impares.retornaImpares().size());

		assertEquals(1, impares.retornaImpares().get(0).intValue());

		assertEquals(95, impares.retornaImpares().get(47).intValue());

	}

}
