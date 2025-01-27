package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetWriter_MocksCsvWriter_ReturnsMockedCsvWriter {

    @Test
    public void getWriter_MocksCsvWriter_ReturnsMockedCsvWriter() {
        CsvWriter writerMock = Mockito.mock(CsvWriter.class);
        DBApp app = new DBApp();
        CsvWriter result = app.getWriter();
        assertEquals(writerMock, result);
    }

}