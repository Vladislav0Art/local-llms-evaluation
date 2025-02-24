package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import app.DBApp;

import java.util.HashSet;
import java.util.Hashtable;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private DBApp dbApp;

    @Test
    public void getMyTablesTest() {
        dbApp = new DBApp();
        HashSet<String> tables = dbApp.getMyTables();
        assertNotNull(tables);
    }

    @Test
    public void getReaderTest() {
        dbApp = new DBApp();
        CsvReader reader = dbApp.getReader();
        assertNotNull(reader);
    }

    @Test
    public void getWriterTest() {
        dbApp = new DBApp();
        CsvWriter writer = dbApp.getWriter();
        assertNotNull(writer);
    }

    @Test
    public void initTest() {
        dbApp = new DBApp();
        dbApp.init();
    }

}