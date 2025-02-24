package app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedGetReaderTest {

    @Test
    public void getReaderTest() {
        DBApp dbApp = new DBApp();
        CsvReader expected = new CsvReader();
        CsvReader actual = dbApp.getReader();
        assertEquals(expected, actual);
    }

}