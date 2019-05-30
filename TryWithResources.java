package Exeption;

import java.io.*;
import java.io.InputStream;

public class TryWithResources {    
public static void main(String args[]){      
        // Using try-with-resources  
try(FileOutputStream fileOutputStream =new FileOutputStream("/home/jayalakshmi/Desktop/xx/file.txt");
InputStream input = new FileInputStream("/home/jayalakshmi/Desktop/xx/file.txt")){      
String msg = " to javaTpoint!";      
byte byteArray[] = msg.getBytes(); //converting string into byte array      
fileOutputStream.write(byteArray);  
System.out.println("Message written to file successfuly!");      
DataInputStream inst = new DataInputStream (input);
int data = input.available();    
byte[] byteArray2 = new byte[data];   
inst.read(byteArray2);    
String str = new String(byteArray2);
System.out.println("------------Data read from file--------------");  
System.out.println(str);
}catch(Exception exception){  
       System.out.println(exception);  
}      
}      
}    