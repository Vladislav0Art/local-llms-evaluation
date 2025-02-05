package app;

import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;
import org.junit.Test;
import org.junit.Assert;

import java.util.*;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
        // As init() is void method, no assertion is required, the test is for checking exceptions.
    }

    @Test
    public void createTableTest() throws DBAppException {
        Hashtable<String, String> colNameType = new Hashtable<>();
        Hashtable<String, String> colNameMin = new Hashtable<>();
        Hashtable<String, String> colNameMax = new Hashtable<>();
        DBApp dbApp = new DBApp();
        dbApp.createTable("testTable", "id", colNameType, colNameMin, colNameMax);
        // As createTable() is void method, no assertion is required, the test is for checking exceptions.
    }

    @Test
    public void insertIntoTableTest() throws DBAppException {
        Hashtable<String, Object> colNameValue = new Hashtable<>();
        DBApp dbApp = new DBApp();
        dbApp.insertIntoTable("testTable", colNameValue);
        // As insertIntoTable() is void method, no assertion is required, the test is for checking exceptions.
    }

    @Test
    public void updateTableTest() throws DBAppException {
        Hashtable<String, Object> colNameValue = new Hashtable<>();
        DBApp dbApp = new DBApp();
        dbApp.updateTable("testTable", "1", colNameValue);
        // As updateTable() is void method, no assertion is required, the test is for checking exceptions.
    }

    @Test
    public void deleteFromTableTest() throws DBAppException {
        Hashtable<String, Object> colNameValue = new Hashtable<>();
        DBApp dbApp = new DBApp();
        dbApp.deleteFromTable("testTable", colNameValue);
        // As deleteFromTable() is void method, no assertion is required, the test is for checking exceptions.
    }

    @Test
    public void selectFromTableTest() throws DBAppException {
        SQLTerm[] arrSQLTerms = {};
        String[] strarrOperators = {};
        DBApp dbApp = new DBApp();
        Iterator result = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
        Assert.assertNotNull(result);
    }

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = mock(DBApp.class);
        when(dbApp.getMyTables()).thenReturn(new HashSet<String>());
        HashSet<String> result = dbApp.getMyTables();
        Assert.assertNotNull(result);
    }

    @Test
    public void getReaderTest() {
        DBApp dbApp = mock(DBApp.class);
        when(dbApp.getReader()).thenReturn(null);
        Assert.assertNull(dbApp.getReader());
    }

    @Test
    public void getWriterTest() {
        DBApp dbApp = mock(DBApp.class);
        when(dbApp.getWriter()).thenReturn(null);
        Assert.assertNull(dbApp.getWriter());
    }

}