package Email;

import java.util.Scanner;

public class email {
    private String firstname;
    private String lastname;
    private String department;
    private String password;
    private int defaultpasslenght = 8;
    private String alteremailid = "dp.kaur1@gmail.com";
    private String email;
    private int mailcap = 500;
    private String company = "company.com";


    public email(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.department = setdeparment();
        this.password = randampassword(defaultpasslenght);
        System.out.println(this.firstname + "" + this.lastname);
        System.out.println("department is  " + "" + this.department);
        System.out.println("your password is  " + this.password );
        email = firstname + "." + lastname +"@"+ ""+ department + company;
        System.out.println("your email id is  " + email);

    }

    private String randampassword(int length) {
        String  passwordset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789€&@!";
        char[] password = new char[length];

        for (int i = 0; i <length ; i++) {
            int rand = (int) (Math.random()*passwordset.length());
            password[i] =passwordset.charAt(rand);
        }
        return new String(password);
            }

    private String setdeparment() {
        System.out.println("Department code : 1 for sale\n  2 for development\n 3 for accounting and  0 for none " );
        Scanner in = new Scanner(System.in);
        int deptvalue = in.nextInt();
        if (deptvalue == 1) {
            return "Sale";
        } else if (deptvalue == 2) {
            return "develop";
        } else return "Acc";
    }

   public void setmailcapacity(int mailcap){
        this.mailcap = mailcap;
   }

   public void setAlteremailid( String alteremailid){
        this.alteremailid = alteremailid;
   }

   public  void changepassword(String password){
        this.password = password;

   }

   public int getMailcap(){return mailcap;}
   public String getAlteremailid(){return alteremailid;}
   public  String getPassword(){return password;}

    public String showdetails(){
        return "display name " + firstname +  lastname +
                "Email id "+ alteremailid +
                        "Mail capacity " + mailcap;



    }

   }

