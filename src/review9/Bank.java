package review9;

public class Bank {
    public static void main(String[] args) {
        Customer c=new Customer();
        c.setName("Slava Friz");
        System.out.println("Name of the customer is "+c.getName());

        c.setSsn(1929823238);
        System.out.println("SSN of the customer is "+c.getSsn());

        PrivateClient pc=new PrivateClient("Larisa");
        System.out.println("Private clint name is "+pc.getName());
        System.out.println("Private clint SSN IS "+pc.getSsn());
    }
}
