package app;

import app.DBApp;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestUpdateTable {

    private DBApp dbApp = new DBApp();

    @BeforeEach
    public void setup() {
        dbApp.init();
    }

    @Test
    public void testUpdateTable() throws DBAppException {
        dbApp.updateTable("Table1", "Column1", new Hashtable<String, Object>() {{
            put("Value", "New Value");
        }});

        HashSet<String> tables = dbApp.getMyTables();
        assertTrue(tables.contains("Table1"));
    }

}