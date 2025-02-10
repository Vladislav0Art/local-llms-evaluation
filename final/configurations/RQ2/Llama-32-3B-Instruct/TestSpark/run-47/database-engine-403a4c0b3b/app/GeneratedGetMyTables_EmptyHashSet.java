package app;

public class GeneratedGetMyTables_EmptyHashSet {

    @Test
    public void getMyTables_EmptyHashSet() {
        DBApp dbApp = new DBApp();
        HashSet<String> result = dbApp.getMyTables();
        Assert.assertTrue(result.isEmpty());
    }

}