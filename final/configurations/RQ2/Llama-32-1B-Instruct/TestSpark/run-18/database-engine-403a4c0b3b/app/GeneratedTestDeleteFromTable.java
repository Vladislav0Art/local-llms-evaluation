package app;

import app.DBApp;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestDeleteFromTable {

    private DBApp dbApp = new DBApp();

    @BeforeEach
    public void setup() {
        dbApp.init();
    }

    @Test
    public void testDeleteFromTable() throws DBAppException {
        dbApp.deleteFromTable("Table1", new Hashtable<String, Object>() {{
            put("Column1", "Value1");
        }});

        HashSet<String> tables = dbApp.getMyTables();
        assertTrue(tables.contains("Table1"));
    }

}