package app;

public class GeneratedTestInsert {

    private static final String DB_NAME = "test_database";

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

}