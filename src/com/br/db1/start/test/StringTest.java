package com.br.db1.start.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.br.db1.start.classes.ExerciciosString;

class StringTest {

	@Test
	void testString() {

		ExerciciosString array = new ExerciciosString("banana, maça, melancia");
		ExerciciosString textoMinusculo = new ExerciciosString("lucas adriano ribeiro");
		ExerciciosString textoMaiusculo = new ExerciciosString("LUCAS ADRIANO RIBEIRO");
		ExerciciosString db1 = new ExerciciosString("DB1START");
		ExerciciosString texto = new ExerciciosString(" DB1START ");
		ExerciciosString vogais = new ExerciciosString("vogal");

		assertEquals("LUCAS ADRIANO RIBEIRO", textoMinusculo.retornaMaiuscula());

		assertEquals("lucas adriano ribeiro", textoMaiusculo.retornaMinuscula());

		assertTrue(8 == db1.retornaQuantidadeLetras());

		assertTrue(10 == texto.retornaQuantidadeLetras());

		assertEquals(8, texto.retornaTrin().intValue());

		assertEquals("luca", textoMinusculo.retornaQuatroLetras());

		assertEquals("cas adriano ribeiro", textoMinusculo.retornaDepoisDoTerceiroChar());

		assertEquals("EIRO", textoMaiusculo.retornaQuatroUltimosChar());

		assertEquals("ALUNO ADRIANO RIBEIRO", textoMaiusculo.retornaAlteracaoPrimeiroNome());

		assertEquals(3, array.retornaSplit().length);

		assertEquals(2, vogais.retornaQuantidadeDeVogais().intValue());

		assertEquals("TRATS1BD", db1.retornaInvertido());

	}

}
