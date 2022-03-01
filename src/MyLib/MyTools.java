/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLib;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class MyTools {
    // to show menu
    // accept an option and return 
    public static int inputOptionInMenu(String[] options) throws Exception{
        for (int i = 0; i < options.length; i++) {
            String option = options[i];
            System.out.println((i+1) + ". " + option);
        }
        int choice = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("input option: ");
        choice = scan.nextInt();
        if(choice <= 0) throw new Exception();
        return choice;
            
    }
    
    // encryption the password
    // input: String -> output: String
    public static String encrypt(String pass) throws NoSuchAlgorithmException{
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(pass.getBytes());
        byte[] digest = md.digest();
        BigInteger no = new BigInteger(1, digest);
        // Convert message digest into hex value
        String hashtext = no.toString(16);
        while (hashtext.length() < 32) {
            hashtext = "0" + hashtext;
        }
        return hashtext;
    }
}
                                                                                                                                                                                                                                              /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLib;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class MyTools {
    // to show menu
    // accept an option and return 
    public static int inputOptionInMenu(String[] options) throws Exception{
        for (int i = 0; i < options.length; i++) {
            String option = options[i];
            System.out.println((i+1) + ". " + option);
        }
        int choice = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("input option: ");
        choice = scan.nextInt();
        if(choice <= 0) throw new Exception();
        return choice;
            
    }
    
    // encryption the password
    // input: String -> output: String
    public static String encrypt(String pass) throws NoSuchAlgorithmException{
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(pass.getBytes());
        byte[] digest = md.digest();
        BigInteger no = new BigInteger(1, digest);
        // Convert message digest into hex value
        String hashtext = no.toString(16);
        while (hashtext.length() < 32) {
            hashtext = "0" + hashtext;
        }
        return hashtext;
    }
}
