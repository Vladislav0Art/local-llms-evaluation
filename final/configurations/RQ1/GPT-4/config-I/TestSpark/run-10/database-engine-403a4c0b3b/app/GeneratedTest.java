package app;

import app.DBApp;
import exceptions.DBAppException;
import datamanipulation.CsvWriter;
import datamanipulation.CsvReader;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.util.Hashtable;

public class GeneratedTest {

    @Test
    public void testGetMyTables() {
        DBApp dbApp = new DBApp();
        Assert.assertNotNull(dbApp.getMyTables());
    }

    @Test
    public void testGetReader() {
        DBApp dbApp = new DBApp();
        Assert.assertNotNull(dbApp.getReader());
    }

    @Test
    public void testGetWriter() {
        DBApp dbApp = new DBApp();
        Assert.assertNotNull(dbApp.getWriter());
    }

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
        Assert.assertNotNull(dbApp.getMyTables());
    }

    @Test
    public void createTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("id", "Integer");
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        htblColNameMin.put("id", "1");
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameMax.put("id", "1000");
        dbApp.createTable("myTable", "id", htblColNameType, htblColNameMin, htblColNameMax);
    }

    @Test
    public void insertIntoTableTest() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("id", 1);
        DBApp dbApp = new DBApp();
        dbApp.insertIntoTable("myTable", htblColNameValue);
    }

    @Test
    public void updateTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("id", 1);
        dbApp.updateTable("myTable", "1", htblColNameValue);
    }

    @Test
    public void testDeleteTable() throws Exception {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("id", 1);
        DBApp dbApp = new DBApp();
        dbApp.deleteFromTable("myTable", htblColNameValue);
    }

}