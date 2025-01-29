package app;

public class GeneratedTestGetWriter {

    private DBApp dbApp;

    @BeforeEach
    void init() {
        dbApp = new DBApp();
    }

    @Test
    public void testGetWriter() {
        CsvWriter csvWriter = dbApp.getWriter();
        assertTrue(csvWriter instanceof DBAppCsvWriter);
    }

}