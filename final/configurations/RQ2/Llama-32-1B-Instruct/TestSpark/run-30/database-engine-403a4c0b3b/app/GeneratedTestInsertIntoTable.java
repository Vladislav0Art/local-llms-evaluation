package app;

import app.Database;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestInsertIntoTable {

    private Database db;
    private Serializer serializer;

    @Test
    public void testInsertIntoTable() {
        // Create a test database and init method should return true if table is created or false otherwise
        db.init();

        String[] columns = {"Column1", "Column2"};
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        List<Hashtable<String, String>> tableCols = new ArrayList<>();

        // Insert some data into the table using CSV reader
        db.getReader().setCSV(serializer);
        testSelectFromTable(new SQLTerm[]{new SQLTerm("Column1"), "='test'"}, new String[]{"=="});

        testInsertIntoTable("Table1", htblColNameValue);

        result = db.getMyTables();
        assertTrue(result.contains("Table1"));
    }

}