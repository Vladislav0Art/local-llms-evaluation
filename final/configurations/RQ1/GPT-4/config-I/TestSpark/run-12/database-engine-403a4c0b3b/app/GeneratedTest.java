package app;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.text.ParseException;
import java.util.Hashtable;
import java.util.HashSet;

import app.DBApp;
import exceptions.DBAppException;
import datamanipulation.CsvReader;
import datamanipulation.CsvWriter;

public class GeneratedTest {

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        Assert.assertEquals(new HashSet<>(), dbApp.getMyTables());
    }

    @Test
    public void getReaderTest() {
        DBApp dbApp = new DBApp();
        Assert.assertNotNull(dbApp.getReader());
    }

    @Test
    public void getWriterTest() {
        DBApp dbApp = new DBApp();
        Assert.assertNotNull(dbApp.getWriter());
    }

    @Test
    public void initTest() {
        DBApp dbApp = Mockito.spy(DBApp.class);
        CsvReader reader = Mockito.mock(CsvReader.class);
        HashSet<String> tables = new HashSet<>();
        tables.add("table1");
        tables.add("table2");

        Mockito.when(reader.readAllTables()).thenReturn(tables);
        Mockito.doReturn(reader).when(dbApp).getReader();

        dbApp.init();
        Assert.assertEquals(tables, dbApp.getMyTables());
    }

    @Test
    public void createTableTest() throws DBAppException, ParseException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        dbApp.createTable("tableName", "clusteringKey", htblColNameType, htblColNameMin, htblColNameMax);
        Assert.assertTrue(dbApp.getMyTables().contains("tableName"));
    }

    @Test
    public void insertIntoTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.insertIntoTable("tableName", htblColNameValue);
    }

    @Test
    public void updateTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.updateTable("tableName", "clusteringKey", htblColNameValue);
    }

    @Test
    public void deleteFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.deleteFromTable("tableName", htblColNameValue);
    }

}