package test.com.HelperClasses;

/**
 * Created by Nilesh Verma on 6/20/2016.
 */
public class ItemTabelInfo {
    private String date, addedBy, desc , Itemname ,catagory , quantity,Price;
    int sr;

    public ItemTabelInfo(int sr, String item_name, String category_name, String quantity, String added_by,
                         String date, String Price, String desc){
        this.Itemname = item_name;
        this.catagory = category_name;
        this.quantity = quantity;
        this.addedBy = added_by;
        this.date = date;
        this.Price = Price;
        this.desc = desc;
        this.sr = sr;
    }

    public String getItemName(){
        return Itemname;
    }
    public String getDate(){
        return date;
    }
    public String getAddedBy(){
        return addedBy;
    }
    public String getDesc(){
        return desc;
    }
    public String getSrNo(){
        return String.valueOf(sr);
    }
    public String getCatagory(){
        return catagory;
    }
    public String getQuantity(){
        return quantity;
    }
    public String getPrice(){
        return Price;
    }
}
