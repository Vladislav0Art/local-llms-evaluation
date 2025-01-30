package app;

import app.*;
import exceptions.DBAppException;
import org.junit.Test;

import java.util.HashSet;
import java.util.Hashtable;

import static org.junit.Assert.assertEquals;

public class GeneratedGetMyTablesTest {

    @Test
    public void getMyTablesTest() {
        HashSet<String> tables = new HashSet<>();
        DBApp app = new DBApp();
        app.getMyTables().add("table1");
        assertEquals(tables, app.getMyTables());
    }

}