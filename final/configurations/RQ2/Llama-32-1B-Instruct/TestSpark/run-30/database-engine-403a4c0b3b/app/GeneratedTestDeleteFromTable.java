package app;

import app.Database;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestDeleteFromTable {

    private Database db;
    private Serializer serializer;

    @Test
    public void testDeleteFromTable() {
        // Create a test database and init method should return true if table is deleted or false otherwise
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

        // Delete from table
        result = db.deleteFromTable("Table1");
        assertFalse(result.contains("Table1"));
    }

}