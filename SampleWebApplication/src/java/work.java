
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kavitha
 */
public  class work {
    private int currentSize, maxSize=99;
 ArrayList<String> keys=new ArrayList<String>();
 
    // Constructor of this class
 
    // Method 1
    // Function to clear hash table
 
    // Method 2
    // Function to get size of hash table
 
    // Method 3
    // Function to check if hash table is full

    public work() throws FileNotFoundException {
    Scanner s =new Scanner(new File("C:\\Users\\Kavitha\\Desktop\\data\\keys.txt"));
    while(s.hasNext()){
        keys.add(s.next());
    }
    s.close();
    }
    
 
    // Method 4
    // Function to check if hash table is empty
 
    // Method 5
    // Function to check if hash table contains a key
    public boolean contains(String key)
    {
        return keys.contains(key);
    }
 
    // Method 6
    // Function to get hash code of a given key
    //i*i%maxsize
    private int hash(String key)
    {
        return Math.abs(key.hashCode()) % maxSize;
    }
 
    // Method 7
    // Function to insert key-value pair
    public void insert(String key, String val, String Phoneno, String type, String Address) throws IOException
    {
        
        int tmp = hash(key);
        
        int i = tmp;
       FileWriter fd = new FileWriter(new File("C:\\Users\\Kavitha\\Desktop\\data\\data.txt"),true);
       FileWriter fk = new FileWriter(new File("C:\\Users\\Kavitha\\Desktop\\data\\keys.txt"),true);
       
        // Do-while loop
        // Do part for performing actions
        do {
            if (!contains(String.valueOf(i))) {
                fk.append("\n"+i);
                fd.append("\n"+i+","+key+","+val+","+Phoneno+","+type+","+Address);
                fd.close();
                fk.close();
                return;
            }
 
 
            i = (i + 1) % maxSize;
 
        }
 
        // Do-while loop
        // while part for condition check
        while (i != tmp);
    }
 
    // Method 8
    // Function to get value for a given key
    
  public String search(String key) throws FileNotFoundException, IOException
    {
        ArrayList<String> data =new ArrayList<String>();
       Scanner s =new Scanner(new File("C:\\Users\\Kavitha\\Desktop\\data\\data.txt"));
       while(s.hasNext()){
           String d=s.nextLine();
            data.add(d);
       }
        s.close();
          String t="";
       for(String i:data){
            if(i.split(",")[1].equalsIgnoreCase(key)){
               return i;
           }
       }
      
      return "Record not found";
    }
    // Method 9
    // Function to remove key and its value
    public void remove(String key) throws IOException
    {
//       FileWriter fd = new FileWriter(new File("C:\\Users\\Kavitha\\Desktop\\data\\data.txt"));
       ArrayList<String> data =new ArrayList<String>();
       Scanner s =new Scanner(new File("C:\\Users\\Kavitha\\Desktop\\data\\data.txt"));
       while(s.hasNext()){
           String d=s.nextLine();
           System.out.println(d);
           data.add(d);
       }
        System.out.println(data.size());
        s.close();
        FileWriter fd = new FileWriter(new File("C:\\Users\\Kavitha\\Desktop\\data\\data.txt"));
       String t="";
       for(String i:data){
           System.out.println(i.split(",")[1]+" *** "+i.split(",")[1].equalsIgnoreCase(key));
           if(!i.split(",")[1].equalsIgnoreCase(key)){
               System.out.println(i+" written ");
               fd.append(i+"\n");
           }else if(i!=null){
               t=i.split(",")[0];
           }
       }
       fd.close();
        System.out.println(t+"*******************************");

       FileWriter fk = new FileWriter(new File("C:\\Users\\Kavitha\\Desktop\\data\\keys.txt"));
       for(String j:keys){
           if(!j.equalsIgnoreCase(t))
           fk.append(j+"\n");
       }
       fk.close();
//       
        }
      
    }


