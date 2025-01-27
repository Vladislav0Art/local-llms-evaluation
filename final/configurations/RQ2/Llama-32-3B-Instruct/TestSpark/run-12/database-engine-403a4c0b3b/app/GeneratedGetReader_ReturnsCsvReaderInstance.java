package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetReader_ReturnsCsvReaderInstance {

    @Test
    public void getReader_ReturnsCsvReaderInstance() throws IOException, CsvValidationException {
        DBApp dbApp = new DBApp();
        CsvReader reader = Mockito.mock(CsvReader.class);
        dbApp.setReader(reader);
        assertEquals(reader, dbApp.getReader());
    }

}