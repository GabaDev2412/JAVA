package utilidade;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros(){
        this.numeros = new ArrayList<>();
    };

    public void adicionarNumero(int numero){
        numeros.add(numero);
    };

    public int somarNumeros(){
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    };

    public void maiorNumero(){
        int maior = 0;
        for (int numero : numeros) {
            if (numero > maior){
                maior = numero;
            }
        }
        System.out.println("O maior número é: " + maior);
    };

    public void menorNumero(){
        int menor = numeros.get(0);
        for (int numero : numeros) {
            if (numero < menor){
                menor = numero;
            }
        }
        System.out.println("O menor número é: " + menor);
    };

    public void listarNumeros(){
        System.out.println("Números: " + numeros);
    };
}
