package conteudo.dev2.operador_aritmetico;

class Caculator{
    public  int add(int a, int b){
        return a + b;
    }
    public  int sub(int a, int b){
        return a - b;
    }
    public  int multiply(int a, int b){
        return a * b;
    }
    public  int divide(int a, int b){
        return a / b;
    }
}

public class CB1_ArithmeticOperator {
    // Operador Aritmético: adicionar +, menos -, multiplicar *, divisível /, obter módulo%

    public static int add(int a, int b){
        return a + b;
    }
    public static int sub(int a, int b){
        return a - b;
    }
    public static int multiply(int a, int b){
        return a * b;
    }
    public static int divide(int a, int b){
        return a / b;
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
        System.out.println(result); //6
        result = sub(4, 2); // chame o método sub
        System.out.println(result); //2
        result = multiply(4, 2); // chame o método multiply
        System.out.println(result); //8
        result = divide(4, 2); // chame o método divide
        System.out.println(result); // 2

        Caculator cal = new Caculator();
        int resultt = cal.add(4, 2); // chame o método add
        System.out.println(result); //6
        result = cal.sub(4, 2); // chame o método sub
        System.out.println(result); //2
        result = cal.multiply(4, 2); // chame o método multiply
        System.out.println(result); //8
        result = cal.divide(4, 2); // chame o método divide
        System.out.println(result); // 2
    }
}
