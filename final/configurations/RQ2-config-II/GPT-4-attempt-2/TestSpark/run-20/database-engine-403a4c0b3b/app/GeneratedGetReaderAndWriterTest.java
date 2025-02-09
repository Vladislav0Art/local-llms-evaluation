package app;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Hashtable;

public class GeneratedGetReaderAndWriterTest {

    @Test
    public void getReaderAndWriterTest() {
        DBApp dbApp = new DBApp();
        CsvReader reader = dbApp.getReader();
        CsvWriter writer = dbApp.getWriter();

        Assert.assertNotNull(reader);
        Assert.assertNotNull(writer);
    }

}