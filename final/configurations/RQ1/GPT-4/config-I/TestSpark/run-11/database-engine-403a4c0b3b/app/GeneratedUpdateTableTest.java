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

public class GeneratedUpdateTableTest {

    @Test
    public void updateTableTest() throws DBAppException {
        DBApp app = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        app.updateTable("TestTable", "1", htblColNameValue);
    }

}