package app;

import app.*;
import exceptions.DBAppException;
import org.junit.Test;

import java.util.HashSet;
import java.util.Hashtable;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void getMyTablesTest() {
        HashSet<String> tables = new HashSet<>();
        DBApp app = new DBApp();
        app.getMyTables().add("table1");
        assertEquals(tables, app.getMyTables());
    }

    @Test
    public void initTest() {
        DBApp app = new DBApp();
        app.init();
        assertEquals(new HashSet<>(), app.getMyTables());
    }

    @Test
    public void createTableTest() throws DBAppException {
        DBApp app = new DBApp();
        Hashtable<String, String> tableColumns = new Hashtable<>();
        app.createTable("table1", "key1", tableColumns, null, null);
        assertEquals(1, app.getMyTables().size());
    }

    @Test
    public void createTableThrowsExceptionTest() throws DBAppException {
        DBApp app = new DBApp();
        Hashtable<String, String> tableColumns = new Hashtable<>();
        app.createTable("table1", "key1", tableColumns, null, null);
        app.createTable("table1", "key1", tableColumns, null, null);
    }

    @Test
    public void insertIntoTableTest() throws DBAppException {
        DBApp app = new DBApp();
        Hashtable<String, Object> columnValues = new Hashtable<>();
        app.insertIntoTable("table1", columnValues);
    }

    @Test
    public void updateTableTest() throws DBAppException {
        DBApp app = new DBApp();
        Hashtable<String, Object> columnValues = new Hashtable<>();
        app.updateTable("table1", "key1", columnValues);
    }

    @Test
    public void deleteFromTableTest() throws DBAppException {
        DBApp app = new DBApp();
        Hashtable<String, Object> columnValues = new Hashtable<>();
        app.deleteFromTable("table1", columnValues);
    }

}