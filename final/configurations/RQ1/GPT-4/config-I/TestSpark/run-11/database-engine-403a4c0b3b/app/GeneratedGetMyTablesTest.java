package app;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Hashtable;
import java.util.HashSet;
import java.util.Iterator;

import app.DBApp;
import exceptions.DBAppException;
import datamanipulation.CsvReader;
import datamanipulation.CsvWriter;

public class GeneratedGetMyTablesTest {

    @Test
    public void getMyTablesTest() {
        DBApp app = new DBApp();
        HashSet<String> tables = app.getMyTables();

        Assert.assertNotNull(tables);
    }

}