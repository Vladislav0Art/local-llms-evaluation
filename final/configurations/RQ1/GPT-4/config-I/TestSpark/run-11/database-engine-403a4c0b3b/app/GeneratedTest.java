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

public class GeneratedTest {

    @Test
    public void getMyTablesTest() {
        DBApp app = new DBApp();
        HashSet<String> tables = app.getMyTables();

        Assert.assertNotNull(tables);
    }

    @Test
    public void initTest() {
        DBApp app = Mockito.spy(DBApp.class);
        CsvReader reader = Mockito.mock(CsvReader.class);
        Mockito.when(app.getReader()).thenReturn(reader);
        Mockito.when(reader.readAllTables()).thenReturn(new HashSet<>());

        app.init();
        Mockito.verify(reader, Mockito.times(1)).readAllTables();
    }

    @Test
    public void createTableTest() throws DBAppException, IOException {
        DBApp app = Mockito.spy(DBApp.class);
        CsvWriter writer = Mockito.mock(CsvWriter.class);
        Mockito.when(app.getWriter()).thenReturn(writer);

        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();

        app.createTable("Students", "id", htblColNameType, htblColNameMin, htblColNameMax);
        Mockito.verify(writer, Mockito.times(1)).write(Mockito.any());
    }

    @Test
    public void createTableWithExceptionTest() throws DBAppException, IOException {
        DBApp app = Mockito.spy(DBApp.class);
        CsvWriter writer = Mockito.mock(CsvWriter.class);
        Mockito.when(app.getWriter()).thenReturn(writer);

        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();

        app.createTable("Students1", "id", htblColNameType, htblColNameMin, htblColNameMax);
    }

    @Test
    public void insertIntoTableTest() throws DBAppException {
        DBApp app = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        app.insertIntoTable("TestTable", htblColNameValue);
    }

    @Test
    public void updateTableTest() throws DBAppException {
        DBApp app = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        app.updateTable("TestTable", "1", htblColNameValue);
    }

    @Test
    public void deleteFromTableTest() throws DBAppException {
        DBApp app = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        app.deleteFromTable("TestTable", htblColNameValue);
    }

}