/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLib;


import bussiness_object.Asset;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import static java.lang.Math.E;
import java.util.Collection;
import java.util.TreeSet;

/**
 *
 * @author user
 */
public class FileDAO {
    // ham nay de doc binary file
    public static TreeSet readBinaryFile(String fileName) throws Exception{
        TreeSet list = null;
        File f = new File(fileName);
        if(f.exists()){
            list = new TreeSet<>();
            FileInputStream fi = new FileInputStream(fileName);
            ObjectInputStream of = new ObjectInputStream(fi);
            list = (TreeSet) of.readObject();
            if(fi!=null) fi.close();
            if(of!=null) of.close(); 
        }else{
            System.out.println("Failed to load the data from " + fileName);
        }
        System.out.println("Load the content from file " + fileName + " successfully!");
        
        return list;
    }
    
    public static void writeBinaryFile(String filename, TreeSet h) throws Exception{
        FileOutputStream f = new FileOutputStream(filename);
        ObjectOutputStream of= new ObjectOutputStream(f);
        of.writeObject(h);
        if(f!=null) f.close();
        if(of!=null) of.close();
        System.out.println("Successfully write to the file " + filename);
    }
}
                                                                                                                                                                                                              /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLib;


import bussiness_object.Asset;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import static java.lang.Math.E;
import java.util.Collection;
import java.util.TreeSet;

/**
 *
 * @author user
 */
public class FileDAO {
    // ham nay de doc binary file
    public static TreeSet readBinaryFile(String fileName) throws Exception{
        TreeSet list = null;
        File f = new File(fileName);
        if(f.exists()){
            list = new TreeSet<>();
            FileInputStream fi = new FileInputStream(fileName);
            ObjectInputStream of = new ObjectInputStream(fi);
            list = (TreeSet) of.readObject();
            if(fi!=null) fi.close();
            if(of!=null) of.close(); 
        }else{
            System.out.println("Failed to load the data from " + fileName);
        }
        System.out.println("Load the content from file " + fileName + " successfully!");
        
        return list;
    }
    
    public static void writeBinaryFile(String filename, TreeSet h) throws Exception{
        FileOutputStream f = new FileOutputStream(filename);
        ObjectOutputStream of= new ObjectOutputStream(f);
        of.writeObject(h);
        if(f!=null) f.close();
        if(of!=null) of.close();
        System.out.println("Successfully write to the file " + filename);
    }
}
