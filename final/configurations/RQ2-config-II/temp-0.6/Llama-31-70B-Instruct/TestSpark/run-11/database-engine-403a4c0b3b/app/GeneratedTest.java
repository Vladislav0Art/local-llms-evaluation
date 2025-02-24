package app;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedTest {

    private DBApp dbApp;

    @Test
    public void getMyTablesTest() {
        dbApp = new DBApp();
        HashSet<String> testSet = new HashSet<>();
        testSet.add("test");

        Assert.assertEquals(testSet, dbApp.getMyTables());
    }

    @Test
    public void getReaderTest() {
        dbApp = new DBApp();
        CsvReader testReader = Mockito.mock(CsvReader.class);

        Assert.assertEquals(testReader, dbApp.getReader());
    }

    @Test
    public void getWriterTest() {
        dbApp = new DBApp();
        CsvWriter testWriter = Mockito.mock(CsvWriter.class);

        Assert.assertEquals(testWriter, dbApp.getWriter());
    }

    @Test
    public void initTest() throws DBAppException {
        dbApp = new DBApp();
        dbApp.init();
    }

}