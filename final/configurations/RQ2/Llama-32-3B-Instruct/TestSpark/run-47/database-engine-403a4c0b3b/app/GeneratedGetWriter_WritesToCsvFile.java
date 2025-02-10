package app;

public class GeneratedGetWriter_WritesToCsvFile {

    @Test
    public void getWriter_WritesToCsvFile() throws IOException {
        DBApp dbApp = new DBApp();
        CsvWriter writer = dbApp.getWriter();
        // Mock CSV file to be written by writer
        String csvFileContent = "name,age\nJohn,30";
        writer.write(csvFileContent);
    }

}