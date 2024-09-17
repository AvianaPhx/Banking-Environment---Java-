/**
 * Write a description of class DebitCard here.
 *
 * @author ( 22068178 Arabinda Krishna Kansakar)
 * @version (1.0.0)
 */
public class DebitCard extends BankCard
{
    // Attributes
    private int pinNumber; 
    private int withdrawalAmount;
    private String dateOfWithdrawal; 
    private boolean hasWithdrawn;
    
    // Making constructor
    public DebitCard(int balanceAmount, int cardId, String bankAccount, String issuerBank, String clientName, int pinNumber)
    {
        // Creating a super constructor 
        super(cardId,issuerBank,bankAccount,balanceAmount); 
        
        // Assigning value of parameter to PINnumber
        setclientName(clientName); 
        this.pinNumber = pinNumber;
  
        // Assigning hasWithdrawn to False
        this.hasWithdrawn = false;
    }
    
    // Mutator method for withdrawal amount
    public void setwithdrawalAmount(int newwithdrawalAmount)
    {
        withdrawalAmount = newwithdrawalAmount; 
    }
        
    // Accessor method for PINnumber
    public int getpinNumber()
    {
        return this.pinNumber;
    }
       
    // Accessor method for WithdrawalAmount
    public int getwithdrawalAmount()
    {
        return this.withdrawalAmount;
    }
       
    // Accessor method for dateOfWithdrawal
    public String getdateOfWithdrawal()
    {
        return this.dateOfWithdrawal; 
    }
       
    // Accessor method for hasWithdrawn
    public boolean gethasWithdrawn()
    {
        return this.hasWithdrawn; 
    }
       
    // Creating a method named withdraw to check if pinNumber is valid and if there is sufficient amount
    public void withdraw(int withdrawalAmount, String dateOfWithdrawal, int pinNumber)
    { 
        if(pinNumber == this.pinNumber && withdrawalAmount <= getbalanceAmount()){
            super.setbalanceAmount(super.getbalanceAmount() - withdrawalAmount);
            this.withdrawalAmount = withdrawalAmount; 
            this.dateOfWithdrawal = dateOfWithdrawal;
            this.hasWithdrawn = true; 
        }
        else if(pinNumber != this.pinNumber){ 
            System.out.println("The PIN number is invalid...!!"); 
        }
        else{
            System.out.println("Your Balance Is Insufficient...!!"); 
        }
    }
        
    // Creating a display method 
    public void display()
    {   super.display();
        if(hasWithdrawn == true){
            System.out.println("PINnumber: " +pinNumber); 
            System.out.println("withdrawalAmount: "+withdrawalAmount); 
            System.out.println("dateOfWithdrawal: "+dateOfWithdrawal); 
        } 
        else{
            System.out.println("balanceAmount: "+getbalanceAmount()); 
        }
    }
}
