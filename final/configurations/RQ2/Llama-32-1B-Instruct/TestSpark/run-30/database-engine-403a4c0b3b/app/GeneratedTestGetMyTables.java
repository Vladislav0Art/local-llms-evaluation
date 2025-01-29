package app;

public class GeneratedTestGetMyTables {

    private Database db;
    private Serializer serializer;

    @Test
    public void testGetMyTables() {
        db = new Database();
        db.init();

        HashSet<String> result1 = new HashSet<>();
        List<Hashtable<String, String>> tableCols = new ArrayList<>();

        db.insertIntoTable("Table1", new Hashtable<>(Arrays.asList("Column1", "Column2")));

        result1.add(db.getMyTables());
        assertTrue(result1.contains("Table1"));
        assertTrue(result1.contains("Table2"));

        db.deleteFromTable("Table1");
        result1.clear();
        result1.add(db.getMyTables());
        assertFalse(result1.contains("Table1"));
    }

}