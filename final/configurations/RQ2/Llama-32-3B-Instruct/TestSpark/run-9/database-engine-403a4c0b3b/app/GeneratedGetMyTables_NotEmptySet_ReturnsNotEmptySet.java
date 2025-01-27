package app;

public class GeneratedGetMyTables_NotEmptySet_ReturnsNotEmptySet {

    @Test
    public void getMyTables_NotEmptySet_ReturnsNotEmptySet() throws DBAppException {
        HashSet<String> expected = new HashSet<>();
        expected.add("table1");
        DBApp dbApp = new DBApp();
        HashSet<String> result = dbApp.getMyTables();
        assertTrue(result.containsAll(expected));
    }

}