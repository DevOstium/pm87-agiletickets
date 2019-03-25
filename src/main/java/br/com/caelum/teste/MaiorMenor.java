package br.com.caelum.teste;

public class MaiorMenor {

	private int maior = Integer.MIN_VALUE;
	private int menor = Integer.MAX_VALUE;

	public void encontra(int[] numero) {

		for (int n : numero) {
			if (n < this.menor)
				menor = n;
			if (n > this.maior)
				maior = n;
		}

	}

	public int getMaior() {
		return maior;
	}

	public void setMaior(int maior) {
		this.maior = maior;
	}

	public int getMenor() {
		return menor;
	}

	public void setMenor(int menor) {
		this.menor = menor;
	}

}
