package com.br.db1.start.test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;

import com.br.db1.start.classes.ExerciciosDate;

class DateTest {
	DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

	@Test
	void testAnoBissexto() {
		LocalDate dataBissexto = LocalDate.parse("10/03/2016", sdf);
		ExerciciosDate data = new ExerciciosDate(dataBissexto);
		assertEquals(true, data.retornaBissexto());
	}

	@Test
	void testDiaUtil() {

		LocalDate novaData = LocalDate.parse("02/06/2018", sdf);
		ExerciciosDate data = new ExerciciosDate(novaData);
		assertEquals(false, data.retornaDiaUtil());

	}

	@Test
	void testIdade() throws ParseException {
		LocalDate novaData = LocalDate.parse("20/06/1993", sdf);
		ExerciciosDate data = new ExerciciosDate(novaData);
		assertEquals(24, data.retornaIdade().intValue());

	}

	@Test
	void testDataBetween() {
		LocalDate dataInicial = LocalDate.parse("20/06/2018", sdf);
		LocalDate dataFinal = LocalDate.parse("20/07/2018", sdf);

		ExerciciosDate data1 = new ExerciciosDate(dataInicial);
		ExerciciosDate data2 = new ExerciciosDate(dataFinal);

		assertEquals(30, data1.retornaDiasEntreDatas(dataFinal).intValue());
	}

	@Test
	void testMesBetween() {
		LocalDate dataInicial = LocalDate.parse("20/05/2018", sdf);
		LocalDate dataFinal = LocalDate.parse("20/07/2018", sdf);

		ExerciciosDate data1 = new ExerciciosDate(dataInicial);
		ExerciciosDate data2 = new ExerciciosDate(dataFinal);

		assertEquals(2, data1.retornaMesEntreDatas(dataFinal).intValue());
	}

	@Test
	void testAnoBetween() {
		LocalDate dataInicial = LocalDate.parse("20/05/2015", sdf);
		LocalDate dataFinal = LocalDate.parse("20/07/2018", sdf);

		ExerciciosDate data1 = new ExerciciosDate(dataInicial);
		ExerciciosDate data2 = new ExerciciosDate(dataFinal);

		assertEquals(3, data1.retornaAnoEntreDatas(dataFinal).intValue());
	}
/*
	@Test
	void testHorasBetween() {
		LocalDate dataInicial = LocalDate.parse("20/06/2018 06:20",dtf);
		LocalDate dataFinal = LocalDate.parse("20/06/2018 04:20", dtf);

		ExerciciosDate data1 = new ExerciciosDate(dataInicial);

		assertEquals(2, data1.retornaHorasEntreDatas(dataFinal).intValue());
		
	}
*/
}
