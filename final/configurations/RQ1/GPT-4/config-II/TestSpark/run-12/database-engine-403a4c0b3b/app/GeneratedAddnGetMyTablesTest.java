package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

import static org.mockito.Mockito.*;

public class GeneratedAddnGetMyTablesTest {

    @Test
    public void addnGetMyTablesTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = new HashSet<>();
        tables.add("table1");
        tables.add("table2");
        dbApp.getMyTables().addAll(tables);
        assertTrue(dbApp.getMyTables().containsAll(tables));
    }

}