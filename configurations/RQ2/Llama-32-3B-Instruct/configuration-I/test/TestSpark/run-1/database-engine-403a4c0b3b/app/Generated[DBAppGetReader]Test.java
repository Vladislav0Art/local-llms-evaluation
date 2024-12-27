package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;

public class Generated[DBAppGetReader]

Test {

    @Test
    public void [DBAppGetReader]Test() {
        CsvReader reader = mock(CsvReader.class);
        when(DBApp.class).getReader().thenReturn(reader);
        DBApp dbApp = new DBApp();
        assertEquals(reader, dbApp.getReader());
    }

}