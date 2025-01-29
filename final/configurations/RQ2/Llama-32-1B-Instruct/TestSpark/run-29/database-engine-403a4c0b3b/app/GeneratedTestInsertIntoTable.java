package app;

import app.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestInsertIntoTable {

    @Test
    public void testInsertIntoTable() {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> result = Mockito.mock(Hashtable.class);
        when(dbApp.getClass().getDeclaredFields()).thenReturn(Arrays.asList(
                "insertIntoTable", "init"
        ));
        assertEquals(result, dbApp.insertIntoTable("myTable", null));
    }

}