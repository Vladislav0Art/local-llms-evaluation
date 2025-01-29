package app;

public class GeneratedTest {

    private static final String DB_NAME = "test_database";

    @Test
    public void testSelect() {
        Database db = new Database();
        ArrayList<String> columns = Arrays.asList("column1", "column2");
        String query = "SELECT * FROM table";
        ArrayList<String> result = db.selectFromTable(columns, query);
        System.out.println(result);
    }

    @Test
    public void testInsert() {
        Database db = new Database();
        ArrayList<String> values = Arrays.asList("value1", "value2");
        String row = "row1, row2";
        try {
            db.insertIntoTable(values);
            db.deleteFromTable(Arrays.asList("column1"), Arrays.asList(row));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

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