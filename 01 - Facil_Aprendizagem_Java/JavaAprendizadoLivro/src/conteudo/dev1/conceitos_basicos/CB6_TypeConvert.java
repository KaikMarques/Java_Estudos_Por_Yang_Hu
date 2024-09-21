package conteudo.dev1.conceitos_basicos;

public class CB6_TypeConvert {

    public static void main(String[] args) {

        byte varByte = 1;
        int varInt = 2;
        // byte é convertido diretamente int        
        varInt = varByte;
        System.out.println(varInt);

        byte varBtye2 = 1;
        int varInt2 = 2;
        // int é convertido em byte precisa de downcast
        varBtye2 = (byte) varInt2;
        System.out.println(varBtye2);

        char f1 = 'a';
        int f2 = 98;
        // int pode ser convertido em um char need cast, A regra de conversão por ASCII.
        // estamos convertendo o valor 98 para char. Na tabela ASCII, o número 98 representa o caractere 'b'.
        f1 = (char) f2;
        System.out.println(f1);
    }
}
