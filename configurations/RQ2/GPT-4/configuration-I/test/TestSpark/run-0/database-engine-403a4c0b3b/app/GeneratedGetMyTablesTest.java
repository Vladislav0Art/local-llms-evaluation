package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Hashtable;
import java.util.HashSet;
import java.util.Iterator;

import sql.SQLTerm;

public class GeneratedGetMyTablesTest {

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        assertNotNull(dbApp.getMyTables());
        assertTrue(dbApp.getMyTables().getClass() == HashSet.class);
    }

}