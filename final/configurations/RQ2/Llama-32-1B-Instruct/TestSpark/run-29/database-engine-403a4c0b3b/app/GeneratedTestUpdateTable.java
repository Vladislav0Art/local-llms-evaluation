package app;

import app.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestUpdateTable {

    @Test
    public void testUpdateTable() {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> result = Mockito.mock(Hashtable.class);
        when(dbApp.getClass().getDeclaredFields()).thenReturn(Arrays.asList(
                "updateTable", "init"
        ));
        assertEquals(result, dbApp.updateTable("myTable", null, null));
    }

}