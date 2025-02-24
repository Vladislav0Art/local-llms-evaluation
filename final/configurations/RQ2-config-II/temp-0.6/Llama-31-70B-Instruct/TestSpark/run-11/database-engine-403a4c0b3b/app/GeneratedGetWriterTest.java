package app;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedGetWriterTest {

    private DBApp dbApp;

    @Test
    public void getWriterTest() {
        dbApp = new DBApp();
        CsvWriter testWriter = Mockito.mock(CsvWriter.class);

        Assert.assertEquals(testWriter, dbApp.getWriter());
    }

}