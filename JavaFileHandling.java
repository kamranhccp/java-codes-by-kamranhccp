//CODE Created by: Kamran Mansoor
//Distributed by Instagram@kamran_hccp
//Instgram Page for Fun/Sharing my Views: Instgram@programming_is_my_life_


import java.io.File; //File Class
import java.io.IOException;  // Import the IOException class to handle errors
import java.lang.String;
import java.io.FileWriter; //Java File Writer Package
import java.io.FileReader; //Java Package for file reading

public class file_handling {
    public static void main(String[] args) throws IOException {
        //JAVA File Handling
        File myTest = new File("names.txt"); //File name
        try {
            if (myTest.createNewFile()) {
                System.out.println("File Created Successfully: " + myTest.getName());
            } else {
                System.out.println("File Already Exist.");
            }
        }
            catch(IOException e){
                System.out.println("Error Occurred.");
                e.printStackTrace();
        }

        //New File
        String file_data = ("Kamran, Khalid, Yasir, Hassan");
        try {
            //Writing in a file
            FileWriter myFile_2 = new FileWriter("names_02.txt");
            myFile_2.write(file_data);
            myFile_2.close();
            System.out.println("Successfully wrote to the file.");
            //Exception Error
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }



        //Reading File - JAVA File Handling

            //File Object using File Package
            File file = new File("names_02.txt");
        if (file.exists()){
            System.out.println();
            System.out.println("File Name: " + file.getName());
            System.out.println("Path of File: " +file.getPath());
            System.out.println("Total Space of File: " + file.getTotalSpace());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Writeable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File size in bytes: " + file.length());
            System.out.println();
        }
        else {
            System.out.println("The File didn't Exist!");
        }


            //Creating writer using FileWriter
        try {
            FileWriter write_file = new FileWriter("names_02.txt");
            write_file.write(file_data);
            write_file.close();
            System.out.println("Data Write successfully!");
        }
        catch (IOException e){
            System.out.println("Error Occurred while Writing File!");
            e.printStackTrace();
        }



            //Creating a reader using FileReader
        try {
            FileReader read_file = new FileReader("names_02.txt");
            //Read the file
            read_file.read();
            System.out.println();
            System.out.println("Data in the File: ");
            System.out.println(read_file);
            System.out.println();

            int i;
            while ((i=read_file.read()) != -1)
                System.out.print((char) i);

            //Closes the reader
            read_file.close();
        }
        catch (IOException e){
            System.out.println("Error Occurred while Reading File!");
            e.printStackTrace();
        }


    }
}
