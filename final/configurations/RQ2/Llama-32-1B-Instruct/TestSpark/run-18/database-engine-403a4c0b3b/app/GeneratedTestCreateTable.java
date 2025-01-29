package app;

import app.DBApp;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestCreateTable {

    private DBApp dbApp = new DBApp();

    @BeforeEach
    public void setup() {
        dbApp.init();
    }

    @Test
    public void testCreateTable() {
        dbApp.createTable("Table1", "Column1", new Hashtable<String, String>() {{
            put("Type", "String");
            put("Min", "A");
            put("Max", "Z");
        }}, new Hashtable<String, String>() {{
            put("Min", "A");
            put("Max", "Z");
        }}, new Hashtable<String, String>() {{
            put("Min", "Z");
            put("Max", "Z");
        }});
    }

}