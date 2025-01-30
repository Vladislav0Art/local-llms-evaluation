package app;

import app.DBApp;
import exceptions.DBAppException;
import datamanipulation.CsvWriter;
import datamanipulation.CsvReader;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.util.Hashtable;

public class GeneratedTestGetReader {

    @Test
    public void testGetReader() {
        DBApp dbApp = new DBApp();
        Assert.assertNotNull(dbApp.getReader());
    }

}