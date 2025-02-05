package app;

import org.junit.Test;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;

import static org.junit.Assert.*;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
        assertNotNull(dbApp.getMyTables());
    }

}