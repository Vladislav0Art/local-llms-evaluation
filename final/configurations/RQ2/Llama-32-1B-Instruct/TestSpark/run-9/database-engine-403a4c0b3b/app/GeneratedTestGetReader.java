package app;

public class GeneratedTestGetReader {

    @Test
    public void testGetReader() {
        DBApp dbApp = new DBApp();
        CSVReader reader = dbApp.getReader();
        try (CSVReader csvReader = new CSVReader(reader)) {
            List<String[]> rows = csvReader.readNext();
            assertEquals(0, rows.size());
        } catch (IOException e) {
            fail("IO exception expected");
        }
    }

}