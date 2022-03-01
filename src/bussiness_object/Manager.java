/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussiness_object;

import data_object.AssetList;
import data_object.BorrowList;
import data_object.IBorrowList;
import data_object.IRequestList;
import data_object.RequestList;
import java.io.Serializable;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

/**
 *
 * @author user
 */
public class Manager extends User{

    private IRequestList reList;
    private IBorrowList boList;
    
    public Manager() {
        super();
        //reList = new RequestList();
        //boList = new BorrowList();
        
    }

    public Manager(String id, String name, Date birthdate, String role, String sex, String pass) throws NoSuchAlgorithmException {
        super(id, name, birthdate, role, sex, pass);
        //reList = new RequestList();
        //boList = new BorrowList();
    }
    
    @Override
    public void loadData(){
        assetList = new AssetList();
        reList = new RequestList();
        boList = new BorrowList();
        assetList.loadData();
        reList.loadData();
        boList.loadData();
    }
    // method create new asset
    @Override
    public void creatNewAsset(){
        assetList.addNew();
    }
    
    // method to update asset infor
    @Override
    public void updateAssetInfo(){
        String keyword = checkInput("Input id that you want to upd/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussiness_object;

import data_object.AssetList;
import data_object.BorrowList;
import data_object.IBorrowList;
import data_object.IRequestList;
import data_object.RequestList;
import java.io.Serializable;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

/**
 *
 * @author user
 */
public class Manager extends User{

    private IRequestList reList;
    private IBorrowList boList;
    
    public Manager() {
        super();
        //reList = new RequestList();
        //boList = new BorrowList();
        
    }

    public Manager(String id, String name, Date birthdate, String role, String sex, String pass) throws NoSuchAlgorithmException {
        super(id, name, birthdate, role, sex, pass);
        //reList = new RequestList();
        //boList = new BorrowList();
    }
    
    @Override
    public void loadData(){
        assetList = new AssetList();
        reList = new RequestList();
        boList = new BorrowList();
        assetList.loadData();
        reList.loadData();
        boList.loadData();
    }
    // method create new asset
    @Override
    public void creatNewAsset(){
        assetList.addNew();
    }
    
    // method to update asset infor
    @Override
    public void updateAssetInfo(){
        String keyword = checkInput("Input id that you want to update ", "(A\\d{3})");
        assetList.updateById(keyword);
    }
    
    //approve the request of employee
    @Override
    public void approveRequest(){
        reList.displayAll();
        String id = checkInput("Input the request id that you want to approve", "(R\\d{3})");
        Request reApproved = (Request) reList.searchById(id);
        if(reApproved == null){
            System.out.println("No request with this id, try again!");
            return;
        }
        if(assetList.checkOutOfQuantity(reApproved.getAsset())){
            Asset getAsset = (Asset) assetList.searchById(id);
            int newQuan = getAsset.getQuantity() - reApproved.getQuantity();
            getAsset.setQuantity(newQuan);
            System.out.println("Out of current quantity");
            return;
        }
        reList.removeById(id);
        reList.saveData();
        boList.addRequestToBorrow(reApproved);
        boList.displayAll();
        boList.saveData();
    }
    
    // show the borrow of List
    @Override
    public void showBorowAsset(){
        boList.displayAll();
    }
}
