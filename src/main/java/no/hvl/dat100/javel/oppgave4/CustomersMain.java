package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        /*
        TODO

         Write code that uses and tests the methods implemented in the Customers class

        */
        Customers register = new Customers(2);
        System.out.println(register.countNonNull());
        Customer n1 = new Customer("Alice Smith","alice@example.com",1001,PowerAgreementType.SPOTPRICE);
        Customer n2 = new Customer("Bob Johnson","bob@example.com",1002,PowerAgreementType.NORGESPRICE);
        System.out.println(register.addCustomer(n1));
        register.addCustomer(n2);
        System.out.println(register.getCustomer(1002));
        register.removeCustomer(1001);
        System.out.println(register.getCustomers().length);
    }
}
