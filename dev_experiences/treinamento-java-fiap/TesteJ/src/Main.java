import java.time.Year;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);

            // Linda de comentario
            /* Colocando
            varias linhas
            de comentario
            nesse codigo
             */

            // Trabalhando com variaveis
            String texto = "Um texto";
            int inteiro = 10;
            float decimal = 5.5f;
            boolean bool = true;

            // Quando utilizamos o var, e feita uma
            // inferencia automatica de tipo
            var outroTexto = "Outro texto";
            var dadoA = 1;
            var dadoB = 10.6;
            var dadoC = true;

            var multiTexto =
                    """
                    posso escrever
                    texto multinline
                    com o objetivo
                    de escrever varias
                    linhas dentro de um
                    codigo
                    """;

            Integer meuNum = null; // valores null sao perigosas

            String[] frutas = {"Laranja", "Maca", "Mamao"};
                //indices do array  0        1        2

            System.out.println(frutas[1]);
            System.out.println("Lavoura");
            System.out.println("Roca");

            int valueA = 10;
            valueA += 5;

            System.out.println(valueA);

            valueA -= 3;

            System.out.println(valueA);

            int x = 10;
            int y = 20;

            System.out.println("Operador logico && AND");
            System.out.println(10 == 10 && x == y);

            System.out.println("Operador logico || OR");
            System.out.println(10 == 10 || x == y);

            Integer u = 20;
            Integer w = 20;

            // Utilizando comparacao com classes
            System.out.println(u.equals(w));

            // Em char, utilizamos aspas simples ' '
            char letra = 'A';

            String name = "Joaquim Jose";

            System.out.println(name.charAt(3));

            System.out.println(name.length());
            System.out.println(name.contains("a"));

            var numA = 1.0;
            var numB = 1.0f;

            Year ano = Year.of(2023);

            String firstName = "Antonio";
            String lastName = "da Silva";

            System.out.println(firstName + " " + lastName);

            String otherName = "Maria da Penha";
            int age = 60;

            // Interpolar dados em textos (String.format)
            // O que significa interpolar em Java?
            // Interpolar significa inserir valores dentro de uma string
            // de forma dinâmica, utilizando placeholders.
            // Exemplo de interpolação de dados em Java:
            String interpolatedString = String.format("Meu nome é %s e tenho %d anos.", otherName, age);
            System.out.println(interpolatedString);


        }
    }
}

//TIP To learn more about IntelliJ IDEA, visit https://www.jetbrains.com/idea/
//TIP To discover more shortcuts, press <shortcut actionId="ShowKeymap" /> and open the Keymap reference card.
//TIP To find more tips, press <shortcut actionId="ShowTipsAction" /> and open the Tips of the Day popup.
//TIP To search for an action, press <shortcut actionId="FindAction" /> and start typing the action name.
//TIP To learn more about the editor, visit https://www.jetbrains.com/help/idea/using-editor.html
//TIP To learn more about the IDE features, visit https://www.jetbrains.com/help/idea/discover-intellij-idea.html
//TIP To learn more about the IDE shortcuts, visit https://www.jetbrains.com/help/idea/keyboard-shortcuts-you-cannot
//TIP To learn more about the IDE settings, visit https://www.jetbrains.com/help/idea/configuring-intellij-idea.html
//TIP To learn more about the IDE plugins, visit https://www.jetbrains.com/help/idea/discovering-plugins.html
