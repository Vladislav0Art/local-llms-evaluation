package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        DBApp app = Mockito.spy(new DBApp());
        CsvReader reader = Mockito.mock(CsvReader.class);
        Mockito.when(app.getReader()).thenReturn(reader);
        Mockito.when(reader.readAllTables()).thenReturn(new HashSet<>());
        app.init();
        Mockito.verify(reader, Mockito.times(1)).readAllTables();
    }

}