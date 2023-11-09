package calculadora;

/**
 * A classe Calculadora realiza operacoes basicas de aritmetica.
 * Suporta operacoes de soma, subtracao, multiplicacao e divisao.
 * <p>
 * <b>Autor:</b> Lucas Kenzo Credendio Kuwajima
 * <br>
 * <b>Data de Lancamento:</b> 09 de novembro de 2023
 * <br>
 * <b>Versao:</b> 1.0
 * </p>
 */
public class Calculadora {

    /**
     * Realiza a operacao de soma entre dois numeros inteiros.
     *
     * @param a O primeiro numero a ser somado.
     * @param b O segundo numero a ser somado.
     * @return A soma dos dois numeros.
     */
    public int Somar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a operacao de subtracao entre dois numeros inteiros.
     *
     * @param a O numero do qual sera subtraido o segundo numero.
     * @param b O numero a ser subtraido do primeiro numero.
     * @return A diferenca entre os dois numeros.
     */
    public int Subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a operacao de divisao entre dois numeros inteiros.
     *
     * @param a O dividendo.
     * @param b O divisor (nao pode ser zero).
     * @return O resultado da divisao.
     */
    public int Dividir(int a, int b) {
        // Certifique-se de que o divisor nao seja zero para evitar excecoes.
        if (b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException("Nao e possivel dividir por zero.");
        }
    }

    /**
     * Realiza a operacao de multiplicacao entre dois numeros inteiros.
     *
     * @param a O primeiro fator.
     * @param b O segundo fator.
     * @return O produto dos dois numeros.
     */
    public int Multiplicar(int a, int b) {
        return a * b;
    }
}
