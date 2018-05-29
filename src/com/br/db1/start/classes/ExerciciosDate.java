package com.br.db1.start.classes;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class ExerciciosDate {

	private LocalDate data;
	private LocalDate data2;

	public ExerciciosDate(LocalDate data) {
		this.data = data;
	}

	public ExerciciosDate(LocalDate data, LocalDate data2) {
		this.data = data;
		this.data2 = data2;
	}

	public Boolean retornaBissexto() {

		return data.isLeapYear();
	}

	public Boolean retornaDiaUtil() {
		LocalDate calendario = LocalDate.now();
		if ((data.getDayOfWeek() == DayOfWeek.SATURDAY) || (data.getDayOfWeek() == DayOfWeek.SUNDAY)) {
			return false;
		}
		return true;
	}

	public Integer retornaIdade() {
		LocalDate dataNascimento = data;
		LocalDate hoje = LocalDate.now();
		Integer idade = hoje.getYear() - dataNascimento.getYear();

		if (hoje.getMonthValue() < dataNascimento.getMonthValue()) {
			idade--;
		} else {
			if (hoje.getMonthValue() == dataNascimento.getMonthValue()
					&& hoje.getDayOfMonth() < dataNascimento.getDayOfMonth()) {
				idade--;
			}
		}

		return idade;
	}

	public Long retornaDiasEntreDatas(LocalDate data2) {
		Long periodo = ChronoUnit.DAYS.between(data, data2);
		return periodo;
	}

	public Long retornaMesEntreDatas(LocalDate data2) {
		Long periodo = ChronoUnit.MONTHS.between(data, data2);
		return periodo;
	}

	public Long retornaAnoEntreDatas(LocalDate data2) {
		Long periodo = ChronoUnit.YEARS.between(data, data2);
		return periodo;
	}

	public Long retornaHorasEntreDatas(LocalDate data2) {
		Long periodo = ChronoUnit.HOURS.between(data, data2);
		return periodo;
	}

}
