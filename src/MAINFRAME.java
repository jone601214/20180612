

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
public class MAINFRAME extends JFrame{
    private Container cp;
    private JButton jbtnenter=new JButton("ENTER");
    private JButton jbtnEXIT=new JButton("EXIT");
    private JTextField jlf = new JTextField();
    private JLabel jlb = new JLabel();
    public MAINFRAME() {
        init();
    }
    private void init() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setLocation(100, 50);
        this.setSize(600, 300);
        cp = this.getContentPane();
        jlb.setBounds(400,25,150,100);
        jlb.setFont(new Font(null,Font.BOLD,30));
        jbtnenter.setBounds(200,25,150,100);
        jbtnenter.setFont(new Font(null,Font.BOLD,30));
        jbtnEXIT.setBounds(200,160,150,100);
        jbtnEXIT.setFont(new Font(null,Font.BOLD,30));
        jlf.setBounds(0,25,150,100);
        jlf.setFont(new Font(null,Font.BOLD,30));
        this.add(jbtnenter);
        this.add(jbtnEXIT);
        this.add(jlb);
        this.add(jlf);
        jbtnenter.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try{
double v1=Double.parseDouble(jlf.getText());
double v2=v1*0.6214;
jlb.setText(Double.toString(v2));
                }catch (NumberFormatException e1){
                    JOptionPane.showMessageDialog(MAINFRAME.this,"ERROR");
                }catch (IndexOutOfBoundsException e2){
                    JOptionPane.showMessageDialog(MAINFRAME.this,"ERROR");
                }catch (Exception e3){
                    JOptionPane.showMessageDialog(MAINFRAME.this,"ERROR");
                }
            }
        });
        jbtnEXIT.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }
}
