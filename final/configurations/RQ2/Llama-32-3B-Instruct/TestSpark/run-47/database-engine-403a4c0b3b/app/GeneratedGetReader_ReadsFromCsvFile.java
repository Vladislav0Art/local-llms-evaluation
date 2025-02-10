package app;

public class GeneratedGetReader_ReadsFromCsvFile {

    @Test
    public void getReader_ReadsFromCsvFile() throws IOException, CsvValidationException, ParseException {
        DBApp dbApp = new DBApp();
        CsvReader reader = dbApp.getReader();
        // Mock CSV file to be read by reader
        String csvFileContent = "name,age\nJohn,30";
        reader.read(csvFileContent);
    }

}