package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetMyTables_OneTable_ReturnsSingleTable {

    @Test
    public void getMyTables_OneTable_ReturnsSingleTable() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.init(); // Initialize the database with one table
        HashSet<String> tables = dbApp.getMyTables();
        assertNotNull(tables);
        assertEquals(1, tables.size());
    }

}