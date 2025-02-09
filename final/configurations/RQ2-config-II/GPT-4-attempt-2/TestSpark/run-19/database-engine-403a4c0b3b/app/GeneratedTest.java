package app;

import org.junit.Test;
import org.junit.Assert;

import java.util.*;

import exceptions.DBAppException;
import sql.SQLTerm;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
    }

    @Test
    public void createTableBasicTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> colNameType = new Hashtable<>();
        Hashtable<String, String> colNameMin = new Hashtable<>();
        Hashtable<String, String> colNameMax = new Hashtable<>();

        dbApp.createTable("TestTable", "TestKey", colNameType, colNameMin, colNameMax);
    }

    @Test
    public void createTableExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> colNameType = new Hashtable<>();
        Hashtable<String, String> colNameMin = new Hashtable<>();
        Hashtable<String, String> colNameMax = new Hashtable<>();

        dbApp.createTable(null, "TestKey", colNameType, colNameMin, colNameMax);
    }

    @Test
    public void insertIntoTableBasicTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> colNameValue = new Hashtable<>();

        dbApp.insertIntoTable("TestTable", colNameValue);
    }

    @Test
    public void insertIntoTableExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> colNameValue = new Hashtable<>();

        dbApp.insertIntoTable(null, colNameValue);
    }

    @Test
    public void updateTableBasicTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> colNameValue = new Hashtable<>();

        dbApp.updateTable("TestTable", "TestKey", colNameValue);
    }

    @Test
    public void updateTableExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> colNameValue = new Hashtable<>();

        dbApp.updateTable(null, "TestKey", colNameValue);
    }

    @Test
    public void deleteFromTableBasicTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> colNameValue = new Hashtable<>();

        dbApp.deleteFromTable("TestTable", colNameValue);
    }

    @Test
    public void deleteFromTableExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> colNameValue = new Hashtable<>();

        dbApp.deleteFromTable(null, colNameValue);
    }

    @Test
    public void selectFromTableBasicTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = {};
        String[] strarrOperators = {};

        dbApp.selectFromTable(arrSQLTerms, strarrOperators);
    }

    @Test
    public void selectFromTableExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = null;
        String[] strarrOperators = null;

        dbApp.selectFromTable(arrSQLTerms, strarrOperators);
    }

}