package app;

public class GeneratedTestDelete {

    private static final String DB_NAME = "test_database";

    @Test
    public void testDelete() {
        Database db = new Database();
        ArrayList<String> columns = Arrays.asList("column1");
        ArrayList<String> rows = Arrays.asList("row5", row);
        try {
            String[] values = {"value6"};
            db.deleteFromTable(columns, rows);
            System.out.println(rows[0]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}