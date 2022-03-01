/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import bussiness_object.Employee;
import bussiness_object.User;
import data_object.UserList;

/**
 *
 * @author user
 */
public class MangementProgram {
    public static void main(String[] args) {
        UserList userList = new UserList();
        User userCur = null;
        int choice = 0;
        String[] options = {"Login.", 
                            "Search Asset by Name.", 
                            "Create new asset.",
                            "Updating asset's information.",
                            "Approve the request of employee.",
                            "Show the list of borrow asstet.",
                            "Exit."};
        
        do{
            try{
                choice = MyLib.MyTools.inputOptionInMenu(options);
                switch(choice){
                    case 1:
                        if(userList.isCheckLogin()){
                            String check = userCur.checkInput("DO you want to change account(y/n)", "((y)|(n)|(Y)|(N))");
                            if(check.equalsIgnoreCase("n")){
                                System.out.println("Ok, thank you");
                            }else{
                                userCur = userList.login();
                                
                            }
                        }else{
                            userCur = userList.login();
                        }
                        break;
                    case 2:
                        if(!userList.isCheckLogin()){
                            System.out.println("Please login and try again");
                        }else{
                            userCur.searchAssetByName();
                        }
                        break;
                    case 3:
               /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import bussiness_object.Employee;
import bussiness_object.User;
import data_object.UserList;

/**
 *
 * @author user
 */
public class MangementProgram {
    public static void main(String[] args) {
        UserList userList = new UserList();
        User userCur = null;
        int choice = 0;
        String[] options = {"Login.", 
                            "Search Asset by Name.", 
                            "Create new asset.",
                            "Updating asset's information.",
                            "Approve the request of employee.",
                            "Show the list of borrow asstet.",
                            "Exit."};
        
        do{
            try{
                choice = MyLib.MyTools.inputOptionInMenu(options);
                switch(choice){
                    case 1:
                        if(userList.isCheckLogin()){
                            String check = userCur.checkInput("DO you want to change account(y/n)", "((y)|(n)|(Y)|(N))");
                            if(check.equalsIgnoreCase("n")){
                                System.out.println("Ok, thank you");
                            }else{
                                userCur = userList.login();
                                
                            }
                        }else{
                            userCur = userList.login();
                        }
                        break;
                    case 2:
                        if(!userList.isCheckLogin()){
                            System.out.println("Please login and try again");
                        }else{
                            userCur.searchAssetByName();
                        }
                        break;
                    case 3:
                        if(!userList.isCheckLogin()){
                            System.out.println("Please login and try again");
                        }else{
                            userCur.creatNewAsset();
                        }
                        break;
                    case 4:
                        if(!userList.isCheckLogin()){
                            System.out.println("Please login and try again");
                        }else{
                            userCur.updateAssetInfo();
                        }
                        break;
                    case 5:
                        if(!userList.isCheckLogin()){
                            System.out.println("Please login and try again");
                        }else{
                            userCur.approveRequest();
                        }
                        break;
                    case 6:
                        if(!userList.isCheckLogin()){
                            System.out.println("Please login and try again");
                        }else{
                            userCur.showBorowAsset();
                        }
                        break;
                    default:
                        System.out.println("GoodBye!");
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
                //System.out.println("Something wrong! check it again!");
            }
        }while(choice <= 6);
    }
}
