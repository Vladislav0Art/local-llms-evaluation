package app;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedGetReaderTest {

    @Test
    public void getReaderTest() {
        DBApp dbApp = new DBApp();
        CsvReader result = dbApp.getReader();
        assertNotNull(result);
    }

}