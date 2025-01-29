package app;

public class GeneratedTestGetMyTables {

    @Test
    public void testGetMyTables() {
        DBApp dbApp = new DBApp();
        HashSet<String> result = dbApp.getMyTables();
        assertEquals(3, result.size());
    }

}