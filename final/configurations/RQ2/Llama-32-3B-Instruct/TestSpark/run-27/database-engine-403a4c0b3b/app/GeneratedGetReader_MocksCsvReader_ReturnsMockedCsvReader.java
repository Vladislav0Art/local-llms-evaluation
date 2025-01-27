package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetReader_MocksCsvReader_ReturnsMockedCsvReader {

    @Test
    public void getReader_MocksCsvReader_ReturnsMockedCsvReader() {
        CsvReader readerMock = Mockito.mock(CsvReader.class);
        DBApp app = new DBApp();
        CsvReader result = app.getReader();
        assertEquals(readerMock, result);
    }

}