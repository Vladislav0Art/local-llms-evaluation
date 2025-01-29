package app;

import app.DBApp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestSelectFromTable {

    @Test
    public void testSelectFromTable() {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = new HashSet<>();
        HashMap<String, Object> htblColNameValue = new HashMap<>();
        HashMap<String, String> htblClusteringKeyValue = new HashMap<>();
        dbApp.init();
        CSVReader reader = dbApp.getReader();
        // Add more rows to the CSV file
    }

}