package app;

import app.DBApp;
import exceptions.DBAppException;
import datamanipulation.CsvWriter;
import datamanipulation.CsvReader;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.util.Hashtable;

public class GeneratedTestGetMyTables {

    @Test
    public void testGetMyTables() {
        DBApp dbApp = new DBApp();
        Assert.assertNotNull(dbApp.getMyTables());
    }

}