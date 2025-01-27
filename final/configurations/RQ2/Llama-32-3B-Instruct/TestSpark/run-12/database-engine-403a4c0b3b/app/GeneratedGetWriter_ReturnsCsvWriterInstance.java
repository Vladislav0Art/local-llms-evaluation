package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetWriter_ReturnsCsvWriterInstance {

    @Test
    public void getWriter_ReturnsCsvWriterInstance() throws IOException, CsvValidationException {
        DBApp dbApp = new DBApp();
        CsvWriter writer = Mockito.mock(CsvWriter.class);
        dbApp.setWriter(writer);
        assertEquals(writer, dbApp.getWriter());
    }

}