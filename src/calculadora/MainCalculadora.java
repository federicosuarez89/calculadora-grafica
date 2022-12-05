package calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainCalculadora implements ActionListener {
    int contador=0;
   JLabel texto;


    public MainCalculadora(){
        JFrame ventana=new JFrame();
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setTitle("Calculadora");
        ventana.setLocation(new Point(400,200));
        ventana.setSize(new Dimension(400,300));
        JPanel grupo=new JPanel();
        grupo.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
        grupo.setLayout(new GridLayout(0,1));

        ventana.add(grupo,BorderLayout.CENTER);

        JButton boton = new JButton("Click");
        boton.addActionListener(this);
        grupo.add(boton);

        texto=new JLabel("Cantidad de clicks: 0");
        grupo.add(texto);
    }

    public static void main(String[] args) {
        new MainCalculadora();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        contador++;
        texto.setText("Cantidad de clicks: "+contador);
    }
}
