/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussiness_object;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author user
 */
public abstract class Operation implements Comparable<Operation>, Serializable{
    private String id;
    private Date opDate;
    private Employee employee;
    private Asset asset;
    private int quantity;

    // constructor
    public Operation() {
    }

    public Operation(String id, Asset asset, Employee employee, int quantity, Date opDate) {
        this.id = id;
        this.opDate = opDate;
        this.employee = employee;
        this.asset = asset;
        this.quantity = quantity;
    }

    // getter and setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getOpDate() {
        return opDate;
    }

    public void setOpDate(Date opDate) {
        this.opDate = opDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return id + "-" + asset.getId() + "-" + employee.getId() + "-" + quantity + "-" + opDate;
    }
    
    @Override
    public int compareTo(Operation o){
        return id.compareTo(o.getId());
    }
    
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussiness_object;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author user
 */
public abstract class Operation implements Comparable<Operation>, Serializable{
    private String id;
    private Date opDate;
    private Employee employee;
    private Asset asset;
    private int quantity;

    // constructor
    public Operation() {
    }

    public Operation(String id, Asset asset, Employee employee, int quantity, Date opDate) {
        this.id = id;
        this.opDate = opDate;
        this.employee = employee;
        this.asset = asset;
        this.quantity = quantity;
    }

    // getter and setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getOpDate() {
        return opDate;
    }

    public void setOpDate(Date opDate) {
        this.opDate = opDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return id + "-" + asset.getId() + "-" + employee.getId() + "-" + quantity + "-" + opDate;
    }
    
    @Override
    public int compareTo(Operation o){
        return id.compareTo(o.getId());
    }
    
}
