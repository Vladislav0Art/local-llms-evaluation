package app;

import org.junit.Test;

import static org.junit.Assert.*;

import exceptions.DBAppException;

import java.util.Hashtable;

public class GeneratedTest {

    @Test
    public void initTest() {
        try {
            DBApp dbApp = new DBApp();
            dbApp.init();
        } catch (Exception e) {
            fail("Exception should not be thrown");
        }
    }

    @Test
    public void createTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();

        htblColNameType.put("column1", "int");
        htblColNameMin.put("column1", "1");
        htblColNameMax.put("column1", "100");

        dbApp.createTable("table1", "column1", htblColNameType, htblColNameMin, htblColNameMax);
    }

    @Test
    public void insertIntoTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", 1);

        dbApp.insertIntoTable("table1", htblColNameValue);
    }

    @Test
    public void updateTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", 2);

        dbApp.updateTable("table1", "1", htblColNameValue);
    }

    @Test
    public void deleteFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", 1);

        dbApp.deleteFromTable("table1", htblColNameValue);
    }

    @Test
    public void selectFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = {};
        String[] strarrOperators = {};

        dbApp.selectFromTable(arrSQLTerms, strarrOperators);
    }

}