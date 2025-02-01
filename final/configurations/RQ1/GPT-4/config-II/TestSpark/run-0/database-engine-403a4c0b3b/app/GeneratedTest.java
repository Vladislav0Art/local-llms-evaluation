package app;

import org.junit.Test;
import org.junit.Assert;

import java.util.Hashtable;
import java.io.IOException;
import java.text.ParseException;

import org.mockito.Mockito;
import app.DBApp;
import exceptions.DBAppException;

public class GeneratedTest {

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        Assert.assertNotNull(dbApp);
        dbApp.init();
        Assert.assertTrue(dbApp.getMyTables().isEmpty());
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
    public void createTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameType.put("name", "string");
        htblColNameMin.put("name", "A");
        htblColNameMax.put("name", "Z");

        dbApp.createTable("TestTable", "name", htblColNameType, htblColNameMin, htblColNameMax);
        Assert.assertTrue(dbApp.getMyTables().contains("TestTable"));
    }

    @Test
    public void createTableInvalidTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.createTable(null, null, null, null, null);
    }

    @Test
    public void insertIntoTableValidTest() throws DBAppException {
        DBApp dbApp = Mockito.spy(DBApp.class);
        Mockito.doNothing().when(dbApp).takeAction(Mockito.any(), Mockito.anyString(), Mockito.any(Hashtable.class));
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("name", "John");
        dbApp.insertIntoTable("TestTable", htblColNameValue);
    }

    @Test
    public void insertIntoTableInvalidTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("name", "John");
        dbApp.insertIntoTable("TestTable", htblColNameValue);
    }

    @Test
    public void updateTableValidTest() throws DBAppException {
        DBApp dbApp = Mockito.spy(DBApp.class);
        Mockito.doNothing().when(dbApp).takeAction(Mockito.any(), Mockito.anyString(), Mockito.any(Hashtable.class));
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("name", "John");
        dbApp.updateTable("TestTable", "1", htblColNameValue);
    }

    @Test
    public void updateTableInvalidTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("name", "John");
        dbApp.updateTable("TestTable", "1", htblColNameValue);
    }

    @Test
    public void deleteFromTableValidTest() throws DBAppException {
        DBApp dbApp = Mockito.spy(DBApp.class);
        Mockito.doNothing().when(dbApp).takeAction(Mockito.any(), Mockito.anyString(), Mockito.any(Hashtable.class));
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("name", "John");
        dbApp.deleteFromTable("TestTable", htblColNameValue);
    }

    @Test
    public void deleteFromTableInvalidTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("name", "John");
        dbApp.deleteFromTable("TestTable", htblColNameValue);
    }

}