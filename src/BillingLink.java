
import java.sql.ResultSet;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaliyas
 */
public class BillingLink {

    static TableModel resultSetToTableModel(ResultSet rs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private int customer_id; 
    private String customer_name;
    private int seller_id; 
    private String seller_name;
    
    
    public BillingLink(int customer_id,String customer_name,int seller_id,String seller_name)
    {
        this.customer_id=customer_id;
        this.seller_id=seller_id;
        this.customer_name=customer_name;
        this.seller_name=seller_name;
        
        
    }

    BillingLink(int aInt, String string, String string0, String string1, String string2, String string3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getCId()
    {
        return customer_id;
    }
     public int getSId()
    {
        return seller_id;
    }
    public String getCname()
    {
        return customer_name;
        
    }
    public String getSname()
    {
        return seller_name;
        
    }
    
    
    
}
