package app;

import org.junit.Test;
import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = dbApp.getMyTables();
        assertNotNull(tables);
    }

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
    }

    @Test
    public void createTableTest() throws DBAppException {
        Hashtable<String, String> colNameType = new Hashtable<>();
        Hashtable<String, String> colNameMin = new Hashtable<>();
        Hashtable<String, String> colNameMax = new Hashtable<>();
        DBApp dbApp = new DBApp();
        dbApp.createTable("testTable", "name", colNameType, colNameMin, colNameMax);
    }

    @Test
    public void insertIntoTableTest() throws DBAppException {
        Hashtable<String, Object> colNameValue = new Hashtable<>();
        DBApp dbApp = new DBApp();
        dbApp.insertIntoTable("testTable", colNameValue);
    }

    @Test
    public void updateTableTest() throws DBAppException {
        Hashtable<String, Object> colNameValue = new Hashtable<>();
        DBApp dbApp = new DBApp();
        dbApp.updateTable("testTable", "1", colNameValue);
    }

    @Test
    public void deleteFromTableTest() throws DBAppException {
        Hashtable<String, Object> colNameValue = new Hashtable<>();
        DBApp dbApp = new DBApp();
        dbApp.deleteFromTable("testTable", colNameValue);
    }

    @Test
    public void selectFromTableTest() throws DBAppException {
        SQLTerm[] terms = new SQLTerm[0];
        String[] operators = new String[0];
        DBApp dbApp = new DBApp();
        Iterator iterator = dbApp.selectFromTable(terms, operators);
    }

}