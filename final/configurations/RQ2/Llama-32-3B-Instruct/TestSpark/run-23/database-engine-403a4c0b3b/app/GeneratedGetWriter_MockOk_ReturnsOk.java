package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetWriter_MockOk_ReturnsOk {

    @Test
    public void getWriter_MockOk_ReturnsOk() {
        CsvWriter writerMock = Mockito.mock(CsvWriter.class);
        dbApp.getWriter(writerMock);
    }

}