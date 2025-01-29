package app;

public class GeneratedTestGetMyTables {

    @Test
    public void testGetMyTables() {
        DBApp db = new DBApp();
        HashSet<String> myTables = db.getMyTables();
        assertEquals("SELECT * FROM my_tables", myTables);
    }

}