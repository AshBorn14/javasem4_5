import java.awt.*;

public class registration{

    registration(){
            //first name and last name
            Frame f = new Frame("Registration Form");
            Label lfname = new Label("First Name");
            lfname.setBounds(50, 55, 80, 20);
            f.add(lfname);
            TextField fname = new TextField();
            fname.setBounds(140, 55, 120, 20);
            f.add(fname);
            Label llname = new Label("Last Name");
            llname.setBounds(300, 50, 80, 30);
            f.add(llname);
            TextField lname = new TextField();
            lname.setBounds(390, 55, 120, 20);
            f.add(lname);


            //age and gender
            Label lage = new Label("Age");
            lage.setBounds(50, 90, 80, 20);
            f.add(lage);
            TextField age = new TextField();
            age.setBounds(140, 95, 120, 20);
            f.add(age);
            Label lgender = new Label("Gender");
            lgender.setBounds(300, 90, 80, 30);
            f.add(lgender);
            CheckboxGroup checkGroup = new CheckboxGroup();
            Checkbox male = new Checkbox("Male", checkGroup, false);
            male.setBounds(390, 95, 50, 20);
            Checkbox female = new Checkbox("Female", checkGroup, false);
            female.setBounds(450, 95, 60,20);
            f.add(male);
            f.add(female);


            //course and hobbies
            Label lcourse = new Label("Course");
            lcourse.setBounds(50, 140, 80, 20);
            f.add(lcourse);
            Choice course = new Choice();
            course.add("BCA");
            course.add("BBA");
            course.add("BAJMC");
            course.setBounds(140, 140, 120, 20);
            f.add(course);
            Label lhobbies = new Label("Hobbies");
            lhobbies.setBounds(300, 140, 80, 30);
            f.add(lhobbies);
            Checkbox reading = new Checkbox("Reading");
            reading.setBounds(390, 145, 80, 20);
            f.add(reading);
            Checkbox travelling = new Checkbox("Travelling");
            travelling.setBounds(470, 145, 70, 20);
            f.add(travelling);

            //submit and reset button
            Button submit = new Button("Submit");
            submit.setBounds(50, 190, 240, 35);
            f.add(submit);
            Button reset = new Button("Reset");
            reset.setBounds(300, 190, 240, 35);
            f.add(reset);


            
            f.setSize(600,500);
            f.setLayout(null);
            f.setVisible(true);
            
        }
    public static void main(String[] args){
        new registration();

    }
}