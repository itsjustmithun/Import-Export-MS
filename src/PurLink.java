/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mithun
 */
public class PurLink {
    private int purchase_id;
    private String seller_name;
     private String product_name;
    private int seller_id;
    private int product_id;
    private int product_price;
    private String date;
    private int quantity;

    PurLink(int aInt, int aInt0, String string, int aInt1, String string0, int aInt2, int aInt3, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    public int getpurchId()
    {
        return purchase_id;
    }
    public String getSname()
    {
        return seller_name;
        
    }
    public String getPname()
    {
        return product_name;
        
    }
    public int getsid()
    {
        return seller_id;
        
    }
    public int getprodId()
    {
        return product_id;
        
    }
    public int getprodprice()
    {
        return product_price;
        
    }
    public String getdate()
    {
        return date;
        
    }
    public int getquant()
    {
        return quantity;
    }
     
}
