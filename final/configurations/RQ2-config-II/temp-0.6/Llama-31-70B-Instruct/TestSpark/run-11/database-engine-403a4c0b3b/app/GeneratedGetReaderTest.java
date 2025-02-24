package app;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedGetReaderTest {

    private DBApp dbApp;

    @Test
    public void getReaderTest() {
        dbApp = new DBApp();
        CsvReader testReader = Mockito.mock(CsvReader.class);

        Assert.assertEquals(testReader, dbApp.getReader());
    }

}