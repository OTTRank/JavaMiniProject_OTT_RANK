package com.sist.client;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame {
    JLabel la1, la2;
    JTextField tf;
    JPasswordField pf;
    JButton b1, b2, b3;

    public Login() {
    	 la1 = new JLabel("ID", JLabel.CENTER);
         la2 = new JLabel("PW", JLabel.CENTER);
         tf = new JTextField();
         pf = new JPasswordField();
         b1 = new JButton("로그인");
         b2 = new JButton("가입");
         b3 = new JButton("취소");
         
         
        setTitle("Login");
        setSize(250, 200); 
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 

        
     
        
        //배치
        setLayout(null);
        la1.setBounds(10, 20, 30, 20);
        tf.setBounds(45, 20, 180, 20);

        la2.setBounds(10, 50, 30, 20);
        pf.setBounds(45, 50, 180, 20);

        JPanel p=new JPanel();
        p.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 0)); 
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.setBounds(10, 85, 215, 30);

        
        add(la1);
        add(tf);
        add(la2);
        add(pf);
        add(p);
    
        b3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();  //취소
        }
      });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();  //창에 뭐 안쳐도 로그인되는 거
            }
        }); 
        
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();  //창에 뭐 안쳐도 로그인되는 거
            }
        }); 
    }
    
    public static void main(String[] args) {
        new Login().setVisible(true);
    }
}
