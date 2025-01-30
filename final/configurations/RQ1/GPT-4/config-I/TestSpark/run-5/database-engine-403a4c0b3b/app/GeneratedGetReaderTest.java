package app;

import org.junit.Test;

import java.io.IOException;
import java.util.Hashtable;
import java.util.HashSet;

import static org.junit.Assert.*;

public class GeneratedGetReaderTest {

    @Test
    public void getReaderTest() {
        DBApp dbApp = new DBApp();
        CsvReader reader = dbApp.getReader();
        assertNotNull(reader);
    }

}