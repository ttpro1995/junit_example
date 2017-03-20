/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple_program;

import com.opencsv.CSVReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Thien
 */
public class Simple_program {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here   
        CSVReader reader = new CSVReader(new FileReader("data_fibonacci.csv"));
        List myEntries = reader.readAll();
        System.out.print("main program");
    }
}
