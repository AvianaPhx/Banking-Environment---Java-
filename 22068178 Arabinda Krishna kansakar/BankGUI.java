
/**
 * Write a description of class BankGui here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.Graphics;

public class BankGUI implements ActionListener
{
    // For Heading Bank Gui
    private JLabel formLbl;

    // Adding Background color
    private JPanel colorPanel;

    // For CreditCard
    // Declaring elements for Jlabel
    private JLabel credit_headingLbl, C_client_nameLbl, C_card_idLbl, C_bank_accountLbl, C_issuer_bankLbl, C_interest_rateLbl,
    C_cvc_numberLbl, C_balance_amountLbl, C_expiration_dateLbl; 
    // Declaring elements for JTextField
    private JTextField C_client_nameTxt, C_card_idTxt, C_bank_accountTxt, C_issuer_bankTxt, C_interest_rateTxt, C_cvc_numberTxt,
    C_balance_amountTxt;   
    // Declaring elemets for JCombobox
    private JComboBox Credit_day, C_monthcombo, Credit_year;   
    // Declaring elements for JButton
    private JButton C_addBtn, C_displayBtn, C_cancelBtn;

    // For DebitCard
    // Declaring elements for Jlabel
    private JLabel debit_headingLbl, D_client_nameLbl, D_card_idLbl, D_bank_accountLbl, D_balance_amountLbl, D_issuer_bankLbl,
    D_pin_numberLbl; 
    // Declaring elements for JTextField
    private JTextField D_client_nameTxt, D_card_idTxt, D_bank_accountTxt, D_balance_amountTxt, D_pin_numberTxt, D_issuer_bankTxt; 
    // Declaring elements for JButton
    private JButton D_addBtn, D_displayBtn, D_cancelBtn;

    // For Withdrawal
    // Declaring elements for Jlabel
    private JLabel drawal_headingLbl, W_card_idLbl, W_amountLbl, W_pinLbl, W_dowLbl;  
    // Declaring elements for JTextField
    private JTextField W_card_idTxt, W_amountTxt, W_pinTxt; 
    // Declaring elements for JButton
    private JButton W_addBtn, W_clearBtn;
    // Declaring elements for Jcombo Box
    private JComboBox With_day, W_monthcombo, With_year;

    // For Credit Limit
    // Declaring elements for Jlabel
    private JLabel limit_headingLbl, L_card_idLbl, L_credit_limitLbl, L_graceLbl;
    // Declaring elements for JTextField
    private JTextField L_card_idTxt, L_credit_limitTxt, L_graceTxt;
    // Declaring elements for JButton
    private JButton L_addBtn, L_clearBtn;

    // For Cancel Credit
    // Declaring elements for Jlabel
    private JLabel cancel_headingLbl, cancel_card_idLbl;
    // Declaring elements for JTextField
    private JTextField cancel_card_idTxt;
    // Declaring elements for JButton
    private JButton cancel_clearBtn;

    // Storing the variable in BankCard
    ArrayList<BankCard> gui_Card = new ArrayList<BankCard>();
    DebitCard debitobject;
    CreditCard creditobject;

    public BankGUI(){
        // Creating the Jframe
        JFrame myFrame = new JFrame("CourseWork");
        myFrame.setSize(1280, 810);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLayout(null);
        myFrame.setResizable(false);
        myFrame.setVisible(true);

        // Creating the components 
        // Bank Form
        formLbl = new JLabel("Bank Form"); 
        formLbl.setFont(new Font("Palatino Linotype",Font.BOLD,40));
        formLbl.setBounds(545, 18, 287, 60);
        myFrame.add(formLbl);

        // For Credit Card 
        // Request Credit card Detail Heading
        credit_headingLbl = new JLabel("Credit Card");
        credit_headingLbl.setFont(new Font("Palatino Linotype",Font.BOLD,30));
        credit_headingLbl.setBounds(300, 73, 460, 50);
        myFrame.add(credit_headingLbl);

        // Client Name (Credit)
        C_client_nameLbl = new JLabel("Client Name:");
        C_client_nameLbl.setFont(new Font("Palatino Linotype",Font.BOLD,13));
        C_client_nameLbl.setBounds(53, 132, 82, 20);
        myFrame.add(C_client_nameLbl);

        // Text Field For Client Name 
        C_client_nameTxt = new JTextField();
        C_client_nameTxt.setBounds(150, 126, 180, 32);
        myFrame.add(C_client_nameTxt);

        // Card ID (Credit)
        C_card_idLbl = new JLabel("Card ID:");
        C_card_idLbl.setFont(new Font("Palatino Linotype",Font.BOLD,13));
        C_card_idLbl.setBounds(53, 175, 56, 20);
        myFrame.add(C_card_idLbl); 

        // Text Field for Card ID
        C_card_idTxt = new JTextField();
        C_card_idTxt.setBounds(150, 169, 180, 32);
        myFrame.add(C_card_idTxt);

        // Bank Account (Credit)
        C_bank_accountLbl = new JLabel("Bank Account:");
        C_bank_accountLbl.setFont(new Font("Palatino Linotype",Font.BOLD,13));
        C_bank_accountLbl.setBounds(53, 218, 93, 20);
        myFrame.add(C_bank_accountLbl); 

        // Text Field for Bank Account
        C_bank_accountTxt = new JTextField();
        C_bank_accountTxt.setBounds(150, 212, 180, 32);
        myFrame.add(C_bank_accountTxt);

        // Issuer Bank (Credit)
        C_issuer_bankLbl = new JLabel("Issuer Bank:");
        C_issuer_bankLbl.setFont(new Font("Palatino Linotype",Font.BOLD,13));
        C_issuer_bankLbl.setBounds(53, 261, 82, 20);
        myFrame.add(C_issuer_bankLbl);

        // Text Field for Issuer Bank
        C_issuer_bankTxt = new JTextField();
        C_issuer_bankTxt.setBounds(150, 255, 180, 32);
        myFrame.add(C_issuer_bankTxt);

        // Interest Rate (Credit)
        C_interest_rateLbl = new JLabel("Interest Rate:");
        C_interest_rateLbl.setFont(new Font("Palatino Linotype",Font.BOLD,13));
        C_interest_rateLbl.setBounds(358, 132, 88, 20);
        myFrame.add(C_interest_rateLbl);

        // Text Field for Interest Rate
        C_interest_rateTxt = new JTextField();
        C_interest_rateTxt.setBounds(470, 126, 180, 32);
        myFrame.add(C_interest_rateTxt);

        // CVC Number (Credit)
        C_cvc_numberLbl = new JLabel("CVC Number:");
        C_cvc_numberLbl.setFont(new Font("Palatino Linotype",Font.BOLD,13));
        C_cvc_numberLbl.setBounds(358, 175, 91, 20);
        myFrame.add(C_cvc_numberLbl);

        // Text Field for Interest Rate
        C_cvc_numberTxt = new JTextField();
        C_cvc_numberTxt.setBounds(470, 169, 180, 32);
        myFrame.add(C_cvc_numberTxt);

        // Balance Amount (Credit)
        C_balance_amountLbl = new JLabel("Balance Amount:");
        C_balance_amountLbl.setFont(new Font("Palatino Linotype",Font.BOLD,13));
        C_balance_amountLbl.setBounds(358, 218, 110, 20);
        myFrame.add(C_balance_amountLbl);

        // Text Field for Balance Amount
        C_balance_amountTxt = new JTextField();
        C_balance_amountTxt.setBounds(470, 211, 180, 32);
        myFrame.add(C_balance_amountTxt);

        // Expiration Date (Credit)
        C_expiration_dateLbl = new JLabel("Expiration Date:");
        C_expiration_dateLbl.setFont(new Font("Palatino Linotype",Font.BOLD,13));
        C_expiration_dateLbl.setBounds(358, 261, 100, 20);
        myFrame.add(C_expiration_dateLbl);

        // Day for Expiration Date
        String[] C_day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","10","21","22","23","24","25","26","27","28","29"};
        Credit_day = new JComboBox(C_day);
        Credit_day.setBounds(470, 253, 62, 32);
        myFrame.add(Credit_day);

        // Month for Expiration Date
        String[] C_month={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
        C_monthcombo = new JComboBox(C_month);
        C_monthcombo.setBounds(544, 253, 62, 32);
        myFrame.add(C_monthcombo);

        // Loop for Year
        String[] C_year = {"2019","2020","2021"};
        Credit_year = new JComboBox(C_year);
        Credit_year.setBounds(618, 253, 62, 32);
        myFrame.add(Credit_year);

        // Button for adding Credit Card
        C_addBtn = new JButton("Add Credit Card");
        C_addBtn.setFont(new Font("Palatino Linotype",Font.BOLD,13));
        C_addBtn.setBounds(135, 310, 146, 32);
        myFrame.add(C_addBtn);

        // Button for displaying Credit Card
        C_displayBtn = new JButton("Display");
        C_displayBtn.setFont(new Font("Palatino Linotype",Font.BOLD,13));
        C_displayBtn.setBounds(306, 310, 146, 32);
        myFrame.add(C_displayBtn);

        // Button for Cancel Credit Card
        C_cancelBtn = new JButton("Clear");
        C_cancelBtn.setFont(new Font("Palatino Linotype",Font.BOLD,13));
        C_cancelBtn.setBounds(477, 310, 146, 32);
        myFrame.add(C_cancelBtn);

        // For Debit Card
        // Request Debit card Detail Heading
        debit_headingLbl = new JLabel("Debit Card"); 
        debit_headingLbl.setFont(new Font("Palatino Linotype",Font.BOLD,30));
        debit_headingLbl.setBounds(300, 379, 430, 50);
        myFrame.add(debit_headingLbl);

        // Client Name (Debit)
        D_client_nameLbl = new JLabel("Client Name:");
        D_client_nameLbl.setFont(new Font("Palatino Linotype",Font.BOLD,13));
        D_client_nameLbl.setBounds(53, 430, 85, 20);
        myFrame.add(D_client_nameLbl);

        // Text Field For Client Name
        D_client_nameTxt = new JTextField();
        D_client_nameTxt.setBounds(150, 424, 180, 32);
        myFrame.add(D_client_nameTxt);

        // Card ID (Debit)
        D_card_idLbl = new JLabel("Card ID:");
        D_card_idLbl.setFont(new Font("Palatino Linotype",Font.BOLD,13));
        D_card_idLbl.setBounds(53, 473, 54, 20);
        myFrame.add(D_card_idLbl);

        // Text Field for Card ID
        D_card_idTxt = new JTextField();
        D_card_idTxt.setBounds(150, 467, 180, 32);
        myFrame.add(D_card_idTxt);

        // Bank Account (Debit)
        D_bank_accountLbl = new JLabel("Bank Account:");
        D_bank_accountLbl.setFont(new Font("Palatino Linotype",Font.BOLD,13));
        D_bank_accountLbl.setBounds(53, 516, 93, 20);
        myFrame.add(D_bank_accountLbl);

        // Text Field for Bank Account
        D_bank_accountTxt = new JTextField();
        D_bank_accountTxt.setBounds(150, 510, 180, 32);
        myFrame.add(D_bank_accountTxt);

        // Balance Amount (Debit)
        D_balance_amountLbl = new JLabel("Balance Amount:");
        D_balance_amountLbl.setFont(new Font("Palatino Linotype",Font.BOLD,13));
        D_balance_amountLbl.setBounds(358, 430, 108, 20);
        myFrame.add(D_balance_amountLbl);

        // Text Field for Balance Amount
        D_balance_amountTxt = new JTextField();
        D_balance_amountTxt.setBounds(470, 424, 180, 32);
        myFrame.add(D_balance_amountTxt);

        // Issuer Bank (Debit)
        D_issuer_bankLbl = new JLabel("Issuer Bank:");
        D_issuer_bankLbl.setFont(new Font("Palatino Linotype",Font.BOLD,13));
        D_issuer_bankLbl.setBounds(358, 473, 82, 20);
        myFrame.add(D_issuer_bankLbl);

        // Text Field for Issuer Bank
        D_issuer_bankTxt = new JTextField();
        D_issuer_bankTxt.setBounds(470, 467, 180, 32);
        myFrame.add(D_issuer_bankTxt);

        // PIN Number (Debit)
        D_pin_numberLbl = new JLabel("PIN Number:");
        D_pin_numberLbl.setFont(new Font("Palatino Linotype",Font.BOLD,13));
        D_pin_numberLbl.setBounds(358, 516, 85, 20);
        myFrame.add(D_pin_numberLbl);

        // Text Field for PIN Number
        D_pin_numberTxt = new JTextField();
        D_pin_numberTxt.setBounds(470, 510, 180, 32);
        myFrame.add(D_pin_numberTxt);

        // Button for adding Debit Card
        D_addBtn = new JButton("Add Debit Card");
        D_addBtn.setFont(new Font("Palatino Linotype",Font.BOLD,13));
        D_addBtn.setBounds(135, 568, 146, 32);
        myFrame.add(D_addBtn);

        // Button for displaying Debit Card
        D_displayBtn = new JButton("Display");
        D_displayBtn.setFont(new Font("Palatino Linotype",Font.BOLD,13));
        D_displayBtn.setBounds(306, 568, 146, 32);
        myFrame.add(D_displayBtn);

        // Button for Cancel Debit Card
        D_cancelBtn = new JButton("Clear");
        D_cancelBtn.setFont(new Font("Palatino Linotype",Font.BOLD,13));
        D_cancelBtn.setBounds(477, 568, 146, 32);
        myFrame.add(D_cancelBtn);

        // For Withdrawal
        // Request Withdrawal Detail Heading
        drawal_headingLbl = new JLabel("Withdrawal"); 
        drawal_headingLbl.setFont(new Font("Palatino Linotype",Font.BOLD,30));
        drawal_headingLbl.setBounds(877, 73, 520, 50);
        myFrame.add(drawal_headingLbl);

        // Card ID (Withdrawal)
        W_card_idLbl = new JLabel("Card ID:");
        W_card_idLbl.setFont(new Font("Palatino Linotype",Font.BOLD,13));
        W_card_idLbl.setBounds(800, 129, 56, 20);
        myFrame.add(W_card_idLbl);

        // Text Field for Card ID
        W_card_idTxt = new JTextField();
        W_card_idTxt.setBounds(932, 121, 180, 32);
        myFrame.add(W_card_idTxt);

        // WithDraw Amount (Withdrawal)
        W_amountLbl = new JLabel("Withdraw Amount:");
        W_amountLbl.setFont(new Font("Palatino Linotype",Font.BOLD,13));
        W_amountLbl.setBounds(800, 172, 128, 20);
        myFrame.add(W_amountLbl);

        // Text Field for WithDraw Amount
        W_amountTxt = new JTextField();
        W_amountTxt.setBounds(932, 165, 180, 32);
        myFrame.add(W_amountTxt);

        // PIN Number (Withdrawal)
        W_pinLbl = new JLabel("PIN Number:");
        W_pinLbl.setFont(new Font("Palatino Linotype",Font.BOLD,13));
        W_pinLbl.setBounds(800, 215, 85, 20);
        myFrame.add(W_pinLbl);

        // Text Field for PIN Number
        W_pinTxt = new JTextField();
        W_pinTxt.setBounds(932, 209, 180, 32);
        myFrame.add(W_pinTxt);

        // Date Of Withdraw (WithDrawal)
        W_dowLbl = new JLabel("Date Of Withdraw:");
        W_dowLbl.setFont(new Font("Palatino Linotype",Font.BOLD,13));
        W_dowLbl.setBounds(800, 258, 124, 20);
        myFrame.add(W_dowLbl);

        // Day for Date Of Withdraw
        String[] W_day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","10","21","22","23","24","25","26","27","28","29"};
        With_day = new JComboBox(W_day);
        With_day.setBounds(932, 253, 62, 32);
        myFrame.add(With_day);

        // Month for Date Of Withdraw
        String[] W_month={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
        W_monthcombo = new JComboBox(W_month);
        W_monthcombo.setBounds(1006, 253, 62, 32);
        myFrame.add(W_monthcombo);

        // Year for Expiration Date
        String[] W_year = {"2019","2020","2021"};
        With_year = new JComboBox(W_year);
        With_year.setBounds(1080, 253, 62, 32);
        myFrame.add(With_year);

        // Button for withdraw
        W_addBtn = new JButton("Withdraw");
        W_addBtn.setFont(new Font("Palatino Linotype",Font.BOLD,13));
        W_addBtn.setBounds(813, 311, 146, 32);
        myFrame.add(W_addBtn);

        // Button for Clear
        W_clearBtn = new JButton("Clear");
        W_clearBtn.setFont(new Font("Palatino Linotype",Font.BOLD,13));
        W_clearBtn.setBounds(984, 311, 146, 32);
        myFrame.add(W_clearBtn);

        // For Credit Limit
        // Request Credit Limit Detail Heading
        limit_headingLbl = new JLabel("Credit Limit"); 
        limit_headingLbl.setFont(new Font("Palatino Linotype",Font.BOLD,30));
        limit_headingLbl.setBounds(877, 375, 400, 50);
        myFrame.add(limit_headingLbl);

        // Card ID (Limit)
        L_card_idLbl = new JLabel("Card ID:");
        L_card_idLbl.setFont(new Font("Palatino Linotype",Font.BOLD,13));
        L_card_idLbl.setBounds(800, 437, 56, 20);
        myFrame.add(L_card_idLbl);

        // Text Field for Card ID
        L_card_idTxt = new JTextField();
        L_card_idTxt.setBounds(932, 428, 180, 32);
        myFrame.add(L_card_idTxt);

        // Credit Limit (Limit)
        L_credit_limitLbl = new JLabel("Credit Limit:");
        L_credit_limitLbl.setFont(new Font("Palatino Linotype",Font.BOLD,13));
        L_credit_limitLbl.setBounds(800, 480, 79, 20);
        myFrame.add(L_credit_limitLbl);

        // Text Field for Credit Limit
        L_credit_limitTxt = new JTextField();
        L_credit_limitTxt.setBounds(932, 471, 180, 32);
        myFrame.add(L_credit_limitTxt);

        // Grace Period (Limit)
        L_graceLbl = new JLabel("Grace Period:");
        L_graceLbl.setFont(new Font("Palatino Linotype",Font.BOLD,13));
        L_graceLbl.setBounds(800, 523, 90, 20);
        myFrame.add(L_graceLbl);

        // Text Field for Grace Period
        L_graceTxt = new JTextField();
        L_graceTxt.setBounds(932, 514, 180, 32);
        myFrame.add(L_graceTxt);

        // Button for Limit
        L_addBtn = new JButton("Add Credit Limit");
        L_addBtn.setFont(new Font("Palatino Linotype",Font.BOLD,13));
        L_addBtn.setBounds(813, 569, 146, 32);
        myFrame.add(L_addBtn);

        // Button for Limit
        L_clearBtn = new JButton("Clear");
        L_clearBtn.setFont(new Font("Palatino Linotype",Font.BOLD,13));
        L_clearBtn.setBounds(984, 569, 146, 32);
        myFrame.add(L_clearBtn);

        // For Cancel Credit Card
        // Request Cancel Credit Card Detail Heading
        cancel_headingLbl = new JLabel("Enter the detail below to cancel the Credit Card:");
        cancel_headingLbl.setFont(new Font("Palatino Linotype",Font.BOLD,17));
        cancel_headingLbl.setBounds(429, 630, 390, 25);
        myFrame.add(cancel_headingLbl);

        // Card ID (cancel)
        cancel_card_idLbl = new JLabel("Card ID:");
        cancel_card_idLbl.setFont(new Font("Palatino Linotype",Font.BOLD,13));
        cancel_card_idLbl.setBounds(479, 668, 56, 20);
        myFrame.add(cancel_card_idLbl);

        // Text Field for Card ID
        cancel_card_idTxt = new JTextField();
        cancel_card_idTxt.setBounds(548, 660, 180, 32);
        myFrame.add(cancel_card_idTxt);

        // Button for Cancel Credit Card
        cancel_clearBtn = new JButton("Cancel Credit");
        cancel_clearBtn.setFont(new Font("Palatino Linotype",Font.BOLD,13));
        cancel_clearBtn.setBounds(565, 710, 146, 32);
        myFrame.add(cancel_clearBtn);

        // Add ActionListener For Clear
        C_cancelBtn.addActionListener(this);
        D_cancelBtn.addActionListener(this);
        W_clearBtn.addActionListener(this);
        L_clearBtn.addActionListener(this);

        // Add ActionListener For Add
        D_addBtn.addActionListener(this);
        C_addBtn.addActionListener(this);
        W_addBtn.addActionListener(this);
        L_addBtn.addActionListener(this);
        cancel_clearBtn.addActionListener(this);
        
        // Add ActionListener For Display
        C_displayBtn.addActionListener(this);
        D_displayBtn.addActionListener(this);
        
        // Background for myFrame
        JPanel colorPanel = new JPanel();
        colorPanel.setBackground(new Color(235, 235, 235));
        colorPanel.setBounds(0,0,1280,810);
        myFrame.add(colorPanel);
    }

    // Action Listener For All Buttons
    public void actionPerformed(ActionEvent e){
        //---------------------- For Credit Card ----------------------//
        // Add For Credit Card
        if(e.getSource() == C_addBtn){
            try{
                String C_add_client_name = C_client_nameTxt.getText();
                String C_add_card_id = C_card_idTxt.getText();
                String C_add_bank_account = C_bank_accountTxt.getText();
                String C_add_issuer_bank = C_issuer_bankTxt.getText();
                String C_add_interest_rate = C_interest_rateTxt.getText();
                String C_add_cvc_number = C_cvc_numberTxt.getText();
                String C_add_balance_amount = C_balance_amountTxt.getText();
                String day = (String)Credit_day.getSelectedItem();
                String month = (String)C_monthcombo.getSelectedItem();
                String year = (String)Credit_year.getSelectedItem();
                String fulldate = day + month + year;

                int card_Id = Integer.parseInt(C_add_card_id);
                int balance_Amount = Integer.parseInt(C_add_balance_amount);
                int cvc_Number = Integer.parseInt(C_add_cvc_number);
                double interest_Rate = Integer.parseInt(C_add_interest_rate);

                boolean isadd = false;
                for(BankCard bank_card: gui_Card){
                    if(bank_card.getcardId() == card_Id){
                        JOptionPane.showMessageDialog(null, "You Already Added Credit Card!");
                        isadd = true;
                        break;
                    }
                }
                if(!isadd){
                    creditobject = new CreditCard(card_Id, C_add_client_name, C_add_issuer_bank, C_add_bank_account, balance_Amount, cvc_Number, interest_Rate, fulldate);
                    gui_Card.add(creditobject);
                    JOptionPane.showMessageDialog(null, "Card has been added.");
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "No card has been added yet!", "error", JOptionPane.ERROR_MESSAGE);
            }
        }

        // Cancel For Credit Card
        if(e.getSource() == C_cancelBtn){
            C_client_nameTxt.setText("");
            C_card_idTxt.setText(""); 
            C_bank_accountTxt.setText("");
            C_issuer_bankTxt.setText("");
            C_interest_rateTxt.setText("");
            C_cvc_numberTxt.setText("");
            C_balance_amountTxt.setText("");
            Credit_day.setSelectedIndex(0);
            C_monthcombo.setSelectedIndex(0);
            Credit_year.setSelectedIndex(0);
        }
        
        if(e.getSource() == C_displayBtn){
            for(BankCard bank_card: gui_Card){
                if(bank_card instanceof CreditCard){
                    bank_card.display();
                }
            }
        }

        //---------------------- For Debit Card ----------------------//
        // Add For Debit Card
        if(e.getSource() == D_addBtn){
            try{
                String D_add_client_name = D_client_nameTxt.getText();
                String D_add_card_id = D_card_idTxt.getText();
                String D_add_bank_account = D_bank_accountTxt.getText();
                String D_add_balance_amount = D_balance_amountTxt.getText();
                String D_add_pin_number = D_pin_numberTxt.getText();
                String D_add_issuer_bank = D_issuer_bankTxt.getText();

                int card_Id = Integer.parseInt(D_add_card_id);
                int balance_Amount = Integer.parseInt(D_add_balance_amount);
                int pin_Number = Integer.parseInt(D_add_pin_number);

                boolean isadd = false;
                for(BankCard bank_card: gui_Card){
                    if(bank_card instanceof DebitCard){
                        debitobject = (DebitCard)bank_card;
                        if(debitobject.getcardId() == card_Id){
                            JOptionPane.showMessageDialog(null, "You Already Added A Card With This Info!");
                            isadd = true;
                            break;
                        }
                        else{
                            isadd = false;
                        }
                    }
                }       
                if(!isadd){
                    debitobject = new DebitCard(balance_Amount, card_Id, D_add_bank_account, D_add_issuer_bank, D_add_client_name,pin_Number);
                    gui_Card.add(debitobject);
                    JOptionPane.showMessageDialog(null, "Card has been added.");
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "No card has been added yet!", "error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        if(e.getSource() == D_displayBtn){
            for(BankCard bank_card: gui_Card){
                if(bank_card instanceof DebitCard){
                    bank_card.display();
                }
            }
        }

        // Cancel For Debit Card
        if(e.getSource() == D_cancelBtn){
            D_client_nameTxt.setText("");
            D_card_idTxt.setText("");
            D_bank_accountTxt.setText("");
            D_balance_amountTxt.setText("");
            D_pin_numberTxt.setText("");
            D_issuer_bankTxt.setText("");
        }

        //---------------------- For Withdrawal ----------------------//
        // Add For Withdrawal
        if(e.getSource() == W_addBtn){
            try{
                String W_add_card_id = W_card_idTxt.getText();
                String W_add_amount = W_amountTxt.getText();
                String W_add_pin = W_pinTxt.getText();
                String day = (String)With_day.getSelectedItem();
                String month = (String)W_monthcombo.getSelectedItem();
                String year = (String)With_year.getSelectedItem();
                String fulldate = day + month + year;

                int card_Id = Integer.parseInt(W_add_card_id);
                int add_Amount = Integer.parseInt(W_add_amount);
                int pin_Number = Integer.parseInt(W_add_pin);

                String D_add_client_name = D_client_nameTxt.getText();
                String D_add_card_id = D_card_idTxt.getText();
                String D_add_bank_account = D_bank_accountTxt.getText();
                String D_add_balance_amount = D_balance_amountTxt.getText();
                String D_add_pin_number = D_pin_numberTxt.getText();
                String D_add_issuer_bank = D_issuer_bankTxt.getText();

                int D_card_Id = Integer.parseInt(D_add_card_id);
                int D_balance_Amount = Integer.parseInt(D_add_balance_amount);
                int D_pin_Number = Integer.parseInt(D_add_pin_number);

                boolean isadd = false;
                for(BankCard bank_card: gui_Card){
                    if(bank_card instanceof DebitCard){
                        debitobject = (DebitCard)bank_card;
                        if(debitobject.getcardId() == card_Id){
                            debitobject.withdraw(add_Amount, fulldate, pin_Number);
                            JOptionPane.showMessageDialog(null, "Withdraw Successful!");
                            isadd = true;
                            break;
                        }
                    }
                    else{
                        isadd = false;
                    }
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "No card has been added yet!", "error", JOptionPane.ERROR_MESSAGE);
            }
        }

        // Cancel For Withdrawal
        if(e.getSource() == W_clearBtn){
            W_card_idTxt.setText("");
            W_amountTxt.setText(""); 
            W_pinTxt.setText("");
            With_day.setSelectedIndex(0);
            W_monthcombo.setSelectedIndex(0);
            With_year.setSelectedIndex(0);
        }

        //---------------------- For Credit Limit ----------------------//
        // Add For Credit Limit
        if(e.getSource() == L_addBtn){
            try{
                String L_add_card_id = L_card_idTxt.getText();
                String L_add_credit_limit = L_credit_limitTxt.getText();
                String L_add_grace = L_graceTxt.getText();

                int card_Id = Integer.parseInt(L_add_card_id);
                double credit_limit = Integer.parseInt(L_add_credit_limit);
                int add_grace = Integer.parseInt(L_add_grace);
                boolean isadd = false;
                for(BankCard bank_card: gui_Card){
                    if(bank_card instanceof CreditCard){
                        CreditCard limit = (CreditCard)bank_card;
                        if(limit.getcardId() == card_Id){
                            limit.setcreditLimit(credit_limit, add_grace);
                            if(limit.getisGranted() == true){
                                JOptionPane.showMessageDialog(null, "Credit Limit Added Successfully!");
                                isadd = true;
                                break;
                            }
                            else{
                                isadd = false;
                            }
                        }
                    }
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "No card has been added yet!", "error", JOptionPane.ERROR_MESSAGE);
            }
        }

        // Cancel For Credit Limit
        if(e.getSource() == L_clearBtn){
            L_card_idTxt.setText("");
            L_credit_limitTxt.setText(""); 
            L_graceTxt.setText("");
        }

        // For Cancel Credit Card
        if(e.getSource() == cancel_clearBtn){
            try{
                String cancel_add_cancelbtn = cancel_card_idTxt.getText();

                int cancel_credit = Integer.parseInt(cancel_add_cancelbtn);
                boolean iscancel = false;
                for(BankCard bank_card: gui_Card){
                    if(bank_card instanceof CreditCard){
                        CreditCard limit = (CreditCard)bank_card;   
                        if(limit.getcardId() == cancel_credit){
                            limit.cancelCreditCard();
                            JOptionPane.showMessageDialog(null, "Card Canceled!");
                            iscancel = true;
                        }
                    }else{
                        iscancel = false;
                    }
                }
                if(iscancel == false){
                    JOptionPane.showMessageDialog(null, "Card Id has not been added yet");
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Please Enter Valid Card Id", "error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args){
        BankGUI obj = new BankGUI();
    }
}
