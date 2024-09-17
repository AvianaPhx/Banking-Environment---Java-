/**
 * Write a description of class CreditCard here.
 *
 * @author ( 22068178 Arabinda Krishna Kansakar)
 * @version (1.0.0)
 */
public class CreditCard extends BankCard
{
    //Attributes 
    private int cvcNumber; 
    private double creditLimit; 
    private double interestRate;
    private String expirationDate; 
    private int gracePeriod; 
    private boolean isGranted; 
    
    //Creating constructor for eight parameters 
    public CreditCard(int cardId,String clientName,String issuerBank,String bankAccount,int balanceAmount,int cvcNumber,double interestRate,String expirationDate)
    { 
        //Creating a super constructor 
        super(cardId, issuerBank, bankAccount, balanceAmount);
        super.setclientName(clientName);  
      
        //Assigning parameter values 
        this.cvcNumber = cvcNumber; 
        this.interestRate = interestRate; 
        this.expirationDate = expirationDate; 
      
        //Asssigning isGranted to False 
        this.isGranted = false; 
    }
      
      
    //providing accessor method for cvcNumber
    public int getcvcNumber()
    {
        return this.cvcNumber;
    }
       
    //providing accessor method for creditLimit
    public double getcreditLimit()
    {
        return this.creditLimit;
    }
       
    //providing accessor method for interestRate
    public double getinterestRate()
    {
        return this.interestRate; 
    }
       
    //providing accessor method for expirationDate
    public String getexpirationDate()
    {
        return this.expirationDate; 
    }
       
    //providing accessor method for gracePeriod
    public int getgracePeriod()
    {
        return this.gracePeriod; 
    }
    
    //providing accessor method for isGranted
    public boolean getisGranted()
    {
        return this.isGranted; 
    }
         
    //Creating a method for setting credit limit 
    public void setcreditLimit(double creditLimit,int gracePeriod)
    { 
        if(creditLimit <= 2.5 * getbalanceAmount()){ 
            this.creditLimit = creditLimit;
            this.gracePeriod = gracePeriod; 
            this.isGranted = true; 
        } 
        else {
            System.out.println("Credit cannot be issued...!!"); 
        }
    }
           
    //Creating a method for Cancelling Credit Card
    public void cancelCreditCard()
    { 
        if(isGranted){ 
            cvcNumber = 0; 
            creditLimit = 0; 
            gracePeriod = 0; 
            isGranted = false; 
        } 
    }
    
    //Creating a display method for the details of Credit Card 
    public void display()
    {       
        if(isGranted == true){ 
            super.display();   
            System.out.println("cvcNumber: "+this.cvcNumber);
            System.out.println("creditLimit: "+this.creditLimit);
            System.out.println("interestRate: "+this.interestRate);
            System.out.println("ExpirationRate: "+this.expirationDate);
            System.out.println("gracePeriod: "+this.gracePeriod); 
       
        }
        else{
            super.display(); 
            System.out.println("cvcNumber: "+this.cvcNumber); 
            System.out.println("interestRate: "+this.interestRate);
            System.out.println("ExpirationRate: "+this.expirationDate);
        }          
    }
}
