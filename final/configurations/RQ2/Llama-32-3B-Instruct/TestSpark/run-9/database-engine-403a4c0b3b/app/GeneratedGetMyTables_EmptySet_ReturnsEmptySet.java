package app;

public class GeneratedGetMyTables_EmptySet_ReturnsEmptySet {

    @Test
    public void getMyTables_EmptySet_ReturnsEmptySet() throws DBAppException {
        HashSet<String> expected = new HashSet<>();
        DBApp dbApp = new DBApp();
        HashSet<String> result = dbApp.getMyTables();
        assertEquals(expected, result);
    }

}