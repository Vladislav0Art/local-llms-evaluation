package app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedGetWriterTest {

    @Test
    public void getWriterTest() {
        DBApp dbApp = new DBApp();
        CsvWriter expected = new CsvWriter();
        CsvWriter actual = dbApp.getWriter();
        assertEquals(expected, actual);
    }

}