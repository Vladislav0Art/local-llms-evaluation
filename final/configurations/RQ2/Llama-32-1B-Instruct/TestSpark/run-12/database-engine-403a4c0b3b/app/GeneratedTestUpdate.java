package app;

public class GeneratedTestUpdate {

    private static final String DB_NAME = "test_database";

    @Test
    public void testUpdate() {
        Database db = new Database();
        ArrayList<String> columns = Arrays.asList("column1", "column2");
        ArrayList<String> rows = Arrays.asList("row3", row);
        try {
            String[] values = {"value3", "value4"};
            db.updateFromTable(columns, rows);
            System.out.println(rows[0]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}