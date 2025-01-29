package app;

import app.Database;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestCreateTable {

    private Database db;
    private Serializer serializer;

    @Test
    public void testCreateTable() {
        // Create a test database and init method should return true if table is created or false otherwise
        db.init();

        String[] columns = {"Column1", "Column2"};
        HashSet<String> result1 = new ArrayList<>();
        List<Hashtable<String, String>> tableCols = new ArrayList<>();

        // Insert some data into the table
        db.insertIntoTable("Table1", new Hashtable<>(Arrays.asList(columns)));

        // Test create table method with valid columns and values
        testInsertIntoTable("Table1");

        result1.add(db.getMyTables());
        assertTrue(result1.contains("Table1"));

        result1 = new ArrayList<>();
        List<Hashtable<String, String>> tableCols2 = new ArrayList<>();

        // Insert some data into the table using CSV reader
        db.getReader().setCSV(serializer);
        testSelectFromTable(new SQLTerm[]{new SQLTerm("Column1"), "='test'"}, new String[]{"=="});

        result1.add(db.getMyTables());
        assertTrue(result1.contains("Table1"));

        // Test create table method with invalid columns and values
        db.init();
        assertFalse(db.createTable("InvalidTable", null, null));
    }

}