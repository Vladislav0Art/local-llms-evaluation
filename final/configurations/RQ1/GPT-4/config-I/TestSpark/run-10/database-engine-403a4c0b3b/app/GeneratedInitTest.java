package app;

import app.DBApp;
import exceptions.DBAppException;
import datamanipulation.CsvWriter;
import datamanipulation.CsvReader;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.util.Hashtable;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
        Assert.assertNotNull(dbApp.getMyTables());
    }

}