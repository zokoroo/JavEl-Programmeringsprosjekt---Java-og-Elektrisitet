package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        /*
        TODO
        (3e

         Write code that creates a Customer object and teste the methods implemented in the class

        */
        Customer user  = new Customer("Alice Smith","alice@example.com",1001,PowerAgreementType.SPOTPRICE);
        System.out.println(user.getCustomer_id());
        System.out.println(user.getAgreement());
        System.out.println(user.getEmail());
        System.out.println(user.getName());

        user.setAgreement(PowerAgreementType.NORGESPRICE);
        user.setCustomer_id(1234);
        user.setEmail("randomail@random.com");
        user.setName("Bob Smith");

        System.out.println(user.getCustomer_id());
        System.out.println(user.getAgreement());
        System.out.println(user.getEmail());
        System.out.println(user.getName());

        System.out.print(user.toString());

    }
}
