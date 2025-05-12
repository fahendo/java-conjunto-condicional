import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Trabalhando com colecoes
        // Discos de Vinil
        // Latas de refrigerante

        // So podemos colecionar objetos que sejam do mesmo tipo

        // Arrays Primitivos - tipo[] nome = {valores}
        int numbers[] = {2, 4, 6, 8, 10};

        String[] names = {
                "Lucas",    // 0
                "João",     // 1
                "Maria",    // 2
                "Ana"       // 3
        };

        // Diferentes indicacoes de blocos
        // Trabalhando com () - Bloco e uma Tupla
        // Trabalhando com [] - Bloco de colecao e uma Lista
        // Trabalhando com {} - Bloco de execucao e um Conjunto - Escopo

        // Imprimindo um array primitivo - ao imprimir um array primitivo
        // Teremos uma resposta de baixo nivel
        System.out.println(numbers);
        System.out.println(names);

        // Acessando um item de um array
        System.out.println(names[0]); // Lucas
        System.out.println(names[1]); // João
        System.out.println(names[2]); // Maria
        System.out.println(names[3]); // Ana

        // Tratando exceptions e nao parando a execucao
        // Tentativa  de executar um codigo

        try{
            System.out.println(names[90]);
        }
        catch (Exception anExept){
            System.out.println(anExept);
        }

        // Modificando um item do array
        System.out.println(numbers[0]); // 2
        numbers[0] = 99;
        System.out.println(numbers[0]); // 99

        // Contando quantidade de elementos de um array
        System.out.println("Tamanho do array: " + numbers.length);
        // Arrays primitivos nao podem ser acrescidos ou diminuidos

        // Primeiro elemento do array
        System.out.println("Primeiro elemento do array: " + names[0]);

        // Ultimo elemento do array
        System.out.println("Ultimo elemento do array: " + numbers[names.length - 1]);

        // Criando um array vazio
        int[] emptyArray = {};

        // Verificando se um array esta vazio
        System.out.println(emptyArray.length == 0);

        // Trabalhando com o java.util
        // Imprimindo um array Primitivo com ajuda com java.util
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(numbers));

        // Trabalhando com ArrayList
        // Arrays Mutaveis (Podem mudar de tamanho) e 100% imprimiveis
        ArrayList<String> fruits = new ArrayList<>();

        System.out.println(fruits);
        // Adicionando elementos
        fruits.add("Banana");
        fruits.add("Maça");
        fruits.add("Laranja");

        // Imprimindo o array
        System.out.println(fruits);

        // Modificando um elemento do ArrayList
        fruits.set(0, "Uva");
        System.out.println(fruits);

        // Medindo o tamanho do ArrayList
        System.out.println("Tamanho do array: " + fruits.size());

        // Pegando o ultimo elemento do ArrayList
        System.out.println(fruits.get(fruits.size() - 1));

        // Medindo o tamanho do array

        // Trabalhando com loops for each em arrays primitivos
        for(String aName: names){
            System.out.println(aName);
        }

        // Trabalhando com loops for each em ArrayList
        System.out.println("\n\n");
        fruits.forEach(aFruit -> System.out.println(aFruit));



        }
    }