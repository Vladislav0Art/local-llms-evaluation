package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doThrow;

public class GeneratedTest {

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = dbApp.getMyTables();
        assertEquals(new HashSet<String>(), tables);
    }

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
        assertEquals(new HashSet<String>(), dbApp.getMyTables());
    }

    @Test
    public void createTableTest() throws DBAppException {
        DBApp dbAppSpy = Mockito.spy(DBApp.class);
        doThrow(DBAppException.class).when(dbAppSpy).createTable("table1", "col1", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
        dbAppSpy.createTable("table1", "col1", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
    }

    @Test
    public void insertIntoTableTest() throws DBAppException {
        DBApp dbAppSpy = Mockito.spy(DBApp.class);
        doThrow(DBAppException.class).when(dbAppSpy).insertIntoTable("table1", new Hashtable<>());
        dbAppSpy.insertIntoTable("table1", new Hashtable<>());
    }

    @Test
    public void updateTableTest() throws DBAppException {
        DBApp dbAppSpy = Mockito.spy(DBApp.class);
        Hashtable<String, Object> nonExistingTable = new Hashtable<String, Object>();
        nonExistingTable.put("table", "nonExistingTable");
        doThrow(DBAppException.class).when(dbAppSpy).updateTable("table1", "value", nonExistingTable);
        dbAppSpy.updateTable("table1", "value", nonExistingTable);
    }

    @Test
    public void deleteFromTableTest() throws DBAppException {
        DBApp dbAppSpy = Mockito.spy(DBApp.class);
        Hashtable<String, Object> nonExistingTable = new Hashtable<String, Object>();
        nonExistingTable.put("table", "nonExistingTable");
        doThrow(DBAppException.class).when(dbAppSpy).deleteFromTable("table1", nonExistingTable);
        dbAppSpy.deleteFromTable("table1", nonExistingTable);
    }

}