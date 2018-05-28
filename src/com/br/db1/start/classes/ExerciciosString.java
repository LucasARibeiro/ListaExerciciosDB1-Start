package com.br.db1.start.classes;

public class ExerciciosString {

	private String texto;

	public ExerciciosString() {
	}

	public ExerciciosString(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String retornaMaiuscula() {
		return texto.toUpperCase();
	}

	public String retornaMinuscula() {
		return texto.toLowerCase();
	}

	public Integer retornaQuantidadeLetras() {
		return texto.length();
	}

	public Integer retornaTrin() {
		return texto.trim().length();
	}

	public String retornaQuatroLetras() {
		return texto.substring(0, 4);
	}

	public String retornaDepoisDoTerceiroChar() {
		return texto.substring(2);
	}

	public String retornaQuatroUltimosChar() {
		return texto.substring(texto.length() - 4);

	}

	public String retornaAlteracaoPrimeiroNome() {
		String nome;
		nome = texto.substring(0, texto.indexOf(" "));
		return texto.replace(nome, "ALUNO");
	}

	public String[] retornaSplit() {
		String[] texto2 = texto.split(",");
		return texto2;

	}

	public Integer retornaQuantidadeDeVogais() {
		texto = texto.toLowerCase();
		Integer quantidade = 0;

		for (Integer contador = 0; contador < texto.length(); contador++) {
			if (texto.charAt(contador) == 'a' || texto.charAt(contador) == 'e' || texto.charAt(contador) == 'i'
					|| texto.charAt(contador) == 'o' || texto.charAt(contador) == 'u') {
				quantidade++;
			}

		}
		return quantidade;
	}

	public String retornaInvertido() {
		return new StringBuilder(texto).reverse().toString();
	}

}
