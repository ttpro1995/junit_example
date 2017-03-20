/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple_program;

import com.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Thien
 */
@RunWith(Parameterized.class)
public class FibonacciTest {
    
    @Parameters
    public static Collection<Object[]> data() throws FileNotFoundException, IOException {
        CSVReader reader = new CSVReader(new FileReader("data_fibonacci.csv"));
        List myEntries = reader.readAll();
        return myEntries;
    }

    private int fInput;

    private int fExpected;

    public FibonacciTest(String input, String expected) {
        fInput= Integer.parseInt(input);
        fExpected= Integer.parseInt(expected);
    }

    @Test
    public void test() {
        assertEquals(fExpected, Fibonacci.compute(fInput));
    }
}
