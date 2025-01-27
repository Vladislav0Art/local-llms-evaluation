package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetReader_MockOk_ThrowsDBAppException {

    @Test
    public void getReader_MockOk_ThrowsDBAppException() {
        CsvReader readerMock = Mockito.mock(CsvReader.class);
        Mockito.when(readerMock.read()).thenThrow(new IOException("Mock error"));
        DBApp dbApp = new DBApp();
        try {
            dbApp.getReader();
            fail("Expected DBAppException");
        } catch (DBAppException e) {
            assertEquals("Error reading CSV file", e.getMessage());
        }
    }

}