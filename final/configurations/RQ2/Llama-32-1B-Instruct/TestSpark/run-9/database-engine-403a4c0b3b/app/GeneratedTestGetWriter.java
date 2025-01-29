package app;

public class GeneratedTestGetWriter {

    @Test
    public void testGetWriter() {
        DBApp dbApp = new DBApp();
        CSVWriter writer = dbApp.getWriter();
        try (CSVWriter csvWriter = new CSVWriter(writer)) {
            String[] row = {"column1", "column2"};
            csvWriter.writeNext(row);
            assertEquals(0, csvWriter.close().getWritten());
        } catch (IOException e) {
            fail("IO exception expected");
        }
    }

}