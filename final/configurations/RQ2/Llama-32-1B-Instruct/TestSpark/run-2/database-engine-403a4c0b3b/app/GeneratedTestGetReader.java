package app;

import app.DBApp;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetReader {

    @Test
    public void testGetReader() {
        DBApp csvReader = new DBApp();
        DBApp csvWriter = new DBApp();

        CSVReader csvReader = new CSVReader("test.csv", "test.column");
        csvReader.openCSV(new File("test.csv"));

        when(csvReader.getTableName()).thenReturn("testTable");

        assertNotThrows(CsvValidationException);
        assertSame("testTable", csvReader.getTableName());

        csvReader.close();

        csvWriter = new DBApp();
        csvWriter.setStorage(gettingStorage());
        csvWriter.openCSV(new File("/path/to/file.csv"));
        csvWriter.setValidator(gettingValidator());

        when(csvWriter.getTableName()).thenReturn("testTable");

        assertNotThrows(CsvValidationException);
        assertSame("testTable", csvWriter.getTableName());

        csvWriter.close();
    }

}