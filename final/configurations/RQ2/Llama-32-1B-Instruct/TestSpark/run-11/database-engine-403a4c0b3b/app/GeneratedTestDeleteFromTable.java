package app;

import org.junit.jupiter.api.Test;

public class GeneratedTestDeleteFromTable {

    private static final String TABLE_NAME = "Test";
    private static final Object[] FIELD_NAMES = {"Name", "Age"};

    @Test
    public void testDeleteFromTable() {
        DatabaseManager database = new DatabaseManager();
        Hashtable<String, String> table = database.deleteFromTable(TABLE_NAME, FIELD_NAMES);
        assertEquals(0, table.size());
    }

}