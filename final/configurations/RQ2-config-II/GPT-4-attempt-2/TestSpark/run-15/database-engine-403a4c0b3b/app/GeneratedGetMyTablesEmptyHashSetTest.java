package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.Hashtable;
import java.util.HashSet;

import exceptions.DBAppException;
import sql.SQLTerm;

public class GeneratedGetMyTablesEmptyHashSetTest {

    @Test
    public void getMyTablesEmptyHashSetTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = dbApp.getMyTables();
        assertEquals(0, tables.size());
    }

}