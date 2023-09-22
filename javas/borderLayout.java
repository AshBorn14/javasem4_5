import java.awt.*;
public class borderLayout {
    borderLayout(){
        Frame f = new Frame("Border Layout");
        Button b1,b2,b3,b4,b5;
        b1 = new Button("North");
        b1.setBackground(Color.RED);
        b1.setForeground(Color.YELLOW);
        b2 = new Button("South");
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.MAGENTA);
        b3 = new Button("East");
        b3.setBackground(Color.GREEN);
        b3.setForeground(Color.RED);
        b4 = new Button("West");
        b4.setBackground(Color.GRAY);
        b4.setForeground(Color.pink);
        b5 = new Button("center");
        b5.setBackground(Color.CYAN);
        b5.setForeground(Color.yellow);
        f.add(b1,BorderLayout.NORTH);
        f.add(b2,BorderLayout.SOUTH);
        f.add(b3,BorderLayout.EAST);
        f.add(b4,BorderLayout.WEST);
        f.add(b5,BorderLayout.CENTER);
        f.setSize(400,300);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new borderLayout();
    }
}
