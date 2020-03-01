package Email;

public class emailapp {

    public static void main(String[] args){

        email em1 = new email("gurdeep", "kaur");
        System.out.println(em1.showdetails());
        System.out.println(em1.getPassword());

    }
}
