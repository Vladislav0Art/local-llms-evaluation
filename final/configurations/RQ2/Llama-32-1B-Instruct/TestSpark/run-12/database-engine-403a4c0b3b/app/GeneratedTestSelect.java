package app;

public class GeneratedTestSelect {

    private static final String DB_NAME = "test_database";

    @Test
    public void testSelect() {
        Database db = new Database();
        ArrayList<String> columns = Arrays.asList("column1", "column2");
        String query = "SELECT * FROM table";
        ArrayList<String> result = db.selectFromTable(columns, query);
        System.out.println(result);
    }

}