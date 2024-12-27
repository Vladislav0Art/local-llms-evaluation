package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;

public class Generated[DBAppGetWriter]

Test {

    @Test
    public void [DBAppGetWriter]Test() {
        CsvWriter writer = mock(CsvWriter.class);
        when(DBApp.class).getWriter().thenReturn(writer);
        DBApp dbApp = new DBApp();
        assertEquals(writer, dbApp.getWriter());
    }

}