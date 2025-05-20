package com.example.models;

import java.util.ArrayList;

public class ListCustomer {
    private ArrayList<Customer> customers;

    public ListCustomer() {
        customers=new ArrayList<>();
    }
    public void addCustomer(Customer c)
    {
        customers.add(c);
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }
    public void generate_sample_dataset()
    {
        addCustomer(new Customer(1,"Teo","teo@gmail.com","0938994134","teo","123"));
        addCustomer(new Customer(2,"Nhi","nhi@gmail.com","0838994134","nhi","456"));
        addCustomer(new Customer(3,"Dung","dung@gmail.com","0738994134","dung","789"));
        addCustomer(new Customer(4,"Quan","quan@gmail.com","0638994134","quan","123"));
        addCustomer(new Customer(5,"Trinh","trinh@gmail.com","0538994134","trinh","123"));
        addCustomer(new Customer(6,"An","an@gmail.com","0438994134","an","123"));
        addCustomer(new Customer(7,"Hoang","hoang@gmail.com","0338994134","hoang","123"));
        addCustomer(new Customer(8,"Hien","hien@gmail.com","0238994134","hien","123"));
        addCustomer(new Customer(9,"Linh","linh@gmail.com","0138994134","linh","123"));
        addCustomer(new Customer(10,"Heo","heo@gmail.com","0038994134","heo","123"));
    }
}
