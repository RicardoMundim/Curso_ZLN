package br.com.fundamentos.tipos;

public class Metodos {

	public String getVerificaMaior(int x, int y) {

		String mensagemExibida;

		if (x > y) {
			mensagemExibida = "O primeiro número informado é o maior.";
		} else if (x < y) {
			mensagemExibida = "O segundo número informado é o maior.";
		} else {
			mensagemExibida = "Os números informados são iguais.";
		}

		return mensagemExibida;
	}

	public String getImprimiSequencial(int x, int y) {

		String resultado = "";

		if (x < 0 || y < 0) {
			resultado = "Não é permitido valor negativos";
		} else if (x == y) {
			resultado = "Os números informados são iguais. Não possui números sequenciais para imprimir.";
		} else if (x > y) {
			resultado = "O primeiro número informado é maior que o segundo. Não possui sequencia crescente para imprimir.";
		} else {
			for (int i = x; i <= y; i++) {
				resultado = resultado + i + " ";
			}
		}
		return resultado;
	}

	public String getImprimiSequencialLaco(int x, int y, String laco) {

		String resultado = "";
		String resultado1 = "";

		if (x < 0 || y < 0) {
			resultado = "Não é permitido valor negativos";
		} else if (x == y) {
			resultado = "Os números informados são iguais. Não possui números sequenciais para imprimir.";
		} else if (x > y) {
			resultado = "O primeiro número informado é maior que o segundo. Não possui sequencia crescente para imprimir.";
		} else {
			resultado = "<b>O metodo utilizado para mostar os dados foi o " + laco.toUpperCase() + "</b><br><br>";
		}
			
		if(!laco.equals("") && !resultado.equals("")) {
			if (laco.equals("For")) {
				for (int i = x; i <= y; i++) {
					resultado1 = resultado1 + i + " ";
			}
		} else if (laco.equals("While")) {
			while (x <= y) {
				resultado1 = resultado1 + x + " ";
				x = x + 1;
			}
		} else if (laco.equals("Do While")) {
			do {
				resultado1 = resultado1 + x + " ";
				x = x + 1;
			} while (x <= y);
		}
		
		}
		return (resultado + resultado1);
	}
}
