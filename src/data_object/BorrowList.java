/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_object;

import MyLib.FileDAO;
import bussiness_object.Borrow;
import bussiness_object.Operation;
import bussiness_object.Request;
import java.util.TreeSet;

/**
 *
 * @author user
 */
public class BorrowList implements IBorrowList{
    TreeSet<Borrow> boList;
    private final String filename = "borrowSave.dat";
    private final String filenameSave = "borrowSave.dat";
    
    public BorrowList() {
        boList = new TreeSet<>();
    }
    
    @Override
    public void loadData(){
        try{
            TreeSet<Borrow> tmp = tmp = FileDAO.readBinaryFile(filename);
            if(tmp.isEmpty()){
                System.out.println("No item in the list, please add item!");
                return;
            }else{
                for (Borrow item : tmp) {
                    if(searchById(item.getId()) == null){
                        boList.add(item);
                    }else{
                        System.out.println(item.getId() + " has been exist, you can change and add it again!");
                    }
                }
            }
        }catch(Exception e){
            System.out.println("Something wrong, please check!");
        }
        return;
    }
    
    @Override
    // display all the item
    public void displayAll(){ 
        System.out.println("The show room:");
        for (Borrow item : boList) {
            System.out.println(item);
        }
    }
    
    @Override
    // search vehicle by id
    public Borrow searchById(String id){
        for (Borrow item: boList) {
            if(item.getId().equals(id)){
                return item;
            }
        }
        return null;
    }
    
    @Override
    //add request to borrow list
    public void addRequestToBorrow(Request re){
        String id = "B00"  + Integer.toString(boList.size() + 1);
        Borrow newBorrow = new Borrow(id, re.getAsset(), 
                re.getEmployee(), re.getQuantity(), re.getOpDate());
        boList.add(newBorrow);
        System.out.println("Successfully add to borrow list");
        return;
    }
    
    @Override
    // remove the a vehicle by id
    public void removeById(String id){
        Borrow removeItem = searchById(id);
        if(removeItem == null){
            System.out.println("Borrow does not exist.");
            return;
        }
        if(!boList.remove(removeItem)){ 
            System.out.println("Remove failed!");
            return;
        }else{
            System.out.println("Remove successfull!");
        }
        return;
    }
    
    @Override
    // save all to the file 
    public void saveData(){
        try{
            FileDAO.writeBinaryFile(filenameSave, boList);
        }catch(Exception e){
            System.out.println("Something wrong, please check!");
        }
        return;
    }

    @Override
    public boolean isEmpty() {
        return boList.isEmpty();
    }

    @Override
    public void addNew() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_object;

import MyLib.FileDAO;
import bussiness_object.Borrow;
import bussiness_object.Operation;
import bussiness_object.Request;
import java.util.TreeSet;

/**
 *
 * @author user
 */
public class BorrowList implements IBorrowList{
    TreeSet<Borrow> boList;
    private final String filename = "borrowSave.dat";
    private final String filenameSave = "borrowSave.dat";
    
    public BorrowList() {
        boList = new TreeSet<>();
    }
    
    @Override
    public void loadData(){
        try{
            TreeSet<Borrow> tmp = tmp = FileDAO.readBinaryFile(filename);
            if(tmp.isEmpty()){
                System.out.println("No item in the list, please add item!");
                return;
            }else{
                for (Borrow item : tmp) {
                    if(searchById(item.getId()) == null){
                        boList.add(item);
                    }else{
                        System.out.println(item.getId() + " has been exist, you can change and add it again!");
                    }
                }
            }
        }catch(Exception e){
            System.out.println("Something wrong, please check!");
        }
        return;
    }
    
    @Override
    // display all the item
    public void displayAll(){ 
        System.out.println("The show room:");
        for (Borrow item : boList) {
            System.out.println(item);
        }
    }
    
    @Override
    // search vehicle by id
    public Borrow searchById(String id){
        for (Borrow item: boList) {
            if(item.getId().equals(id)){
                return item;
            }
        }
        return null;
    }
    
    @Override
    //add request to borrow list
    public void addRequestToBorrow(Request re){
        String id = "B00"  + Integer.toString(boList.size() + 1);
        Borrow newBorrow = new Borrow(id, re.getAsset(), 
                re.getEmployee(), re.getQuantity(), re.getOpDate());
        boList.add(newBorrow);
        System.out.println("Successfully add to borrow list");
        return;
    }
    
    @Override
    // remove the a vehicle by id
    public void removeById(String id){
        Borrow removeItem = searchById(id);
        if(removeItem == null){
            System.out.println("Borrow does not exist.");
            return;
        }
        if(!boList.remove(removeItem)){ 
            System.out.println("Remove failed!");
            return;
        }else{
            System.out.println("Remove successfull!");
        }
        return;
    }
    
    @Override
    // save all to the file 
    public void saveData(){
        try{
            FileDAO.writeBinaryFile(filenameSave, boList);
        }catch(Exception e){
            System.out.println("Something wrong, please check!");
        }
        return;
    }

    @Override
    public boolean isEmpty() {
        return boList.isEmpty();
    }

    @Override
    public void addNew() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
