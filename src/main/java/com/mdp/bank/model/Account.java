package com.mdp.bank.model;

/***
 * 
 * account class for model
 * 
 * @author Jeff
 *        
 */
public class Account
{
    private long id;
    private int accountNumber;
    private float balance;
    private Customer customer;
    
    public Account(long id, int accountNumber, float balance, Customer customer)
    {
        this.id = id;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer = customer;
    }
    
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
