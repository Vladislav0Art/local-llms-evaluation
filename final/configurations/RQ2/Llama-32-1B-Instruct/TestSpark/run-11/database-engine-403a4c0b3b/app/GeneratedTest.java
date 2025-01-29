package app;

import org.junit.jupiter.api.Test;

public class GeneratedTest {

    private static final String TABLE_NAME = "Test";
    private static final Object[] FIELD_NAMES = {"Name", "Age"};

    @Test
    public void testInsertIntoTable() {
        DatabaseManager database = new DatabaseManager();
        Hashtable<String, String> table = database.insertIntoTable(TABLE_NAME, FIELD_NAMES);
        assertEquals(1, table.size());
    }

    @Test
    public void testUpdateTable() {
        DatabaseManager database = new DatabaseManager();
        Hashtable<String, String> table = database.updateTable(TABLE_NAME, "Key1", FIELD_NAMES);
        assertNotNull(table);
    }

    @Test
    public void testDeleteFromTable() {
        DatabaseManager database = new DatabaseManager();
        Hashtable<String, String> table = database.deleteFromTable(TABLE_NAME, FIELD_NAMES);
        assertEquals(0, table.size());
    }

}