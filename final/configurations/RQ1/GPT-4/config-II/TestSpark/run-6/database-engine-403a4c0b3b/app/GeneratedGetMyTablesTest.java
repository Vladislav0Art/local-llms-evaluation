package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;

import java.util.Hashtable;

import static org.junit.Assert.*;

public class GeneratedGetMyTablesTest {

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        assertNotNull(dbApp.getMyTables());
    }

}