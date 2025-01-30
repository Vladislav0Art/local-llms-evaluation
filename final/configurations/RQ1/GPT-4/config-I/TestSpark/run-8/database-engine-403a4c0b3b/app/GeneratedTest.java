package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Hashtable;
import java.util.HashSet;

import sql.SQLTerm;

public class GeneratedTest {

    @Test
    public void initTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.init();
        HashSet<String> tables = dbApp.getMyTables();

        Assert.assertNotNull(tables);
    }

    @Test
    public void createTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> colNameType = new Hashtable<>();
        Hashtable<String, String> colNameMin = new Hashtable<>();
        Hashtable<String, String> colNameMax = new Hashtable<>();
        colNameType.put("id", "Integer");
        colNameMin.put("id", "0");
        colNameMax.put("id", "100");

        dbApp.createTable("testTable", "id", colNameType, colNameMin, colNameMax);
    }

    @Test
    public void insertIntoTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> colNameValue = new Hashtable<>();
        colNameValue.put("id", 1);

        dbApp.insertIntoTable("testTable", colNameValue);
    }

    @Test
    public void updateTableTest() throws DBAppException {
        // Initializing
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> colNameValue = new Hashtable<>();
        colNameValue.put("id", 1);

        // Test Update
        dbApp.updateTable("testTable", "1", colNameValue);
    }

    @Test
    public void deleteFromTableTest() throws DBAppException {
        // Initializing
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> colNameValue = new Hashtable<>();
        colNameValue.put("id", 1);

        // Test Delete
        dbApp.deleteFromTable("testTable", colNameValue);
    }

    @Test
    public void selectFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        String[] arrOperators = {">"};
        SQLTerm[] arrTerms = new SQLTerm[1];
        arrTerms[0] = new SQLTerm("students", "id", "=", "1");

        dbApp.selectFromTable(arrTerms, arrOperators);
    }

}