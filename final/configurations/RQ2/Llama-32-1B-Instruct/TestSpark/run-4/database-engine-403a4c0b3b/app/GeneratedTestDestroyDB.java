package app;

import org.junit.Test;

public class GeneratedTestDestroyDB {

    public static void printTables(String[] tables) {
        for (String table : tables) {
            System.out.println(table);
        }
    }

    @Test
    public void testDestroyDB() {
        DBApp db = new DBApp();
        db.destroyAll();
    }

}