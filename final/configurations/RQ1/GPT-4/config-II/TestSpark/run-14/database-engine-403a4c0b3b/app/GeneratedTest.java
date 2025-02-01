package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Hashtable;
import java.util.HashSet;

public class GeneratedTest {

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
        Assert.assertNotNull(dbApp.getMyTables());
    }

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = dbApp.getMyTables();
        Assert.assertNotNull(tables);
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
        Hashtable<String, String> colNameType = new Hashtable<>();
        Hashtable<String, String> colNameMin = new Hashtable<>();
        Hashtable<String, String> colNameMax = new Hashtable<>();
        colNameType.put("name", "String");
        colNameMin.put("name", "John");
        colNameMax.put("name", "Zack");
        dbApp.createTable("testTable", "name", colNameType, colNameMin, colNameMax);
    }

}