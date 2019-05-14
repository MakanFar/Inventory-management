/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author makan
 */
public class arrayOfProducts {
    File file = new File("dataBase.txt");
    PrintWriter fileUpdate;
    ArrayList<product> AOP = new ArrayList();

     public arrayOfProducts() throws FileNotFoundException {

        File file = new File("dataBase.txt");

        Scanner fr = new Scanner(file);

        product k;
        while (fr.hasNextLine()) {
            k = new product(fr.nextLine());
            AOP.add(k);
        }
        fr.close();

    }

    
    public void delete(String userSearch) {
        int p = search(userSearch);
        if (p == -1) {
            //System.out.println("product not found");
        } else {
            AOP.remove(p);
        }

    }
    public void add(String Id2, String Name2,Double Price2 ,int Quantity2 , String Category2) {

        AOP.add(new product(Id2, Name2, Price2, Quantity2, Category2));

    }

    public int search(String userSearch) {
        int search = -1;
        for (int i = 0; i < AOP.size(); i++) {
            if ( AOP.get(i).getId().equals(userSearch)) {
                search = i;
            }
        }
        return search;
    }
    
     
         public void save() {
        try {
            fileUpdate = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        for (int i = 0; i < AOP.size(); i++) {
            String ArrayLine;
            ArrayLine = AOP.get(i).getId()+","+AOP.get(i).getName()+","+AOP.get(i).getPrice()+
                    ","+AOP.get(i).getQuantity()+","+ AOP.get(i).getCategory();
            System.out.println(ArrayLine);
            fileUpdate.println(ArrayLine);
            fileUpdate.flush();
        }

    }
         public double balance(){
            
             double totalBalance=0;
             double balance=0;
             for (int i = 0; i < AOP.size(); i++) {
                 balance= (Double) ((AOP.get(i).getPrice())*(AOP.get(i).getQuantity()));
                  totalBalance += balance;
                 
             }
             return totalBalance;
         } 
       
         public String searchMenu(int userSearching){
             
             String result;
              result = "ID:"+AOP.get(userSearching).getId()+"    Name:"+AOP.get(userSearching).getName()+"    Price:"+AOP.get(userSearching).getPrice()+
                    "    Quantity:"+AOP.get(userSearching).getQuantity()+"    Category:"+ AOP.get(userSearching).getCategory();
        return result;
         
         }
    
    
}
