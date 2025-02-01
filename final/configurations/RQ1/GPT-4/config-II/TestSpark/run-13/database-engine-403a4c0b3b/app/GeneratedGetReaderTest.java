package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;

public class GeneratedGetReaderTest {

    @Test
    public void getReaderTest() {
        DBApp app = new DBApp();
        CsvReader reader = app.getReader();
        assertNotNull(reader);
    }

}