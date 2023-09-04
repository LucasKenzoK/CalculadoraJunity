package calculadora;

public class JavaCalculadoraMain {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		// SOMANDO
		int soma = calc.Somar(3, 7);
		System.out.println(soma);

		soma = calc.Somar(3, 0);
		System.out.println(soma);

		soma = calc.Somar(0, 0);
		System.out.println(soma);

		soma = calc.Somar(3, -1);
		System.out.println(soma);

		// SUBITRAINDO
		int subtrair = calc.Subtrair(3, 2);
		System.out.println(subtrair);

		subtrair = calc.Subtrair(5, 5);
		System.out.println(subtrair);

		subtrair = calc.Subtrair(0, -4);
		System.out.println(subtrair);

		subtrair = calc.Subtrair(0, 0);
		System.out.println(subtrair);

		// DIVIDINDO
		int divisao = calc.Dividir(4, 2);
		System.out.println(divisao);

		divisao = calc.Dividir(5, 5);
		System.out.println(divisao);

		divisao = calc.Dividir(0, 2);
		System.out.println(divisao);

		divisao = calc.Dividir(1, -1);
		System.out.println(divisao);
		// MULTIPLICANDO
		int multiplicar = calc.Multiplicar(2, 5);
		System.out.println(multiplicar);

		multiplicar = calc.Multiplicar(0, 0);
		System.out.println(multiplicar);

		multiplicar = calc.Multiplicar(2, 2);
		System.out.println(multiplicar);

		multiplicar = calc.Multiplicar(-1, 1);
		System.out.println(multiplicar);
	}
}
