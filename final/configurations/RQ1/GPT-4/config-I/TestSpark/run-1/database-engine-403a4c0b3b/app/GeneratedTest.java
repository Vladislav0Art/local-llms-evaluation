package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import sql.SQLTerm;
import util.search.*;

import java.util.Hashtable;
import java.util.Iterator;

public class GeneratedTest {

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        Assert.assertNotNull(dbApp.getMyTables());
    }

    @Test
    public void getReaderTest() {
        DBApp dbApp = new DBApp();
        Assert.assertNotNull(dbApp.getReader());
    }

    @Test
    public void getWriterTest() {
        DBApp dbApp = new DBApp();
        Assert.assertNotNull(dbApp.getWriter());
    }

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
        // Expect not to throw any exception
    }

    @Test
    public void insertIntoTableTest() {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("id", 1);
        try {
            dbApp.insertIntoTable("MyTable", htblColNameValue);
        } catch (DBAppException e) {
            Assert.fail("Should not have thrown any exception");
        }
    }

    @Test
    public void deleteFromTableTest() {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("id", 1);
        try {
            dbApp.deleteFromTable("MyTable", htblColNameValue);
        } catch (DBAppException e) {
            Assert.fail("Should not have thrown any exception");
        }
    }

    @Test
    public void updateTableTest() {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("id", 1);
        try {
            dbApp.updateTable("MyTable", "1", htblColNameValue);
        } catch (DBAppException e) {
            Assert.fail("Should not have thrown any exception");
        }
    }

    @Test
    public void selectFromTableTest() {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[0];
        String[] strarrOperators = new String[0];
        try {
            Iterator result = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
            Assert.assertNotNull(result);
        } catch (DBAppException e) {
            Assert.fail("Should not have thrown any exception");
        }
    }

}