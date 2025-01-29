package app;

import app.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestGetReader {

    @Test
    public void testGetReader() {
        DBApp dbApp = new DBApp();
        CSVReader reader = Mockito.mock(CsvReader.class);
        when(dbApp.getClass().getDeclaredFields()).thenReturn(Arrays.asList(
                "getReader", "init", "createTable", "insertIntoTable",
                "updateTable", "deleteFromTable"
        ));
        assertEquals(reader, dbApp.getReader());
    }

}