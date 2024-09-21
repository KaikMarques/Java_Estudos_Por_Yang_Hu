package conteudo.dev2.operador_aritmetico;

import javax.swing.*;
/*
    JFrame: classe é um tipo de contêiner pode criar uma janela.
    JFrame.setSize(int width, int height): defina o tamanho da moldura.
    JFrame.setVisible(true): definir visível do quadro para abrir uma janela.
    import javax.swing.* : fornece classes para java swing GUI API
*/


public class CB3_FirstGUIApplication {
    public static void main(String[] args) {
        JFrame frame = new JFrame(" Java GUI Application");

        JLabel label = new JLabel(" I loving Java Application");
        frame.add(label); // add JLabel ao frame

        frame.setSize(300,200);
        frame.setVisible(true);
    }
}
