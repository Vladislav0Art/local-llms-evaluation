package app;

import org.junit.Test;

public class GeneratedTestGetMyTables {

    public static void printTables(String[] tables) {
        for (String table : tables) {
            System.out.println(table);
        }
    }

    @Test
    public void testGetMyTables() {
        DBApp db = new DBApp();
        String[] tables = {"table1", "table2", "table3"};
        printTables(db.getMyTables());
    }

}