package app;

import app.*;
import exceptions.DBAppException;
import org.junit.Test;

import java.util.HashSet;
import java.util.Hashtable;

import static org.junit.Assert.assertEquals;

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() throws DBAppException {
        DBApp app = new DBApp();
        Hashtable<String, String> tableColumns = new Hashtable<>();
        app.createTable("table1", "key1", tableColumns, null, null);
        assertEquals(1, app.getMyTables().size());
    }

}