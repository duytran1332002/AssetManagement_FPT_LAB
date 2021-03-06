/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_object;

import MyLib.FileDAO;
import bussiness_object.Employee;
import bussiness_object.User;
import java.util.TreeSet;

/**
 *
 * @author user
 */
public class UserList {
    private TreeSet<User> userList;
    private final String filename = "employeeSave.dat";
    private final String filenameSave = "employeeSave.dat";
    private boolean checkLogin = false;
    public UserList() {
        try{
            userList = FileDAO.readBinaryFile(filename);
            if(userList == null) userList = new TreeSet<>();
        }catch(Exception e){
            System.out.println("Something wrong");
        }
    }

    public boolean isCheckLogin() {
        return checkLogin;
    }

    public void setCheckLogin(boolean checkLogin) {
        this.checkLogin = checkLogin;
    }
    
    // search vehicle by id
    public User searchById(String id){
        for (User item: userList) {
            if(item.getId().equals(id)){
                return item;
            }
        }
        return null;
    }
    
    public User login(){
        boolean check = false;
        User userInput = new Employee();
        User userCheck = null;
        do{
            userInput.inputLogin();
            userCheck = searchById(userInput.getId());
            if( userCheck == null || !userInput.getPass().equals(userCheck.getPass())){
                System.out.println("No Id like that, please check Id!");
                check = true;
            }else{
                System.out.println("Login Successfully");
                userCheck.loadData();
                checkLogin = true;
                check = false;
            }
        }while(check);
        return userCheck;
    }
    
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_object;

import MyLib.FileDAO;
import bussiness_object.Employee;
import bussiness_object.User;
import java.util.TreeSet;

/**
 *
 * @author user
 */
public class UserList {
    private TreeSet<User> userList;
    private final String filename = "employeeSave.dat";
    private final String filenameSave = "employeeSave.dat";
    private boolean checkLogin = false;
    public UserList() {
        try{
            userList = FileDAO.readBinaryFile(filename);
            if(userList == null) userList = new TreeSet<>();
        }catch(Exception e){
            System.out.println("Something wrong");
        }
    }

    public boolean isCheckLogin() {
        return checkLogin;
    }

    public void setCheckLogin(boolean checkLogin) {
        this.checkLogin = checkLogin;
    }
    
    // search vehicle by id
    public User searchById(String id){
        for (User item: userList) {
            if(item.getId().equals(id)){
                return item;
            }
        }
        return null;
    }
    
    public User login(){
        boolean check = false;
        User userInput = new Employee();
        User userCheck = null;
        do{
            userInput.inputLogin();
            userCheck = searchById(userInput.getId());
            if( userCheck == null || !userInput.getPass().equals(userCheck.getPass())){
                System.out.println("No Id like that, please check Id!");
                check = true;
            }else{
                System.out.println("Login Successfully");
                userCheck.loadData();
                checkLogin = true;
                check = false;
            }
        }while(check);
        return userCheck;
    }
    
}
