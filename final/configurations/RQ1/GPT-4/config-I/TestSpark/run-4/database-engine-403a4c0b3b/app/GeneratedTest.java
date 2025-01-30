package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.text.ParseException;
import java.util.Hashtable;
import java.util.Iterator;

public class GeneratedTest {

    @Test
    public void initTest() {
        DBApp app = new DBApp();
        app.getReader().readAllTables();
    }

    @Test
    public void createTableValidTest() {
        DBApp app = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("columnName", "String");
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        htblColNameMin.put("columnName", "0");
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameMax.put("columnName", "100");

        try {
            app.createTable("myTable", "clusteringKey", htblColNameType, htblColNameMin, htblColNameMax);
        } catch (DBAppException e) {
            Assert.fail("Test failed due to DBAppException");
        }
    }

    @Test
    public void insertIntoTableTest() {
        DBApp app = new DBApp();
        Hashtable<String, Object> hashtable = new Hashtable<>();
        hashtable.put("col1", "val1");

        try {
            app.insertIntoTable("tableName", hashtable);
        } catch (DBAppException e) {
            Assert.fail("Test failed due to DBAppException");
        }
    }

    @Test
    public void updateTableTest() {
        DBApp app = new DBApp();
        Hashtable<String, Object> hashtable = new Hashtable<>();
        hashtable.put("col1", "val1");
        try {
            app.updateTable("tableName", "clusteringKeyValue", hashtable);
        } catch (DBAppException e) {
            Assert.fail("Test failed due to DBAppException");
        }
    }

    @Test
    public void deleteFromTableTest() {
        DBApp app = Mockito.spy(new DBApp());
        Hashtable<String, Object> hashtable = new Hashtable<>();
        hashtable.put("col1", "val1");
        try {
            app.deleteFromTable("tableName", hashtable);
        } catch (DBAppException e) {
            Assert.fail("Test failed due to DBAppException");
        }
    }

}