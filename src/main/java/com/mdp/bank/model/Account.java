package com.mdp.bank.model;

public class Account
{
    private long id;
    private int accountNumber;
    private float balance;
    private Customer customer;
    
    public long getId()
    {
        return id;
    }
    
    public void setId(long id)
    {
        this.id = id;
    }
    
    public int getAccountNumber()
    {
        return accountNumber;
    }
    
    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }
    
    public float getBalance()
    {
        return balance;
    }
    
    public void setBalance(float balance)
    {
        this.balance = balance;
    }
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    
}
