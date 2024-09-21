package conteudo.dev2.operador_aritmetico;

// Integer.parseInt():este é o método padrão de java pode converter string em inteiro.

public class CB2_TypeConversion {
    public static void main(String[] args) {
        String a="1";
        String b="2";
        String result = a + b; // + concatenar duas strings
        System.out.println(result); //  12
        int total = Integer.parseInt(a) +Integer.parseInt(b);
        System.out.println(total); //  3
    }
}
