package app;

import org.junit.Test;

import java.util.Hashtable;
import java.util.HashSet;
import java.util.Iterator;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

public class GeneratedGetWriterTest {

    @Test
    public void getWriterTest() {
        DBApp dbApp = new DBApp();
        CsvWriter writer = dbApp.getWriter();
        assertNotNull(writer);
    }

}