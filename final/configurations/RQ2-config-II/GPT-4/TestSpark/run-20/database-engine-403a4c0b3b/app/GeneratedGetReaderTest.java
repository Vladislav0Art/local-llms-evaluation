package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito.*;

import java.util.*;

public class GeneratedGetReaderTest {

    @Test
    public void getReaderTest() {
        DBApp dbApp = new DBApp();
        assertNotNull(dbApp.getReader());
    }

}