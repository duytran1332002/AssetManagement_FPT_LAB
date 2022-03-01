/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import MyLib.FileDAO;
import MyLib.Validation;
import bussiness_object.Asset;
import bussiness_object.Borrow;
import bussiness_object.Employee;
import bussiness_object.Manager;
import bussiness_object.Operation;
import bussiness_object.Request;
import bussiness_object.User;
import java.util.Date;
import java.util.TreeSet;

/**
 *
 * @author user
 */
public class Test {
    public static void main(String[] args) {
        try{
//            TreeSet<Asset> list = new TreeSet<>();
//            Asset a1 = new Asset("A001", "Samsung projector", "White", 500, 3.2, 10);
//            list.add(a1);
//            Asset a2 = new Asset("A003", "Macbook Pro 2016", "Silver", 1000, 2.2, 5);
//            list.add(a2);
//            FileDAO.writeBinaryFile("asset.dat", list);
//            TreeSet<Asset> listRead = new TreeSet<>();
//            listRead = FileDAO.readBinaryFile("asset.dat");
//            System.out.println(listRead);
//              try{
//                    String t = MyLib.MyTools.encrypt("123456");
//                    System.out.println(t);
//              }catch(Exception e){
//                    System.out.println("some thing wrng");
//              }
              
//            TreeSet<User> list = new TreeSet<>();
//            User u1 = new Employee("E160001", "Nguyen Hong Hiep", new Date(2000, 6, 12), "EM", "male", "123456");
//            User u2 = new Employee("E160240", "Tran Dinh Khanh", new Date(2002, 7, 15), "EM", "male", "123456");
//            User u3 = new Employee("E140449", "Le Buu Nhan", new Date(2002, 10, 7), "EM", "male", "123456");
//            User u4 = new Employee("E16078", "Truong Le Minh", new Date(2002, 3, 12), "EM", "male", "123456");
//            User u5 = new Manager("E160052", "Hoa Doan", new Date(1990, 6, 5), "MA", "male", "123456");
//            list.add(u1);
//            list.add(u2);
//            list.add(u3);
//            list.add(u4);
//            list.add(u5);
//            FileDAO.writeBinaryFile("employee.dat", list);
//            TreeSet<User> listRead = new TreeSet<>();
//            listRead = FileDAO.readBinaryFile("employee.dat");
//            for (User user : listRead) {
//                System.out.println(user);
//                System.out.println(user.getPass());
//                System.out.println(user.getClass().getSimpleName());
//            }

//              try{
//                  //String tmp = Validation.inputString("Input password: ", "([\\w\\W]{5})[\\w\\W]+");
//                  //System.out.println(tmp);
//                  User u = new Employee();
//                  System.out.println(u.checkInput("input", "([\\w\\W])+"));
//              }catch(Exception e){
//                  System.out.println("Soemthin");
//              }

//            Asset a1 = new Asset("A001", "Samsung projector", "White", 500, 3.2, 10);
//            Asset a2 = new Asset("A003", "Macbook Pro 2016", "Silver", 1000, 2.2, 5);
//            User u1 = new Employee("E160001", "Nguyen Hong Hiep", new Date(2000, 6, 12), "EM", "male", "123456");
//            User u2 = new Employee("E160240", "Tran Dinh Khanh", new Date(2002, 7, 15), "EM", "male", "123456");
//            User u3 = new Employee("E140449", "Le Buu Nhan", new Date(2002, 10, 7), "EM", "male", "1/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import MyLib.FileDAO;
import MyLib.Validation;
import bussiness_object.Asset;
import bussiness_object.Borrow;
import bussiness_object.Employee;
import bussiness_object.Manager;
import bussiness_object.Operation;
import bussiness_object.Request;
import bussiness_object.User;
import java.util.Date;
import java.util.TreeSet;

/**
 *
 * @author user
 */
public class Test {
    public static void main(String[] args) {
        try{
//            TreeSet<Asset> list = new TreeSet<>();
//            Asset a1 = new Asset("A001", "Samsung projector", "White", 500, 3.2, 10);
//            list.add(a1);
//            Asset a2 = new Asset("A003", "Macbook Pro 2016", "Silver", 1000, 2.2, 5);
//            list.add(a2);
//            FileDAO.writeBinaryFile("asset.dat", list);
//            TreeSet<Asset> listRead = new TreeSet<>();
//            listRead = FileDAO.readBinaryFile("asset.dat");
//            System.out.println(listRead);
//              try{
//                    String t = MyLib.MyTools.encrypt("123456");
//                    System.out.println(t);
//              }catch(Exception e){
//                    System.out.println("some thing wrng");
//              }
              
//            TreeSet<User> list = new TreeSet<>();
//            User u1 = new Employee("E160001", "Nguyen Hong Hiep", new Date(2000, 6, 12), "EM", "male", "123456");
//            User u2 = new Employee("E160240", "Tran Dinh Khanh", new Date(2002, 7, 15), "EM", "male", "123456");
//            User u3 = new Employee("E140449", "Le Buu Nhan", new Date(2002, 10, 7), "EM", "male", "123456");
//            User u4 = new Employee("E16078", "Truong Le Minh", new Date(2002, 3, 12), "EM", "male", "123456");
//            User u5 = new Manager("E160052", "Hoa Doan", new Date(1990, 6, 5), "MA", "male", "123456");
//            list.add(u1);
//            list.add(u2);
//            list.add(u3);
//            list.add(u4);
//            list.add(u5);
//            FileDAO.writeBinaryFile("employee.dat", list);
//            TreeSet<User> listRead = new TreeSet<>();
//            listRead = FileDAO.readBinaryFile("employee.dat");
//            for (User user : listRead) {
//                System.out.println(user);
//                System.out.println(user.getPass());
//                System.out.println(user.getClass().getSimpleName());
//            }

//              try{
//                  //String tmp = Validation.inputString("Input password: ", "([\\w\\W]{5})[\\w\\W]+");
//                  //System.out.println(tmp);
//                  User u = new Employee();
//                  System.out.println(u.checkInput("input", "([\\w\\W])+"));
//              }catch(Exception e){
//                  System.out.println("Soemthin");
//              }

//            Asset a1 = new Asset("A001", "Samsung projector", "White", 500, 3.2, 10);
//            Asset a2 = new Asset("A003", "Macbook Pro 2016", "Silver", 1000, 2.2, 5);
//            User u1 = new Employee("E160001", "Nguyen Hong Hiep", new Date(2000, 6, 12), "EM", "male", "123456");
//            User u2 = new Employee("E160240", "Tran Dinh Khanh", new Date(2002, 7, 15), "EM", "male", "123456");
//            User u3 = new Employee("E140449", "Le Buu Nhan", new Date(2002, 10, 7), "EM", "male", "123456");
//            User u4 = new Employee("E16078", "Truong Le Minh", new Date(2002, 3, 12), "EM", "male", "123456");
//            User u5 = new Manager("E160052", "Hoa Doan", new Date(1990, 6, 5), "MA", "male", "123456");
//            
//            Operation re1 = new Request("R001", a1, (Employee) u3, 1, new Date(2021, 23, 12, 12, 17, 56));
//            Operation re2 = new Request("R002", a2, (Employee) u1, 1, new Date(2021, 24, 12, 12, 18, 56));
//            Operation re3 = new Request("R003", a1, (Employee) u4, 1, new Date(2021, 23, 12, 11, 19, 56));
//            Operation re4 = new Request("R004", a2, (Employee) u2, 1, new Date(2021, 24, 12, 10, 10, 56));
//            TreeSet<Operation> list = new TreeSet<>();
//            list.add(re1);
//            list.add(re2);
//            list.add(re3);
//            list.add(re4);
//            FileDAO.writeBinaryFile("request.dat", list);
//            TreeSet<Request> listRead = new TreeSet<>();
//            listRead = FileDAO.readBinaryFile("request.dat");
//            for (Request re : listRead) {
//                System.out.println(re);
//                System.out.println(re.getEmployee().getName());
//            }

//            Asset a1 = new Asset("A001", "Samsung projector", "White", 500, 3.2, 10);
//            Asset a2 = new Asset("A003", "Macbook Pro 2016", "Silver", 1000, 2.2, 5);
//            User u1 = new Employee("E160001", "Nguyen Hong Hiep", new Date(2000, 6, 12), "EM", "male", "123456");
//            User u2 = new Employee("E160240", "Tran Dinh Khanh", new Date(2002, 7, 15), "EM", "male", "123456");
//            User u3 = new Employee("E140449", "Le Buu Nhan", new Date(2002, 10, 7), "EM", "male", "123456");
//            User u4 = new Employee("E16078", "Truong Le Minh", new Date(2002, 3, 12), "EM", "male", "123456");
//            User u5 = new Manager("E160052", "Hoa Doan", new Date(1990, 6, 5), "MA", "male", "123456");
//            
//            Operation br1 = new Borrow("B001", a1, (Employee) u1, 1, new Date(2021, 23, 12, 15, 13, 46));
//            Operation br2 = new Borrow("B002", a1, (Employee) u1, 2, new Date(2021, 25, 12, 16, 14, 56));
//            Operation br3 = new Borrow("B003", a2, (Employee) u4, 3, new Date(2021, 15, 12, 17, 15, 56));
//            Operation br4 = new Borrow("B007", a1, (Employee) u2, 2, new Date(2021, 26, 12, 12, 16, 56));
//            TreeSet<Operation> list = new TreeSet<>();
//            list.add(br1);
//            list.add(br2);
//            list.add(br3);
//            list.add(br4);
//            FileDAO.writeBinaryFile("borrow.dat", list);
//            TreeSet<Borrow> listRead = new TreeSet<>();
//            listRead = FileDAO.readBinaryFile("borrow.dat");
//            for (Borrow re : listRead) {
//                System.out.println(re);
//                System.out.println(re.getEmployee().getName());
//            }

//            TreeSet<Borrow> listRead = new TreeSet<>();
//            listRead = FileDAO.readBinaryFile("borrow.dat");
//            System.out.println(listRead);
//            FileDAO.writeBinaryFile("borrowSave.dat", listRead);

//            TreeSet<Request> listRead = new TreeSet<>();
//            listRead = FileDAO.readBinaryFile("request.dat");
//            System.out.println(listRead);
//            FileDAO.writeBinaryFile("requestSave.dat", listRead);

//            TreeSet<User> listRead = new TreeSet<>();
//            listRead = FileDAO.readBinaryFile("employee.dat");
//            System.out.println(listRead);
//            FileDAO.writeBinaryFile("employeeSave.dat", listRead);

//            TreeSet<Asset> listRead = new TreeSet<>();
//            listRead = FileDAO.readBinaryFile("asset.dat");
//            System.out.println(listRead);
//            FileDAO.writeBinaryFile("assetSave.dat", listRead);
        }catch(Exception e){
            System.out.println(e.getCause());
        }
    }
}
