package br.com.caelum.teste;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class MaiorMenorTest {

	
	private MaiorMenor maiorMenor;
	
	@Before
	public void executaAntes(){
		this.maiorMenor = new MaiorMenor();
	}
	
	@Test
	public void numerosEmQualquerOrdem() {
		//MaiorMenor maiorMenor = new MaiorMenor();
		this.maiorMenor.encontra(new int[] {4, 15, 7, 8 });

		Assert.assertEquals(15, maiorMenor.getMaior());
		Assert.assertEquals(4, maiorMenor.getMenor());
	}

	@Test
	public void numerosEmOrdemCrescente() {
		MaiorMenor maiorMenor = new MaiorMenor();
		maiorMenor.encontra(new int[] { 7, 8, 15, 16 });
		Assert.assertEquals(16, maiorMenor.getMaior());
		Assert.assertEquals(7, maiorMenor.getMenor());
	}
	
	@Test
	public void numerosEmOrdemDecrescente() {
		MaiorMenor maiorMenor = new MaiorMenor();
		maiorMenor.encontra(new int[] {16, 15 , 6 , 3 });
		Assert.assertEquals(16, maiorMenor.getMaior());
		Assert.assertEquals(3, maiorMenor.getMenor());
	}
}
