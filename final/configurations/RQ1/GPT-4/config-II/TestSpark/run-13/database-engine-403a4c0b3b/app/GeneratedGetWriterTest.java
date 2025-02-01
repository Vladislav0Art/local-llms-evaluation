package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;

public class GeneratedGetWriterTest {

    @Test
    public void getWriterTest() {
        DBApp app = new DBApp();
        CsvWriter writer = app.getWriter();
        assertNotNull(writer);
    }

}