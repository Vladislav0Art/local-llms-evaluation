package app;

import app.DBApp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestUpdateTable {

    @Test
    public void testUpdateTable() throws Exception {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = new HashSet<>();
        dbApp.init();
        HashMap<String, Object> htblColNameValue = new HashMap<>();
        htblColNameValue.put("my_column", "my_value");
        HashMap<String, String> htblClusteringKeyValue = new HashMap<>();
        htblClusteringKeyValue.put("key1", "value1");
        dbApp.updateTable("my_table", null, htblColNameValue);
        assertTrue(tables.contains("my_table"));
    }

}