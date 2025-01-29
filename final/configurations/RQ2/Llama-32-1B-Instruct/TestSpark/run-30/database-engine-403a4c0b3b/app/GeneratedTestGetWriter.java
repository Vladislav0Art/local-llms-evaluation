package app;

public class GeneratedTestGetWriter {

    private Database db;
    private Serializer serializer;

    @Test
    public void testGetWriter() {
        db = new Database();
        db.init();

        HashSet<String> result1 = new HashSet<>();
        List<Hashtable<String, String>> tableCols = new ArrayList<>();

        db.insertIntoTable("Table1", new Hashtable<>(Arrays.asList("Column1", "Column2")));

        result1.add(db.getMyTables());
    }

}