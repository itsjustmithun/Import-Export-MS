/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaliyas
 */
public class SalesLink {
      private String date;
    private int customer_id;
    private String customer_name;
    private int seller_id;
    private String business_type;
    private int product_id;
    private String product_name;
    private String category;
    private int price;
    private int quantity;
    private int totalprice;
    
    
    public SalesLink(String date,int customer_id,String customer_name,int seller_id, String businesstype,int product_id,String product_name,String category,int price,int quantity,int totalprice)
    {
        this.date=date;
        this.customer_id=customer_id;
        this.customer_name=customer_name;
        this.seller_id=seller_id;
        this.business_type=businesstype;
        this.product_id=product_id;
        this.product_name=product_name;
        this.category=category;
        this.price=price;
        this.quantity=quantity;
        this.totalprice=totalprice;
        
    }

    SalesLink(int aInt, String string, String string0, String string1, String string2, String string3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getdate()
    {
        return date;
    }
    public int getCId()
    {
        return customer_id;
        
    }
      public String getCname()
    {
        return customer_name;
        
    }
       public String getbusiness()
    {
        return business_type;
        
    }
       public int getPId()
    {
        return product_id;
    }
    public String getPname()
    {
        return product_name;
        
    }
    public String getcat()
    {
        return category;
        
    }
    public float getprice()
    {
        return price;
        
    }
    public int getSId()
    {
        return seller_id;
    }
    public int getquantity()
    {
        return quantity;
        
    }
    public int getTotalprice()
    {
        return totalprice;
    }
    
}
