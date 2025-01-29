package app;

public class GeneratedTestGetReader {

    private Database db;
    private Serializer serializer;

    @Test
    public void testGetReader() {
        db = new Database();
        db.init();

        HashSet<String> result1 = new HashSet<>();
        List<Hashtable<String, String>> tableCols = new ArrayList<>();

        db.insertIntoTable("Table1", new Hashtable<>(Arrays.asList("Column1", "Column2")));

        result1.add(db.getMyTables());
        assertTrue(result1.contains("Table1"));
    }

}