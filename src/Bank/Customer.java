package Bank;

import java.util.Scanner;

public class Customer {
    Scanner sc = new Scanner(System.in);
    private String Cname;
    private long Cid;
    private long Camount;

    public String getCname() {
        return Cname;
    }

    public void setCname(String cname) {
        Cname = cname;
    }

    public long getCid() {
        return Cid;
    }

    public void setCid(long cid) {
        Cid = cid;
    }

    public long getCamount() {
        return Camount;
    }

    public void setCamount(long camount) {
        Camount = camount;
    }

    Customer() {
        try {
            System.out.println("Enter Customer Name");
            this.Cname = sc.nextLine();
            if (!Cname.matches("[a-zA-Z]+")) {
                throw new IllegalArgumentException("Invalid input for customer name. Please enter only alphabets.");
            }

            System.out.println("Enter Customer Adhar (Numbers only)");
            this.Cid = Integer.parseInt(sc.nextLine());

            System.out.println("Enter Deposit Amount");
            this.Camount = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid numeric value.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
