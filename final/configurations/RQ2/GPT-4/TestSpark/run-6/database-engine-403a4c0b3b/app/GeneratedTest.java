package app;

import org.junit.Test;
import org.junit.Assert;

import java.util.Hashtable;

public class GeneratedTest {

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        Assert.assertNotNull(dbApp.getMyTables());
    }

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
    }

    @Test
    public void createTableTest() {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        try {
            dbApp.createTable("TestTable", "Key", htblColNameType, htblColNameMin, htblColNameMax);
        } catch (Exception e) {
            Assert.fail("createTableTest failed with exception: " + e);
        }
    }

    @Test
    public void insertIntoTableTest() {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        try {
            dbApp.insertIntoTable("TestTable", htblColNameValue);
        } catch (Exception e) {
            Assert.fail("insertIntoTableTest failed with exception: " + e);
        }
    }

    @Test
    public void updateTableTest() {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        try {
            dbApp.updateTable("TestTable", "Key", htblColNameValue);
        } catch (Exception e) {
            Assert.fail("updateTableTest failed with exception: " + e);
        }
    }

    @Test
    public void deleteFromTableTest() {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        try {
            dbApp.deleteFromTable("TestTable", htblColNameValue);
        } catch (Exception e) {
            Assert.fail("deleteFromTableTest failed with exception: " + e);
        }
    }

}