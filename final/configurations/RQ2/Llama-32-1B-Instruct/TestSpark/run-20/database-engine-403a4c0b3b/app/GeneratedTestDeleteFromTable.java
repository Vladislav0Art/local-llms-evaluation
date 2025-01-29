package app;

import app.DBApp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestDeleteFromTable {

    @Test
    public void testDeleteFromTable() throws Exception {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = new HashSet<>();
        dbApp.init();
        HashMap<String, Object> htblColNameValue = new HashMap<>();
        HashMap<String, String> htblClusteringKeyValue = new HashMap<>();
        htblClusteringKeyValue.put("key1", "value1");
        dbApp.insertIntoTable("my_table", null);
        dbApp.deleteFromTable("my_table", null);
    }

}