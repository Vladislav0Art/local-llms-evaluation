package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import sql.SQLTerm;

import java.util.Hashtable;

import static org.junit.Assert.*;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        DBApp app = new DBApp();
        app.init();
        assertNotNull(app.getMyTables());
    }

}