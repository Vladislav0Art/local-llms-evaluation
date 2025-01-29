package app;

import org.junit.jupiter.api.Test;

public class GeneratedTestUpdateTable {

    private static final String TABLE_NAME = "Test";
    private static final Object[] FIELD_NAMES = {"Name", "Age"};

    @Test
    public void testUpdateTable() {
        DatabaseManager database = new DatabaseManager();
        Hashtable<String, String> table = database.updateTable(TABLE_NAME, "Key1", FIELD_NAMES);
        assertNotNull(table);
    }

}