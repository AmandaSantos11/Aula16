package AulaDebug;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioDebug {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================================================");
        System.out.println("Exemplo do calculo do retangulo com funções");
        System.out.println("=========================================================");
        calcularSomaAreas();

        System.out.println("=========================================================");
        System.out.println("Exemplo de mostrar lista de números com funções");
        System.out.println("=========================================================");
        mostrarTodosOsValoresListaNumero();

        System.out.println("=========================================================");
        System.out.println("Exemplo de mostrar lista de quantidade de nomes com funções");
        System.out.println("=========================================================");
        System.out.println("Digite a capacidade: ");
        capacidade = scanner.nextInt();
        mostrarMensagemComQuantidade(capacidade);

        System.out.println("=========================================================");
        System.out.println("Lista nomes: "+retornarListaNomes());

        //List<String> listaNomesComQuantidade = mostrarMensagemComQuantidade();
        //System.out.println("Exemplo de array "+listaNomesComQuantidade);
        //List<Integer> listaNumerosArray = retornarListaNumeros();
        //mostrarTodosOsValoresListaNumero(listaNumerosArray);
    }
    public static double calcularAreaRetanguloComInputUsuario() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base: ");
        double base = scanner.nextDouble();
        System.out.println("Digite a altura: ");
        double altura = scanner.nextDouble();

        double areaRetangulo = base * altura;
        System.out.println("O valor da área é de "+areaRetangulo);

        return areaRetangulo;
    }

    //public static void calcularAreaRetangulo(double base, double altura) {
    //double areaRetangulo = base * altura;
    // System.out.println("O valor da área do retangulo é "+areaRetangulo);
    //}

    public static void calcularSomaAreas() {
        //Exemplo de uso do retorno de outra função
        double somaAreas = calcularAreaRetanguloComInputUsuario() + calcularAreaRetanguloComInputUsuario();
        System.out.println("A area total de construção é de: "+somaAreas);
    }

    public static void mostrarTodosOsValoresListaNumero() {
        System.out.println(retornarListaNumeros());
    }

    public static List<Integer> retornarListaNumeros() {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listaNumero = new ArrayList<>();
        int lista  = 3;

        for (int i = 0; i < lista; i++) {

            System.out.println("Digite um numero: ");
            int numero = scanner.nextInt();

            listaNumero.add(numero);
        }
        return listaNumero;
    }

    public static void mostrarMensagemComQuantidade(int capacidade) {
        System.out.println("A quantidade de nomes é: "+capacidade);
    }

    public static int capacidade;

    public static List<String> retornarListaNomes() {

        Scanner scanner = new Scanner(System.in);

        List<String> listaNomes = new ArrayList<>();

        for (int i = 0; i < capacidade; i++) {
            System.out.println("Digite um nome: ");
            listaNomes.add(scanner.next());
        }
        return listaNomes;
    }
}
