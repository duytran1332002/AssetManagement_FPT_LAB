/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussiness_object;

import MyLib.Validation;
import data_object.AssetList;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author user
 */
public class Employee extends User{
   
    
    public Employee()/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussiness_object;

import MyLib.Validation;
import data_object.AssetList;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author user
 */
public class Employee extends User{
   
    
    public Employee() {
        super();
    }

    public Employee(AssetList assetList) {
        this.assetList = assetList;
    }

    public Employee(String id, String name, Date birthdate, String role, String sex, String pass) throws NoSuchAlgorithmException {
        super(id, name, birthdate, role, sex, pass);
    }
    
    @Override
    public void loadData(){
        assetList = new AssetList();
        assetList.loadData();
    }

    @Override
    public void creatNewAsset() {
        System.out.println("with this role - Employee you can use this function");
        return;
    }

    @Override
    public void updateAssetInfo() {
        System.out.println("with this role - Employee you can use this function");
        return;
    }

    @Override
    public void approveRequest() {
        System.out.println("with this role - Employee you can use this function");
        return;
    }

    @Override
    public void showBorowAsset() {
        System.out.println("with this role - Employee you can use this function");
        return;
    }
}
