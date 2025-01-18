package app;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedGetWriterTest {

    @Test
    public void getWriterTest() {
        DBApp dbApp = new DBApp();
        CsvWriter result = dbApp.getWriter();
        assertNotNull(result);
    }

}