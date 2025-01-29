package app;

public class GeneratedTestGetMyTables {

    @Test
    public void testGetMyTables() {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = dbApp.getMyTables();
        assertEquals(0, tables.size());
    }

}