import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P1MenuColoresFrame {
    public static void main(String[] args) {
        JFrame ventana=new JFrame("P1MenuColoresFrame");
        ventana.setSize(640,480);
        JMenuBar menuBar=new JMenuBar();
        JMenu colores=new JMenu("Colores");
        JMenuItem rojo=new JMenuItem("Rojo");
        JMenuItem verde=new JMenuItem("Verde");
        JMenuItem azul=new JMenuItem("Azul");
        JMenuItem salir=new JMenuItem("Salir");
        colores.add(rojo);
        colores.add(verde);
        colores.add(azul);
        colores.addSeparator();
        colores.add(salir);
        menuBar.add(colores);
        ventana.setJMenuBar(menuBar);
        JPanel panel=new JPanel();

        rojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    panel.setBackground(Color.RED);
            }
        });
        verde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.GREEN);
            }
        });
        azul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.BLUE);
            }
        });
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        ventana.add(panel);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
