package app;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedGetWriterTest {

    @Test
    public void getWriterTest() {
        // create a new instance of DBApp class
        DBApp app = new DBApp();
        CsvWriter result = app.getWriter();

        // test if the result type is of CsvWriter class
        Assert.assertTrue(result instanceof CsvWriter);
    }

}