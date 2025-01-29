package app;

import org.junit.Test;

public class GeneratedTestGetMyTableCounts {

    public static void printTables(String[] tables) {
        for (String table : tables) {
            System.out.println(table);
        }
    }

    @Test
    public void testGetMyTableCounts() {
        DBApp db = new DBApp();
        int tableCount = 0;
        for (String table : db.getMyTables()) {
            if (!table.equals("table1")) {
                tableCount++;
            }
        }
        assertEquals(2, tableCount);
    }

}