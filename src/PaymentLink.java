/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaliyas
 */
public class PaymentLink {
    private int customer_id;
    private String date;
    private int amountpaid;
    private String bankname;
    private int accountno;
    
    
    
    
    
    
    public PaymentLink(int customer_id,String date,int amountpaid,String bankname,int accountno)
    {
        this.customer_id=customer_id;
        this.amountpaid=amountpaid;
        this.accountno=accountno;
        this.date=date;
        
    }

    PaymentLink(int aInt, String string, String string0, String string1, String string2, String string3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getCId()
    {
        return customer_id;
    }
    public int getAmountpaid()
    {
        return amountpaid;
    }
    public int getAccountno()
    {
      return accountno;  
    }
                          
    public String getdate()
    {
        return date;
        
    }
    
}