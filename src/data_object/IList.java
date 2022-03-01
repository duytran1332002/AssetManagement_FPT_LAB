/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_object;

/**
 *
 * @author user
 */
public interface IList {
    //some method to do in the list
    public boolean isEmpty();
    public void loadData();
    public/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_object;

/**
 *
 * @author user
 */
public interface IList {
    //some method to do in the list
    public boolean isEmpty();
    public void loadData();
    public void addNew();
    public Comparable searchById(String id);
    public void updateById(String id);
    public void removeById(String id);
    public void displayAll();
    public void saveData();
    
}
