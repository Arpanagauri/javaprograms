package File_thingys;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;


public class shapes{
    static void addingQ() { 
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the name for the file ");
    	String Name = sc.next();
    	//Creating file
    	try {
        File myObj = new File("C:\\Users\\New\\eclipse-workspace\\Practise\\src\\File_thingys\\"+Name+".txt");
        if (myObj.createNewFile()) {
          System.out.println("File created: " + myObj.getName());
        } else {
          System.out.println("File already exists.");
        }
      } catch (IOException e) {
        System.out.println("Error While Creating Files");
        e.printStackTrace();
      }
    	//Writing to files
    	System.out.println("Enter the Question ");
        Scanner scan = new Scanner(System.in);
        String text;
        text=scan.nextLine();

        try {
            FileWriter myWriter = new FileWriter("C:\\\\Users\\\\New\\\\eclipse-workspace\\\\Practise\\\\src\\\\File_thingys\\\\"+Name+".txt");
            myWriter.write(text);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("Error writing to the files");
            e.printStackTrace();
          } 

      }

    
    public static void counting() {
    	int count=1;
        try {
            File myObj = new File("C:\\Users\\New\\eclipse-workspace\\Practise\\src\\File_thingys\\counter.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              count = Integer.valueOf(data);
              System.out.println(count);
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred while counting");
            e.printStackTrace();
          }
        try {
        FileWriter myWriter = new FileWriter("C:\\Users\\New\\eclipse-workspace\\Practise\\src\\File_thingys\\counter.txt");
        myWriter.write(count++);
    } catch (IOException e) {
        System.out.println("Error writing to the files");
        e.printStackTrace();}
      
    	
    }
    

  public static void main(String[] args) {

addingQ();
counting();
  
  
 }






}