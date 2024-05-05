import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculater extends JFrame implements ActionListener {
    JTextField jTextField;
    JButton[] numberbutton=new JButton[10];
    JButton [] functionbutton=new JButton[8];

    JButton jButton1,jButton2,jButton3,jButton4,jButton5,jButton6,
    jButton7,jButton8,jButton9,jButton10,jButton11,jButton12,jButton13,jButton14,jButton15,
    jButton16,jButton17;

    double num1=0,num2=0,result=0;
    char operator;
    calculater(){
        JPanel jPanel=new JPanel();
        jPanel.setLayout(null);
        this.add(jPanel);
        this.setSize(260,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(300,160);
        this.setTitle("Calculator");
        this.setVisible(true);

        ImageIcon ic=new ImageIcon("calculator.png");
        this.setIconImage(ic.getImage());

        jTextField=new JTextField();
        jTextField.setBounds(17,13,200,30);
        jPanel.add(jTextField);

        jButton1=new JButton("C");
        jButton1.setBounds(70,70,55,25);
        jButton1.setFocusable(false);
        jButton1.addActionListener(this);
        jPanel.add(jButton1);

        jButton2=new JButton("+");
        jButton2.setBounds(160,70,55,25);
        jButton2.setFocusable(false);
        jButton2.addActionListener(this);
        jPanel.add(jButton2);

        jButton3=new JButton(String.valueOf(7));
        jButton3.setBounds(10,115,43,25);
        jButton3.setFocusable(false);
        jButton3.addActionListener(this);
        jPanel.add(jButton3);

        jButton4=new JButton(String.valueOf(8));
        jButton4.setBounds(70,115,43,25);
        jButton4.setFocusable(false);
        jButton4.addActionListener(this);
        jPanel.add(jButton4);


        jButton5=new JButton(String.valueOf(9));
        jButton5.setBounds(130,115,43,25);
        jButton5.setFocusable(false);
        jButton5.addActionListener(this);
        jPanel.add(jButton5);

        jButton6=new JButton("-");
        jButton6.setBounds(190,115,43,25);
        jButton6.setFocusable(false);
        jButton6.addActionListener(this);
        jPanel.add(jButton6);

        jButton7=new JButton(String.valueOf(4));
        jButton7.setBounds(10,160,43,25);
        jButton7.setFocusable(false);
        jButton7.addActionListener(this);
        jPanel.add(jButton7);


        jButton8=new JButton(String.valueOf(5));
        jButton8.setBounds(70,160,43,25);
        jButton8.setFocusable(false);
        jButton8.addActionListener(this);
        jPanel.add(jButton8);

        jButton9=new JButton(String.valueOf(6));
        jButton9.setBounds(130,160,43,25);
        jButton9.setFocusable(false);
        jButton9.addActionListener(this);
        jPanel.add(jButton9);


        jButton10=new JButton("*");
        jButton10.setBounds(190,160,43,25);
        jButton10.setFocusable(false);
        jButton10.addActionListener(this);
        jPanel.add(jButton10);


        jButton11=new JButton(String.valueOf(1));
        jButton11.setBounds(10,205,43,25);
        jButton11.setFocusable(false);
        jButton11.addActionListener(this);
        jPanel.add(jButton11);

        jButton12=new JButton(String.valueOf(2));
        jButton12.setBounds(70,205,43,25);
        jButton12.setFocusable(false);
        jButton12.addActionListener(this);
        jPanel.add(jButton12);

        jButton13=new JButton(String.valueOf(3));
        jButton13.setBounds(130,205,43,25);
        jButton13.setFocusable(false);
        jButton13.addActionListener(this);
        jPanel.add(jButton13);

        jButton14=new JButton("/");
        jButton14.setBounds(190,205,43,25);
        jButton14.setFocusable(false);
        jButton14.addActionListener(this);
        jPanel.add(jButton14);

        jButton15=new JButton(String.valueOf(0));
        jButton15.setBounds(10,250,43,25);
        jButton15.setFocusable(false);
        jButton15.addActionListener(this);
        jPanel.add(jButton15);

        jButton16=new JButton(".");
        jButton16.setBounds(70,250,43,25);
        jButton16.setFocusable(false);
        jButton16.addActionListener(this);
        jPanel.add(jButton16);

        jButton17=new JButton("=");
        jButton17.setBounds(130,250,105,25);
        jButton17.setFocusable(false);
        jButton17.addActionListener(this);
        jPanel.add(jButton17);




    }
    public static void main(String args[]){

        new calculater();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==jButton3){
            jTextField.setText(jTextField.getText().concat(String.valueOf(7)));
        }
        if(e.getSource()==jButton4){
            jTextField.setText(jTextField.getText().concat(String.valueOf(8)));
        }
        if(e.getSource()==jButton5){
            jTextField.setText(jTextField.getText().concat(String.valueOf(9)));
        }
        if(e.getSource()==jButton7){
            jTextField.setText(jTextField.getText().concat(String.valueOf(4)));
        }
        if(e.getSource()==jButton8){
            jTextField.setText(jTextField.getText().concat(String.valueOf(5)));
        }
        if(e.getSource()==jButton9){
            jTextField.setText(jTextField.getText().concat(String.valueOf(6)));
        }
        if(e.getSource()==jButton11){
            jTextField.setText(jTextField.getText().concat(String.valueOf(1)));
        }
        if(e.getSource()==jButton12){
            jTextField.setText(jTextField.getText().concat(String.valueOf(2)));
        }
        if(e.getSource()==jButton13){
            jTextField.setText(jTextField.getText().concat(String.valueOf(3)));
        }
        if(e.getSource()==jButton15){
            jTextField.setText(jTextField.getText().concat(String.valueOf(0)));
        }
        if(e.getSource()==jButton16){
            jTextField.setText(jTextField.getText().concat("."));
        }
        if(e.getSource()==jButton2){
            num1=Double.parseDouble(jTextField.getText());
            operator='+';
            jTextField.setText("");
        } if(e.getSource()==jButton6){
            num1=Double.parseDouble(jTextField.getText());
            operator='-';
            jTextField.setText("");
        } if(e.getSource()==jButton10){
            num1=Double.parseDouble(jTextField.getText());
            operator='*';
            jTextField.setText("");
        } if(e.getSource()==jButton14){
            num1=Double.parseDouble(jTextField.getText());
            operator='/';
            jTextField.setText("");
        }
            if(e.getSource()==jButton1){
                jTextField.setText("");

        }   if(e.getSource()==jButton17){
            num2=Double.parseDouble(jTextField.getText());

            switch (operator){
                case '+':
                    result=num1+num2;
                    break;

                case '-':
                    result=num1-num2;
                    break;

                case '*':
                    result=num1*num2;
                    break;

                case '/':
                    result=num1/num2;
                    break;
            }
            jTextField.setText(String.valueOf(result));
            num1=result;
        }

    }


}

