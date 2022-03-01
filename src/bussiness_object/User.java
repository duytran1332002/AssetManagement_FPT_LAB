/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussiness_object;

import MyLib.MyTools;
import MyLib.Validation;
import data_object.AssetList;
import data_object.IAssetList;
import data_object.IList;
import java.io.Serializable;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author user
 */
publ/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussiness_object;

import MyLib.MyTools;
import MyLib.Validation;
import data_object.AssetList;
import data_object.IAssetList;
import data_object.IList;
import java.io.Serializable;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author user
 */
public abstract class User implements Comparable<User>, Serializable{
    private String id;
    private String name;
    private Date birthdate;
    private String role;
    private String sex;
    private String pass;
    protected IAssetList assetList;

    // constructor
    public User(String id, String name, Date birthdate, String role, String sex, String pass){
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.role = role;
        this.sex = sex;
        try{
            this.pass = MyTools.encrypt(pass);
        }catch(Exception e){
            System.out.println("Something wrong");
        }
        //assetList = new AssetList();
    }

    public User() {
        //assetList = new AssetList();
    }
    
    // getter and setter

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

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        try{
            this.pass = MyTools.encrypt(pass);
        }catch(Exception e){
            System.out.println("Some thing wrong");
        }
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    public String checkInput(String mess, String partern){
        boolean flag = false;
        String keyword = "";
        do{
            try{
                keyword = Validation.inputString(mess, partern);
                flag = false;
            }catch(Exception e){
                System.out.println("Something wrong, please check!");
                flag = true;
            }
        }while(flag);
        return keyword;
    }
    
    @Override
    public String toString() {
        return id + "-" + name + "-" + birthdate + "-" + role + "-" + sex + "-" + pass;
    }

    @Override
    public int compareTo(User o){
        return id.compareTo(o.getId());
    }
    
    // login 
    public void inputLogin(){
        boolean flag = false;
        do{
            try{
                id = Validation.inputString("Input ID, EX: E160234: ", "(E\\d{6})"); 
                flag = false;
            }catch(Exception e){
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
        
        do{
            try{
                String tmp = Validation.inputString("Input password: ", "([\\w\\W]{5})[\\w\\W]+"); 
                pass = MyTools.encrypt(tmp);
                
                flag = false;
            }catch(Exception e){
                System.out.println(e.getCause());
                System.out.println("Some thing wrong, please check!");
                flag = true;
            }
        }while(flag);
    }
    
    public void searchAssetByName(){
        if(assetList.isEmpty()){
            System.out.println("This asset list is empty");
            return;
        }
        String keyword = checkInput("Input keyword of name: ", "([\\w\\W])+");
        Collection<Asset> nameCollect = assetList.searchByName(keyword);
        if(nameCollect.isEmpty()){
            System.out.println("No name with this keyword");
            return;
        }
        for (Asset vehicle : nameCollect) {
            System.out.println(vehicle);
        }
    }
    // some abstract class
    public abstract void loadData();
    public abstract void creatNewAsset();
    public abstract void updateAssetInfo();
    public abstract void approveRequest();
    public abstract void showBorowAsset();
}
