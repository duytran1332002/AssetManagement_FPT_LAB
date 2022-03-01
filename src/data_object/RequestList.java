/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_object;

import MyLib.FileDAO;
import bussiness_object.Asset;
import bussiness_object.Request/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_object;

import MyLib.FileDAO;
import bussiness_object.Asset;
import bussiness_object.Request;
import java.util.TreeSet;

/**
 *
 * @author user
 */
public class RequestList implements IRequestList{
    TreeSet<Request> reList;
    private final String filename = "requestSave.dat";
    private final String filenameSave = "requestSave.dat";
    public RequestList() {
        reList = new TreeSet<>();
    }
    
    @Override
    public void loadData(){
        try{
            TreeSet<Request> tmp = tmp = FileDAO.readBinaryFile(filename);
            if(tmp.isEmpty()){
                System.out.println("No item in the list, please add item!");
                return;
            }else{
                for (Request item : tmp) {
                    if(searchById(item.getId()) == null){
                        reList.add(item);
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
        for (Request item : reList) {
            System.out.println(item);
        }
    }
    
    @Override
    // search vehicle by id
    public Request searchById(String id){
        for (Request item: reList) {
            if(item.getId().equals(id)){
                return item;
            }
        }
        return null;
    }
    
    @Override
    // remove the a vehicle by id
    public void removeById(String id){
        Request removeItem = searchById(id);
        if(removeItem == null){
            System.out.println("Borrow does not exist.");
            return;
        }
        if(!reList.remove(removeItem)){ 
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
            FileDAO.writeBinaryFile(filenameSave, reList);
        }catch(Exception e){
            System.out.println("Something wrong, please check!");
        }
        return;
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
