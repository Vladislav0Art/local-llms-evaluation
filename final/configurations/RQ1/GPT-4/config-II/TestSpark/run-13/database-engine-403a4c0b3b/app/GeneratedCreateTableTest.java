package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() throws IOException, ParseException, DBAppException {
        DBApp app = Mockito.spy(new DBApp());
        CsvWriter writer = Mockito.mock(CsvWriter.class);
        Mockito.when(app.getWriter()).thenReturn(writer);
        app.createTable("Employee", "id", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
        Mockito.verify(writer, Mockito.times(1)).write(Mockito.any());
    }

}