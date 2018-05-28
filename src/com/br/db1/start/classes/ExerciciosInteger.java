package com.br.db1.start.classes;

import java.util.ArrayList;
import java.util.List;

public class ExerciciosInteger {

	private Integer valor1;
	private Integer valor2;

	public ExerciciosInteger(Integer valor1, Integer valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	public ExerciciosInteger(Integer valor) {
		this.valor1 = valor;
	}

	public Integer getValor1() {
		return valor1;
	}

	public void setValor1() {
		this.valor1 = valor1;
	}

	public Integer getValor2() {
		return valor2;
	}

	public void setValor2() {
		this.valor2 = valor2;
	}

	public Integer somar() {
		return valor1 + valor2;
	}

	public Integer subtrair() {
		return valor1 - valor2;
	}

	public Integer multiplicar() {
		return valor1 * valor2;
	}

	public Integer dividir() {
		return valor1 / valor2;

	}

	public Boolean isPar() {
		if (valor1 % 2 == 0) {
			return true;
		}
		return false;
	}

	public Integer retornaMaior() {
		return Math.max(valor1, valor2);
	}

	public List<Integer> retornaImpares() {
		List<Integer> listaDeImpares = new ArrayList<>();
		for (Integer contador = valor1; contador <= 100; contador++) {
			if (contador % 2 == 1) {
				listaDeImpares.add(contador);
				System.out.println(contador + " é impar");
			}
		}
		return listaDeImpares;
	}

}
