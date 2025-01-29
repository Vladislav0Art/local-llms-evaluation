package app;

public class GeneratedTestGetWriter {

    private DBApp dbApp;
    private Validator validator;

    @Before
    public void setup() {
        dbApp = new DBApp();
        validator = new Validator();
    }

    @Test
    public void testGetWriter() throws IOException {
        CSVWriter writer = new CSVWriter();
        String[] rows = {"Row1", "Row2", "Row3"};
        writer.init(writer);
        List<Map<String, Object>> data = new ArrayList<>();
        for (String row : rows) {
            Map<String, Object> map = new HashMap<>();
            map.put("Name", row);
            data.add(map);
        }
        CSVWriter csvWriter = new CSVWriter();
        dbApp.getWriter().add(csvWriter);
        assertNotNull(dbApp.getWriter());
    }

}