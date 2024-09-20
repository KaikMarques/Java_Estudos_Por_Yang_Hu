package conteudo.dev1.conceitos_basicos;

public class CB3_TestVariable {
    public static void main(String[] args) {
        String cup = "mineral water";
        // Imprima os dados da xícara no console
        System.out.println(cup);
        // Modifique o valor da variável
        cup = "cola";
        System.out.println(cup);
        // Esvazie a variável, esvazie os dados da memória do copo
        cup = "";
        System.out.println(cup);
        // Atribua um valor ao nulo para excluir a variável
        cup = null;
        System.out.println(cup);
    }
}
