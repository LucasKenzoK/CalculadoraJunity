package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;


public class JUnitTest {
	@SuppressWarnings("deprecation")

	// ADIÇÃO
		@Test
		public void SomarDoisNumerosPositivos() {
			Calculadora calc = new Calculadora();
			int soma = calc.Somar(7, 3);
			Assert.assertEquals(10, soma);
		}

		@Test
		public void SomarDoiNumerosNegativos() {
			Calculadora calc = new Calculadora();
			int soma = calc.Somar(-7, -3);
			Assert.assertEquals(-10, soma);
		}

		@Test
		public void SomarUmNumeroNegativoComPositivo() {
			Calculadora calc = new Calculadora();
			int soma = calc.Somar(-7, 3);
			Assert.assertEquals(-4, soma);
		}

		@Test
		public void SomaComZero() {
			Calculadora calc = new Calculadora();
			int soma = calc.Somar(0, 3);
			Assert.assertEquals(3, soma);
		}

		// SUBTRAÇÃO
		@Test
		public void SubtrairDoisNumerosPositivo() {
			Calculadora calc = new Calculadora();
			int sub = calc.Subtrair(3, 2);
			Assert.assertEquals(1, sub);
		}

		@Test
		public void SubtrairResultadoMenorQueZero() {
			Calculadora calc = new Calculadora();
			int sub = calc.Subtrair(2, 3);
			Assert.assertEquals(-1, sub);
		}

		@Test
		public void SubtrairComNegativo() {
			Calculadora calc = new Calculadora();
			int sub = calc.Subtrair(3, -1);
			Assert.assertEquals(4, sub);
		}
		
		@Test
		public void SubtrairDoisNegativos() {
			Calculadora calc = new Calculadora();
			int sub = calc.Subtrair(-3, -1);
			Assert.assertEquals(-2, sub);
		}
		
		@Test
		public void SubatrairZero() {
			Calculadora calc = new Calculadora();
			int sub = calc.Subtrair(0, 0);
			Assert.assertEquals(0, sub);
		}
		
		//Dividindo
		@Test
		public void DividirDoisInteirosPositivos() {
			Calculadora calc = new Calculadora();
			int div = calc.Dividir(4, 2);
			Assert.assertEquals(2, div);
		}
		
		@Test
		public void DividindoComResultadoQuebrado() {
			Calculadora calc = new Calculadora();
			int div = calc.Dividir(4, 3);
			Assert.assertEquals(1.3, div);
		}
		@Test
		public void DividindoPorNegativo() {
			Calculadora calc = new Calculadora();
			int div = calc.Dividir(4, -2);
			Assert.assertEquals(-2, div);
		}
		
		@Test
		public void DividindoPorZero() {
			Calculadora calc = new Calculadora();
			int div = calc.Dividir(4, 0);
			Assert.assertEquals(-2, div);
		}
		
		@Test
		public void DividindoPorDivisorMaior() {
			Calculadora calc = new Calculadora();
			int div = calc.Dividir(4, 8);
			Assert.assertEquals(0.5, div);
		}
		
		//Multiplicando
		
		@Test
		public void MultiplicandoDoisNumerosInteirosPositivos() {
			Calculadora calc = new Calculadora();
			int multi = calc.Multiplicar(4, 2);
			Assert.assertEquals(8, multi);
		}
		
		@Test
		public void MultiplicandoPorNegativo() {
			Calculadora calc = new Calculadora();
			int multi = calc.Multiplicar(4, -2);
			Assert.assertEquals(-8, multi);
		}
		
		@Test
		public void MultiplicandoPorZero() {
			Calculadora calc = new Calculadora();
			int multi = calc.Multiplicar(4, 0);
			Assert.assertEquals(0, multi);
		}
		
		@Test
		public void MultiplicandoZeroporOutroNumero() {
			Calculadora calc = new Calculadora();
			int multi = calc.Multiplicar(0, 2);
			Assert.assertEquals(0, multi);
		}
}
