package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.HashSet;

public class GeneratedTest {

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
    }

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = dbApp.getMyTables();
        Assert.assertTrue(tables instanceof HashSet);
    }

    @Test
    public void createTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        dbApp.createTable("TestTable", "KeyColumn", htblColNameType, htblColNameMin, htblColNameMax);
    }

    @Test
    public void createTableFailureTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.createTable("TestTable", null, null, null, null);
    }

    @Test
    public void insertIntoTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", "value1");
        dbApp.insertIntoTable("TestTable", htblColNameValue);
    }

    @Test
    public void insertIntoTableFailureTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.insertIntoTable("TestTable", null);
    }

    @Test
    public void updateTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", "value1");
        dbApp.updateTable("TestTable", "TestKey", htblColNameValue);
    }

    @Test
    public void updateTableFailureTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.updateTable("TestTable", "TestKey", null);
    }

    @Test
    public void deleteFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", "value1");
        dbApp.deleteFromTable("TestTable", htblColNameValue);
    }

    @Test
    public void deleteFromTableFailureTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.deleteFromTable("TestTable", null);
    }

    @Test
    public void selectFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[1];
        String[] strarrOperators = new String[1];
        Iterator result = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
        Assert.assertTrue(result instanceof Iterator);
    }

    @Test
    public void selectFromTableFailureTest1() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.selectFromTable(null, null);
    }

    @Test
    public void selectFromTableFailureTest2() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[1];
        dbApp.selectFromTable(arrSQLTerms, null);
    }

    @Test
    public void selectFromTableFailureTest3() throws DBAppException {
        DBApp dbApp = new DBApp();
        String[] strarrOperators = new String[1];
        dbApp.selectFromTable(null, strarrOperators);
    }

}