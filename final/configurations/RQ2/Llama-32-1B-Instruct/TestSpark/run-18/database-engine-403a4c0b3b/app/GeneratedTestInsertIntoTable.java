package app;

import app.DBApp;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestInsertIntoTable {

    private DBApp dbApp = new DBApp();

    @BeforeEach
    public void setup() {
        dbApp.init();
    }

    @Test
    public void testInsertIntoTable() throws DBAppException {
        dbApp.insertIntoTable("Table1", new Hashtable<String, Object>() {{
            put("Column1", "Value1");
            put("Column2", "Value2");
        }});

        assert !(dbApp.getMyTables().contains("Table1"));
    }

}