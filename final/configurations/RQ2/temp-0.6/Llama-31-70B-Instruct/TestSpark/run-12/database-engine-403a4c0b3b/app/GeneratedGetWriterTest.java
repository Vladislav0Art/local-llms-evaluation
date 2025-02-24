package app;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedGetWriterTest {

    @Test
    public void getWriterTest() {
        DBApp dbApp = new DBApp();
        CsvWriter actual = dbApp.getWriter();
        CsvWriter expected = new CsvWriter();
        assertEquals(expected, actual);
    }

}