/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.io.*;

public class ReaderClass {

    public static void main(String [] Args){
        
        String fileName = "C:\\test\\file.txt";
        
FileReader fr = null;
BufferedReader br = null;
    
try{
    fr = new FileReader(fileName);
    br = new BufferedReader(fr);
    
    String line;
 
    while((line = br.readLine()) != null ){
    System.out.println(line);
    }
    
}catch(IOException e){
    e.printStackTrace();
}finally{
    try{
        
        if(br != null)
        br.close();
        
    
        if(fr != null)
        fr.close();
        
    }catch(IOException ex){
    ex.printStackTrace();
    }
}


     
    }
}    
