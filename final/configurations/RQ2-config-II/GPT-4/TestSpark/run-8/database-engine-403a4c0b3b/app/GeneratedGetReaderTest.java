package app;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedGetReaderTest {

    @Test
    public void getReaderTest() {
        // create a new instance of DBApp class
        DBApp app = new DBApp();
        CsvReader result = app.getReader();

        // test if the result type is of CsvReader class
        Assert.assertTrue(result instanceof CsvReader);
    }

}