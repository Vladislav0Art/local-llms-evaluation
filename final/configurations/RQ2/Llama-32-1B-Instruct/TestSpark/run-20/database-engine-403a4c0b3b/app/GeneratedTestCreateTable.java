package app;

import app.DBApp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestCreateTable {

    @Test
    public void testCreateTable() throws Exception {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = new HashSet<>();
        dbApp.init();
        HashMap<String, Object> htblColNameValue = new HashMap<>();
        htblColNameValue.put("my_column", "my_value");
        dbApp.createTable("my_table", null, null, null, null);
        assertTrue(tables.contains("my_table"));
    }

}