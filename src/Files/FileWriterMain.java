package Files;

import java.io.*;
import java.util.Scanner;

public class FileWriterMain {
    public static void main(String[] args){
        FileWriterMain myObj = new FileWriterMain();
        myObj.writeData("My file");
        myObj.readFromFile();
        myObj.appendData("hhahs");
    }
    public void appendData(String data){
       try {
           File myFile = new File("test.txt");

           FileWriter fileWriter = new FileWriter(myFile);
           BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
           PrintWriter printWriter = new PrintWriter(bufferedWriter);
           printWriter.print(data);
           printWriter.println("More Money More Problems");
           printWriter.println("No Money No Problems");
           printWriter.close();
           bufferedWriter.close();
           fileWriter.close();
       }catch (IOException ioException){
           System.out.println("aa");
       }
    }

    public void writeData(String data){
        try {
            File myFile = new File("test.txt");
            FileWriter writeToFile = new FileWriter(myFile);
            writeToFile.write(data);
            writeToFile.append("More Text");
            writeToFile.flush();
            writeToFile.close();
        }catch (IOException ioException){
            System.out.println("Cannot write to this file");
        }


    }
    public void  readFromFile(){
        File myFile = new File("test.txt");
        try {
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNext()){
                String dataInFile = myReader.nextLine();
                System.out.println(dataInFile);
            }
        } catch (FileNotFoundException e) {
            System.out.println("file does not exist");;
        }

    }
}
