package conteudo.dev1.conceitos_basicos;

public class CB4_BaseDataType {
    public static void main(String[] args) {
        byte a1 = 127; // 1 byte = 8 bits -2^7~2^7-1(-128~127)
        short a2 = 10; // 2 bytes=16 bits -2^15~2^15-1
        int a3 = 100; //4 bytes = 32 bits -2^31~2^31-1
        long a4 = 1000; // 8 bytes = 64 bits -2^63~2^63-1
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

        double b1 = 10.1; // 8 bytes = 64 bits
        float b2 = 12.2f; //4 bytes = 32 bits
        System.out.println(b1);
        System.out.println(b2);
        // char é um único caractere com aspas simples
        char c1 = 'a'; //  2 bytes = 16 bits
        System.out.println(c1);
        boolean d1 = true; // 1 byte = 8 bits
        boolean d2 = false;
        System.out.println(d1);
        System.out.println(d2);
    }
}
