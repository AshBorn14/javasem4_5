import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class calculator implements ActionListener {

    //declaring global variable
    TextField input1, input2, output;
    Button add,sub,prod,div;
    Label op;

    calculator(){
        Frame f = new Frame("Calculator");

        input1 = new TextField();
        input1.setBounds(50, 55, 80, 20);
        f.add(input1);
        
        op = new Label();
        op.setBounds(140, 55, 20, 20);
        f.add(op);

        input2 = new TextField();
        input2.setBounds(160, 55, 80, 20);
        f.add(input2);

        Label lequal = new Label("=");
        lequal.setBounds(260,55,20,20);
        f.add(lequal);

        output = new TextField();
        output.setBounds(300, 55, 80, 20);
        output.setEditable(false);
        f.add(output);

        add = new Button("+");
        add.setBounds(50, 110, 40, 20);
        add.addActionListener(this);
        f.add(add);
        
        sub = new Button("-");
        sub.setBounds(110, 110, 40, 20);
        sub.addActionListener(this);
        f.add(sub);

        prod = new Button("X");
        prod.setBounds(170, 110, 40, 20);
        prod.addActionListener(this);
        f.add(prod);

        div = new Button("/");
        div.setBounds(230, 110, 40, 20);
        div.addActionListener(this);
        f.add(div);


        f.setSize(600,500);
        f.setLayout(null);
        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        String i1 = input1.getText();
        int a = Integer.parseInt(i1);
        String i2 = input2.getText();
        int b = Integer.parseInt(i2);
        int c=0;
        if(e.getSource() == add){
            c = a + b;
            op.setText("+");
        }else if(e.getSource() == sub){
            c = a - b;
            op.setText("-");
        }else if(e.getSource() == prod){
            c = a * b;
            op.setText("X");
        }else if(e.getSource() == div){
            c = a / b;
            op.setText("/");
        }

        String result = String.valueOf(c);
        output.setText(result);
    }

    public static void main(String[] args) {
        new calculator();
    }
}
