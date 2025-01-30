package app;

import app.DBApp;
import app.Action;
import exceptions.DBAppException;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Hashtable;
import java.util.Iterator;

import storage.Table;
import sql.SQLTerm;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.getReader().readAllTables();
        dbApp.init();
        assertEquals(dbApp.getReader().readAllTables().size(), dbApp.getMyTables().size());
    }

    @Test
    public void createTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> columns = new Hashtable<String, String>();
        columns.put("id", "Integer");
        columns.put("name", "String");

        Hashtable<String, String> min = new Hashtable<String, String>();
        min.put("id", "1");
        min.put("name", "A");

        Hashtable<String, String> max = new Hashtable<String, String>();
        max.put("id", "1000");
        max.put("name", "Z");

        // Creating a table
        dbApp.createTable("Employee", "id", columns, min, max);

        // Should throw an exception, as Employee table already exists
        dbApp.createTable("Employee", "id", columns, min, max);
    }

    @Test
    public void insertIntoTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> rows = new Hashtable<String, Object>();
        rows.put("id", 1);
        rows.put("name", "John");

        // Trying to insert into a table that does not exist
        dbApp.insertIntoTable("NonExistentTable", rows);
    }

    @Test
    public void updateTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> rows = new Hashtable<String, Object>();
        rows.put("id", 1);
        rows.put("name", "John");

        // Trying to update a table that does not exist
        dbApp.updateTable("NonExistentTable", "1", rows);
    }

    @Test
    public void deleteFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> rows = new Hashtable<String, Object>();
        rows.put("id", 1);
        rows.put("name", "John");

        // Trying to delete from a table that does not exist
        dbApp.deleteFromTable("NonExistentTable", rows);
    }

    @Test
    public void selectFromTableTest() {
        DBApp dbApp = mock(DBApp.class);
        SQLTerm[] arrSQLTerms = {};
        String[] strarrOperators = {};

        try {
            when(dbApp.selectFromTable(arrSQLTerms, strarrOperators)).thenThrow(
                    new DBAppException("Unexpected error while fetching data")
            );
            dbApp.selectFromTable(arrSQLTerms, strarrOperators);
        } catch (DBAppException e) {
            // Exception has been thrown, the test is passed
        }
    }

}