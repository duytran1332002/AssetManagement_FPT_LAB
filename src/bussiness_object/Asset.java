/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussiness_object;

import MyLib.Validation;
import data_object.AssetList;
import java.io.Serializable;

/**
 *
 * @author user
 */
public class Asset implements Comparable<Asset>, Serializable{
    private String id;
    private String name;
    private String color;
    private int price;
    private double weight;
    private int quantity;

    // constructor
    public Asset() {
    }

    public Asset(String id, String name, String color, int price, double weight, int quantity) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussiness_object;

import MyLib.Validation;
import data_object.AssetList;
import java.io.Serializable;

/**
 *
 * @author user
 */
public class Asset implements Comparable<Asset>, Serializable{
    private String id;
    private String name;
    private String color;
    private int price;
    private double weight;
    private int quantity;

    // constructor
    public Asset() {
    }

    public Asset(String id, String name, String color, int price, double weight, int quantity) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    // input asset
    public void input(AssetList list){
        boolean flag = false;
        do{
            try{
                id = Validation.inputString("Input ID, EX: A001: ", "(A\\d{3})");
                if(list.searchById(id) != null){
                    System.out.println("This id has been exist!Please try another");
                    throw new Exception();
                }
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
        
        do{
            try{
                name = Validation.inputString("Input name: ", "([\\w\\W]+)");
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
        
        do{
            try{
                color = Validation.inputString("Input color, EX: red, green: ", "([a-zA-Z]+)");
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
        
        do{
            try{
                price = (int) Validation.inputNumber("Input the price:", "int");
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
        
        do{
            try{
                weight = (double) Validation.inputNumber("Input the weight:", "double");
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
        
        do{
            try{
                quantity = (int) Validation.inputNumber("Input the quantity:", "int");
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
    }
    
    //update asset
    public void update(AssetList list){
        boolean flag = false;
//        do{
//            try{
//                String tmp = Validation.inputString("Input a new ID, EX: A001: ", "(A\\d{3})|()");
//                if(!tmp.isEmpty()){
//                    if(list.searchById(tmp) != null){
//                        System.out.println("This id has been existed, please try another");
//                        throw new Exception();
//                    }else{
//                        id = tmp;
//                    }
//                }
//                flag = false;
//            }catch(Exception e){
//                System.out.println("Some thing wrong, please check!");
//                flag = true;
//            }
//        }while(flag);
        
        do{
            try{
                String tmp = Validation.inputString("Input a new name: ", "()|([\\w\\W]+)");
                if(!tmp.isEmpty()){
                    name = tmp;
                }
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
        
        do{
            try{
                String tmp = Validation.inputString("Input a new color, EX: red, green: ", "()|(([a-zA-Z]+))");
                if(!tmp.isEmpty()){
                    color = tmp;
                }
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
        
        do{
            try{
                String tmp = Validation.inputString("Input a new price", "()|([\\d]+)");
                if(!tmp.isEmpty()){
                    price = Integer.parseInt(tmp);
                }
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
        
        do{
            try{
                String tmp = Validation.inputString("Input a new weight: ", "()|([\\d]+(\\.)?([\\d]+)?)");
                if(!tmp.isEmpty()){
                    weight = Double.parseDouble(tmp);
                }
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
        
        do{
            try{
                String tmp = Validation.inputString("Input a new quantity", "()|([\\d]+)");
                if(!tmp.isEmpty()){
                    quantity = Integer.parseInt(tmp);
                }
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
    }

    @Override
    public String toString() {
        return id + "-" + name + "-" + color + "-" + price + "-" + weight + "-" + quantity;
    }
    
    @Override
    public int compareTo(Asset o) {
        if(price >= o.getPrice()){
            return 1;
        }else{
            return -1;
        }
    }
    
}
