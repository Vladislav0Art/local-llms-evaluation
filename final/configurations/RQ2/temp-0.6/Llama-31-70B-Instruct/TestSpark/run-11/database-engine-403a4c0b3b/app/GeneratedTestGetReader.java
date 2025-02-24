package app;

import static org.junit.Assert.assertNotNull;

import java.util.HashSet;
import java.util.Hashtable;

import org.junit.Test;
import app.DBApp;
import app.IDatabase;

public class GeneratedTestGetReader {

    @Test
    public void testGetReader() {
        DBApp dbApp = new DBApp();
        CsvReader actualReader = dbApp.getReader();
        assertNotNull(actualReader);
    }

}