/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author makan
 */
public class product {
    private String id;
    private String name;
    private int quantity;
    private double price;
    private String category;
    
     product(String line) {
        String linesplit[]= line.split(",");
        id=linesplit[0];
        name=linesplit[1];
        price=Double.parseDouble(linesplit[2]);
        quantity=Integer.parseUnsignedInt(linesplit[3]);
        
        category=linesplit[4];
        
    }
     product(String  Id,String Name, Double Price, int Quantity,
            String Category){
        name=Name;
        id=Id;
        quantity=Quantity;
        price=Price;  
        category= Category;
        
    }

    String getName(){
        return name;
    }
    String getId(){
        return id;
    }
    String getCategory(){
        return category;
    }
    Double getPrice(){
       return price;
   }
    int getQuantity(){
       return quantity;
   } 
     String setName(String name2) {
       return this.name = name2;
}
       String setCategory(String category2) {
       return this.category = category2;
}
      String setId(String id2) {
    return this.id = id2;
}
       Double setPrice(Double price2) {
    return this.price = price2;
}
        int setQuantity(int quantity2) {
    return this.quantity = quantity2;
}
   
    
    
    
}
