package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;

import java.util.Hashtable;

import static org.junit.Assert.*;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
        assertNotNull(dbApp.getMyTables());
    }

}