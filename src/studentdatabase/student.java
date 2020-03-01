package studentdatabase;

import java.util.Scanner;

public class student {

    private  String firstname;
    private  String lastname;
    private int balance;
    private String studentid;
    private int year;
    private static int id = 1000;


    public student(){

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter first name of student");
        this.firstname = in.nextLine();
        System.out.println("enter Last name of student");
        this.lastname = in.nextLine();
        System.out.println("  enter the level of student. 1 for fresher\n 2 for junior \n 3 for senior");
        this.year = in.nextInt();
        setstudentid();
        System.out.println(firstname + lastname +"" + year  + "" + "Student id is "+ studentid);

    }

    private void setstudentid(){

        id++;
        this.studentid =  year +"" + id;
    }


}
