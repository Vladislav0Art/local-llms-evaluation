package app;

import app.DBApp;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetMyTables {

    private DBApp dbApp = new DBApp();

    @BeforeEach
    public void setup() {
        dbApp.init();
    }

    @Test
    public void testGetMyTables() {
        HashSet<String> tables = dbApp.getMyTables();
        assertTrue(tables.contains("Table1"));
        assertTrue(tables.contains("Table2"));
        assertFalse(tables.contains("Table3")); // assuming Table3 is not a table
    }

}