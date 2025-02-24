package app;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedGetReaderTest {

    @Test
    public void getReaderTest() {
        DBApp dbApp = new DBApp();
        CsvReader actual = dbApp.getReader();
        CsvReader expected = new CsvReader();
        assertEquals(expected, actual);
    }

}