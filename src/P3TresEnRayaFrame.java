import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P3TresEnRayaFrame extends JFrame{
    int flag=0;
    public P3TresEnRayaFrame() throws HeadlessException {
        setSize(450,400);
        JPanel panelSuperior=new JPanel();
        panelSuperior.setLayout(new GridLayout(3,3));
        JPanel panel=new JPanel();
        JLabel etiqueta=new JLabel("Turno del jugador X");
        panel.add(etiqueta);
        for (int i=1;i<10;i++){
            JButton boton=new JButton(String.valueOf(i));
            panelSuperior.add(boton);
            boton.getFont().deriveFont(48.0f);
            boton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (flag==0){
                            boton.setText("X");
                            etiqueta.setText("Turno del jugador O");
                            flag=1;
                        } else if (flag==1){
                            boton.setText("O");
                            etiqueta.setText("Turno del jugador X");
                            flag=0;
                        }
                        boton.setEnabled(false);
                    }
            });
        }
        add(panelSuperior);
        add(panel,BorderLayout.PAGE_END);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
