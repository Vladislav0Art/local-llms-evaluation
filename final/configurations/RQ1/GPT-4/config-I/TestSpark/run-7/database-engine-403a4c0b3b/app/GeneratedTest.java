package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.*;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> expectedTables = new HashSet<>(Arrays.asList("table1", "table2"));
        dbApp.getMyTables().addAll(expectedTables);
        HashSet<String> actualTables = dbApp.getMyTables();
        Assert.assertEquals(expectedTables, actualTables);
    }

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> expectedTables = new HashSet<>(Arrays.asList("table1", "table2"));
        when(dbApp.getReader().readAllTables()).thenReturn(expectedTables);
        dbApp.init();
        HashSet<String> actualTables = dbApp.getMyTables();
        Assert.assertEquals(expectedTables, actualTables);
    }

    @Test
    public void createTableTest_withDBAppException() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        dbApp.createTable("testTable", "id", htblColNameType, htblColNameMin, htblColNameMax);
    }

    @Test
    public void insertIntoTableTest_withDBAppException() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.insertIntoTable("testTable", htblColNameValue);
    }

    @Test
    public void updateTableTest_withDBAppException() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.updateTable("testTable", "100", htblColNameValue);
    }

    @Test
    public void deleteFromTableTest_withDBAppException() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.deleteFromTable("testTable", htblColNameValue);
    }

    @Test
    public void selectFromTableTest_withDBAppException() throws DBAppException {
        DBApp dbApp = new DBApp();
        String[] strarrOperators = {"=", ">", "<"};
        dbApp.selectFromTable(null, strarrOperators);
    }

}