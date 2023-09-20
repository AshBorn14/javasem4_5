import java.awt.*;
public class labelFont {
    public static void main(String[] args) {
        Frame f = new Frame("Changing label font");
        Label label1 = new Label("Good morning", Label.CENTER);
        f.add(label1);
        Font myFont = new Font("Serif",Font.BOLD,20);
        label1.setFont(myFont);
        f.setVisible(true);
        f.setSize(400,400);

    }
}
