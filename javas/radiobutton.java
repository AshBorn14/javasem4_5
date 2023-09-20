import java.awt.*;

public class radiobutton {
    public static void main(String[] args) {
        Frame f = new Frame("Radio button");
        CheckboxGroup checkGroup = new CheckboxGroup();
        Checkbox java = new Checkbox("java", checkGroup, false);
        java.setBounds(100, 100, 50, 50);
        Checkbox cpp = new Checkbox("C++", checkGroup, false);
        cpp.setBounds(100, 150, 50, 50);
        Checkbox python = new Checkbox("Python", checkGroup, false);
        python.setBounds(100, 200, 100, 50);
        f.add(java);
        f.add(cpp);
        f.add(python);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
}
