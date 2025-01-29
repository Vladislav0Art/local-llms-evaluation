package app;

public class GeneratedTestGetReader {

    @Test
    public void testGetReader() {
        DBApp db = new DBApp();
        CSVReader reader = db(getter());
        assertTrue(reader instanceof CsvReader);
    }

}