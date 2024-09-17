/**
 * Write a description of class BankCard here.
 *
 * @author ( 22068178 Arabinda Krishna Kansakar)
 * @version (1.0.0)
 */
public class BankCard
{
    // Attributes 
    private int cardId; 
    private String clientName;
    private String issuerBank;
    private String bankAccount; 
    private int balanceAmount; 
    
    // Making constructor
    public BankCard(int cardId, String issuerBank, String bankAccount, int balanceAmount)
    {
        //Assigning values of parameter to attributes
        this.cardId = cardId;
        this.issuerBank = issuerBank;
        this.bankAccount = bankAccount;
        this.balanceAmount = balanceAmount;
        // Assigning empty string to clientName
        this.clientName = " "; 
    }
    
    // Mutator method for clientName
    public void setclientName(String newclientName)
    {
        clientName = newclientName; 
    }
       
    // Mutator method for balanceAmount
    public void setbalanceAmount(int newbalanceAmount)
    {
        balanceAmount = newbalanceAmount; 
    }
       
    // Accessor method for card_id
    public int getcardId()
    {
        return this.cardId;
    }
       
    // Accessor method for clientName
    public String getclientName()
    {
        return this.clientName;
    }
       
    // Accessor method for issuerBank
    public String getissuerBank()
    {
        return this.issuerBank; 
    }
       
    // Accessor method for bankAccount
    public String getbankAccount()
    {
        return this.bankAccount; 
    }
       
    // Accessor method for balanceAmount
    public int getbalanceAmount()
    {
        return this.balanceAmount;
    }
    
    // Creating a display method
    public void display()
    {
        System.out.println("card_id:" +this.cardId);
        System.out.println("issuerBank:" +this.issuerBank);
        System.out.println("bankAccount:" +this.bankAccount);
        System.out.println("balanceAmount:" +this.balanceAmount);  
        
        //Checking if clientName is empty or not
        if(clientName!=" "){
            System.out.println("clientName: "+this.clientName);
        }
        else{
            System.out.println("Client Name Is Not Assigned...!!"); 
        }
    }
}

