package app;

public class GeneratedGetMyTables {

    @Test
    public void getMyTables() {
        String[] tableNames = {"Table1", "Table2"};
        HashSet<String> expected = new HashSet<>(Arrays.asList("Table1", "Table2"));
        when(this.getDBApp().getMyTables()).thenReturn(expected);
        assertGetMyTables();
    }

}