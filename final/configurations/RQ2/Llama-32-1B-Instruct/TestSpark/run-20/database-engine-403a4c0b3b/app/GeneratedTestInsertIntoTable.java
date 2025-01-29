package app;

import app.DBApp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestInsertIntoTable {

    @Test
    public void testInsertIntoTable() throws Exception {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = new HashSet<>();
        dbApp.init();
        HashMap<String, Object> htblColNameValue = new HashMap<>();
        htblColNameValue.put("my_column", "my_value");
        dbApp.insertIntoTable("my_table", null);
        assertTrue(tables.contains("my_table"));
    }

}