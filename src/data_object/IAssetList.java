/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_object;

import bussiness_object.Asset;
import java.util.Collection;

/**
 *
 * @author user
 */
public interface IAssetList extends IList{
    public void displayDescendingPrice();
    public Collection<Asset> searchByName(String keyword);
    public boolean checkOutOfQuantity(Asset asset);
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_object;

import bussiness_object.Asset;
import java.util.Collection;

/**
 *
 * @author user
 */
public interface IAssetList extends IList{
    public void displayDescendingPrice();
    public Collection<Asset> searchByName(String keyword);
    public boolean checkOutOfQuantity(Asset asset);
}
