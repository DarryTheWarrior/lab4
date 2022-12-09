package org.example;
import java.io.FileReader;
import java.util.ArrayList;
import au.com.bytecode.opencsv.CSVReader;


public class Main {
    public static void main(String[] args)throws Exception {
        ArrayList<Person> list = new ArrayList<Person>();
        CSVReader table = new CSVReader(new FileReader("/Users/olegdizajner/Downloads/foreign_names.csv"), ';' ,'"' , 1);
        if(table==null) {
            throw new RuntimeException("File read error");
        }
        String[] nextLine = table.readNext();
        while ((nextLine) != null) {
            Person newLine = new Person(nextLine);
            list.add(newLine);
            nextLine = table.readNext();
        }

        for (int i = 0;i < list.size();i++) {
            System.out.println(list.get(i).toString());
        }
    }
}