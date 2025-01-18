package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.HashSet;

public class GeneratedTest {

    @Test
    public void DBAppConstructorTest() {
        DBApp dbApp = new DBApp();
        Assert.assertNotNull(dbApp);
    }

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> myTables = dbApp.getMyTables();
        Assert.assertNotNull(myTables);
    }

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
        Assert.assertNotNull(dbApp);
    }

    @Test
    public void createTableTest() {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        try {
            dbApp.createTable("table", "key", htblColNameType, htblColNameMin, htblColNameMax);
        } catch (DBAppException e) {
            Assert.fail();
        }
    }

    @Test
    public void insertIntoTableTest() {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        try {
            dbApp.insertIntoTable("table", htblColNameValue);
        } catch (DBAppException e) {
            Assert.fail();
        }
    }

    @Test
    public void updateTableTest() {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        try {
            dbApp.updateTable("table", "keyValue", htblColNameValue);
        } catch (DBAppException e) {
            Assert.fail();
        }
    }

    @Test
    public void deleteFromTableTest() {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        try {
            dbApp.deleteFromTable("table", htblColNameValue);
        } catch (DBAppException e) {
            Assert.fail();
        }
    }

    @Test
    public void selectFromTableTest() {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[1];
        arrSQLTerms[0] = new SQLTerm("", "", "", "");
        String[] strarrOperators = new String[1];
        strarrOperators[0] = "AND";
        try {
            dbApp.selectFromTable(arrSQLTerms, strarrOperators);
        } catch (DBAppException e) {
            Assert.fail();
        }
    }

}