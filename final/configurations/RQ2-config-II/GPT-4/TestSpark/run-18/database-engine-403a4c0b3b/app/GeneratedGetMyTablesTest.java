package app;

import org.junit.Test;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;

import static org.junit.Assert.*;

public class GeneratedGetMyTablesTest {

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> myTables = dbApp.getMyTables();
        assertNotNull(myTables);
    }

}