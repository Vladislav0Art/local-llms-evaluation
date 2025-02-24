package app;

import static org.junit.Assert.assertNotNull;

import java.util.HashSet;
import java.util.Hashtable;

import org.junit.Test;
import app.DBApp;
import app.IDatabase;

public class GeneratedTestGetWriter {

    @Test
    public void testGetWriter() {
        DBApp dbApp = new DBApp();
        CsvWriter actualWriter = dbApp.getWriter();
        assertNotNull(actualWriter);
    }

}