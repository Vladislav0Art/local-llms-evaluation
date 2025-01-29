package app;

import org.junit.jupiter.api.Test;

public class GeneratedTestInsertIntoTable {

    private static final String TABLE_NAME = "Test";
    private static final Object[] FIELD_NAMES = {"Name", "Age"};

    @Test
    public void testInsertIntoTable() {
        DatabaseManager database = new DatabaseManager();
        Hashtable<String, String> table = database.insertIntoTable(TABLE_NAME, FIELD_NAMES);
        assertEquals(1, table.size());
    }

}