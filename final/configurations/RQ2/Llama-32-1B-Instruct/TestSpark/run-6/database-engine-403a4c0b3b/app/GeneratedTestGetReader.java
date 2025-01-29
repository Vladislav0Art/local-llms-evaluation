package app;

public class GeneratedTestGetReader {

    private DBApp dbApp;

    @BeforeEach
    void init() {
        dbApp = new DBApp();
    }

    @Test
    public void testGetReader() {
        CsvReader csvReader = dbApp.getReader();
        assertTrue(csvReader instanceof DBAppCsvReader);
    }

}