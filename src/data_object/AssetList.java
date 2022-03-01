/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_object;

import MyLib.FileDAO;
import bussiness_object.Asset;
import java.util.Collection;
import java.util.TreeSet;

/**
 *
 * @author user
 */
public class AssetList implements IAssetList{
    private TreeSet<Asset> assetList;
    private final String filename = "assetSave.dat";
    private final String filenameSave = "assetSave.dat";

    public AssetList() {
//        try{
//            assetList = FileDAO.readBinaryFile(filename);
//            if(assetList == null) assetList = new TreeSet<>();
//        }catch(Exception e){
//            System.out.println("Something wrong!");
//        }
          assetList = new TreeSet<>();
    }
    

    public AssetList(TreeSet<Asset> assetList) {
        this.assetList = assetList;
    }

    @Override
    public boolean isEmpty(){
        return assetList.isEmpty();
    }
    @Override
    // method to load the data from asset.dat
    public void loadData(){
        try{
            TreeSet<Asset> tmp = tmp = FileDAO.readBinaryFile(filename);
            if(tmp.isEmpty()){
                System.out.println("No item in the list, please add item!");
                return;
            }else{
                for (Asset vehicle : tmp) {
                    if(searchById(vehicle.getId()) == null){
                        assetList.add(vehicle);
                    }else{
                        System.out.println(vehicle.getId() + " has been exist, you can change and add it again!");
                    }
                }
            }
        }catch(Exception e){
            System.out.println("Something wrong, please check!");
        }
        return;
    }
    
    @Override
    // add a new asset
    public void addNew(){
        Asset newAssset = new Asset();
        AssetList tmp = new AssetList(assetList);
        newAssset.input(tmp);
        assetList.add(newAssset);
        System.out.println("Add a new asset successfully");
        saveData();
        return;
    }
    @Override
    // search vehicle by id
    public Asset searchById(String id){
        for (Asset item: assetList) {
            if(item.getId().equals(id)){
                return item;
            }
        }
        return null;
    }
    
    @Override
    // search a asset by name
    public Collection<Asset> searchByName(String keyword){
        TreeSet<Asset> afterSearching = new TreeSet<>();
        for (Asset item: assetList) {
            if(item.getName().toLowerCase().contains(keyword.toLowerCase())){
                afterSearching.add(item);
            }
        }
        Collection<Asset> descCollect = afterSearching.descendingSet();
        return descCollect;
    }
    
    @Override
    // update a vehicle
    public void updateById(String id){
        Asset itemUpdate = searchById(id);
        if(itemUpdate == null){
            System.out.println("asset with this id does not exist.");
            return;
        }
        AssetList tmp = new AssetList(assetList);
        itemUpdate.update(tmp);
        System.out.println("Update Successfull");
        System.out.println("After update:");
        System.out.println(itemUpdate);
        saveData();
        return;
    }
    @Override
    // display all the item
    public void displayAll(){ 
        System.out.println("The show room:");
        for (Asset item : assetList) {
            System.out.println(item);
        }
    }
    
    @Override
    // display all the item descending price
    public void displayDescendingPrice(){
        Collection<Asset> tmp = assetList.descendingSet(); 
        System.out.println("Descending price list:");
        for (Asset item : tmp) {
            System.out.println(item);
        }
    }
    @Override
    // check quantity
    public boolean checkOutOfQuantity(Asset asset){
        Asset getAsset = searchById(asset.getId());
        if(asset.getQuantity() > getAsset.getQuantity()) return true;
        return false;
    }
    
    @Override
    // save all to the file 
    public void saveData(){
        try{
            FileDAO.writeBinaryFile(filenameSave, assetList);
        }catch(Exception e){
            System.out.println("Something wrong, please check!");
        }
        return;
    }

    @Override
    public void removeById(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_object;

import MyLib.FileDAO;
import bussiness_object.Asset;
import java.util.Collection;
import java.util.TreeSet;

/**
 *
 * @author user
 */
public class AssetList implements IAssetList{
    private TreeSet<Asset> assetList;
    private final String filename = "assetSave.dat";
    private final String filenameSave = "assetSave.dat";

    public AssetList() {
//        try{
//            assetList = FileDAO.readBinaryFile(filename);
//            if(assetList == null) assetList = new TreeSet<>();
//        }catch(Exception e){
//            System.out.println("Something wrong!");
//        }
          assetList = new TreeSet<>();
    }
    

    public AssetList(TreeSet<Asset> assetList) {
        this.assetList = assetList;
    }

    @Override
    public boolean isEmpty(){
        return assetList.isEmpty();
    }
    @Override
    // method to load the data from asset.dat
    public void loadData(){
        try{
            TreeSet<Asset> tmp = tmp = FileDAO.readBinaryFile(filename);
            if(tmp.isEmpty()){
                System.out.println("No item in the list, please add item!");
                return;
            }else{
                for (Asset vehicle : tmp) {
                    if(searchById(vehicle.getId()) == null){
                        assetList.add(vehicle);
                    }else{
                        System.out.println(vehicle.getId() + " has been exist, you can change and add it again!");
                    }
                }
            }
        }catch(Exception e){
            System.out.println("Something wrong, please check!");
        }
        return;
    }
    
    @Override
    // add a new asset
    public void addNew(){
        Asset newAssset = new Asset();
        AssetList tmp = new AssetList(assetList);
        newAssset.input(tmp);
        assetList.add(newAssset);
        System.out.println("Add a new asset successfully");
        saveData();
        return;
    }
    @Override
    // search vehicle by id
    public Asset searchById(String id){
        for (Asset item: assetList) {
            if(item.getId().equals(id)){
                return item;
            }
        }
        return null;
    }
    
    @Override
    // search a asset by name
    public Collection<Asset> searchByName(String keyword){
        TreeSet<Asset> afterSearching = new TreeSet<>();
        for (Asset item: assetList) {
            if(item.getName().toLowerCase().contains(keyword.toLowerCase())){
                afterSearching.add(item);
            }
        }
        Collection<Asset> descCollect = afterSearching.descendingSet();
        return descCollect;
    }
    
    @Override
    // update a vehicle
    public void updateById(String id){
        Asset itemUpdate = searchById(id);
        if(itemUpdate == null){
            System.out.println("asset with this id does not exist.");
            return;
        }
        AssetList tmp = new AssetList(assetList);
        itemUpdate.update(tmp);
        System.out.println("Update Successfull");
        System.out.println("After update:");
        System.out.println(itemUpdate);
        saveData();
        return;
    }
    @Override
    // display all the item
    public void displayAll(){ 
        System.out.println("The show room:");
        for (Asset item : assetList) {
            System.out.println(item);
        }
    }
    
    @Override
    // display all the item descending price
    public void displayDescendingPrice(){
        Collection<Asset> tmp = assetList.descendingSet(); 
        System.out.println("Descending price list:");
        for (Asset item : tmp) {
            System.out.println(item);
        }
    }
    @Override
    // check quantity
    public boolean checkOutOfQuantity(Asset asset){
        Asset getAsset = searchById(asset.getId());
        if(asset.getQuantity() > getAsset.getQuantity()) return true;
        return false;
    }
    
    @Override
    // save all to the file 
    public void saveData(){
        try{
            FileDAO.writeBinaryFile(filenameSave, assetList);
        }catch(Exception e){
            System.out.println("Something wrong, please check!");
        }
        return;
    }

    @Override
    public void removeById(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
