package app;

import app.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestGetWriter {

    @Test
    public void testGetWriter() {
        DBApp dbApp = new DBApp();
        CSVWriter writer = Mockito.mock(CsvWriter.class);
        when(dbApp.getClass().getDeclaredFields()).thenReturn(Arrays.asList(
                "getWriter", "init", "createTable", "insertIntoTable",
                "updateTable", "deleteFromTable"
        ));
        assertEquals(writer, dbApp.getWriter());
    }

}