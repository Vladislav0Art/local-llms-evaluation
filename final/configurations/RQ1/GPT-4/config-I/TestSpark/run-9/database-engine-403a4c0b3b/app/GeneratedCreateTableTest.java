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

public class GeneratedCreateTableTest {

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

}