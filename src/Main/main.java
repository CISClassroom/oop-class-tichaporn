package Main;

import javax.swing.*;

public class main {

    public void Main(String[] args) {
        //create Student object
        Student tichaporn = new Student();

        //input data to Object
        tichaporn.name = "Tichaporn Leedee";
        tichaporn.id = "623410005-4";
        tichaporn.major = "CIS";

        //get data from Object
        System.out.println("1. " + tichaporn.name + " " + tichaporn.major);

        //add student to array
        //array index
        Student[] oopStudent = {tichaporn};

        System.out.println("1. " + oopStudent[0].name);

        find_CIS_Student(oopStudent);
    }

    public void find_CIS_Student(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            //check student.major is "CIS"
            if (students[i].major == "CIS") {
                System.out.println(i + 1 + ". " + students[i].name);
            }
        }
    }
}
