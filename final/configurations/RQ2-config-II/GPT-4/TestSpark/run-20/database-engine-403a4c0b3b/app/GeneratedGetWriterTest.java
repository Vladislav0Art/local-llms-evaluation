package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito.*;

import java.util.*;

public class GeneratedGetWriterTest {

    @Test
    public void getWriterTest() {
        DBApp dbApp = new DBApp();
        assertNotNull(dbApp.getWriter());
    }

}