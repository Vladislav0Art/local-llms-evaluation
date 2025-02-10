package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetMyTables_NoTables_ReturnsEmptySet {

    @Test
    public void getMyTables_NoTables_ReturnsEmptySet() throws DBAppException {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = dbApp.getMyTables();
        assertNotNull(tables);
        assertTrue(tables.isEmpty());
    }

}