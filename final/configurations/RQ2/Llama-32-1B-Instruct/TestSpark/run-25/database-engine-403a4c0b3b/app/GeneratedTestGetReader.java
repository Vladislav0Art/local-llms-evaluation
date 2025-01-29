package app;

public class GeneratedTestGetReader {

    private DBApp dbApp;
    private Validator validator;

    @Before
    public void setup() {
        dbApp = new DBApp();
        validator = new Validator();
    }

    @Test
    public void testGetReader() throws IOException {
        CSVReader reader = new CSVReader();
        String[] rows = {"Row1", "Row2", "Row3"};
        reader.init(reader);
        List<Map<String, Object>> data = new ArrayList<>();
        for (String row : rows) {
            Map<String, Object> map = new HashMap<>();
            map.put("Name", row);
            data.add(map);
        }
        CSVReader csvReader = new CSVReader();
        dbApp.getReader().add(csvReader);
        assertNotNull(dbApp.getReader());
    }

}