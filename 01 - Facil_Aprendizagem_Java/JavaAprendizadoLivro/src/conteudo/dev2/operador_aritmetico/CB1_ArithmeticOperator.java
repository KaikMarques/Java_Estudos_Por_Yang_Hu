package conteudo.dev2.operador_aritmetico;

public class CB1_ArithmeticOperator {
    // Operador Aritmético: adicionar +, menos -, multiplicar *, divisível /, obter módulo%

    public static int add(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(c % b); // resto número após a / b

        int result = add(4, 2); // chame o método add
        System.out.println(result);
        result = add(5, 3);
        System.out.println(result);
    }



}
