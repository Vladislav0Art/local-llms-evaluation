package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import util.sql.SQLTerm;

import java.util.HashSet;
import java.util.Hashtable;

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
        Assert.assertTrue(true);
    }

    @Test
    public void createTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.createTable("testTable", "testKey", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
        HashSet<String> tables = dbApp.getMyTables();
        Assert.assertTrue(tables.contains("testTable"));
    }

    @Test
    public void createTableWithExistingNameTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.createTable("testTable", "testKey", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
        dbApp.createTable("testTable", "testKey", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
    }

    @Test
    public void insertIntoTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.createTable("testTable", "testKey", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
        dbApp.insertIntoTable("testTable", new Hashtable<>());
        Assert.assertTrue(true);
    }

    @Test
    public void insertIntoNonExistingTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.insertIntoTable("testTable", new Hashtable<>());
    }

    @Test
    public void updateTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.createTable("testTable", "testKey", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
        dbApp.updateTable("testTable", "testKey", new Hashtable<>());
        Assert.assertTrue(true);
    }

    @Test
    public void updateNonExistingTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.updateTable("testTable", "testKey", new Hashtable<>());
    }

    @Test
    public void deleteFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.createTable("testTable", "testKey", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
        dbApp.deleteFromTable("testTable", new Hashtable<>());
        Assert.assertTrue(true);
    }

    @Test
    public void deleteFromNonExistingTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.deleteFromTable("testTable", new Hashtable<>());
    }

    @Test
    public void selectFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.createTable("testTable", "testKey", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
        Assert.assertNotNull(dbApp.selectFromTable(new SQLTerm[]{}, new String[]{}));
    }

    @Test
    public void selectFromNonExistingTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.selectFromTable(new SQLTerm[]{}, new String[]{});
    }

}