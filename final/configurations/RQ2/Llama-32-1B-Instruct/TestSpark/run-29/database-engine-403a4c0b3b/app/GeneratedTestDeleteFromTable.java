package app;

import app.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestDeleteFromTable {

    @Test
    public void testDeleteFromTable() {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> result = Mockito.mock(Hashtable.class);
        when(dbApp.getClass().getDeclaredFields()).thenReturn(Arrays.asList(
                "deleteFromTable", "init"
        ));
        assertEquals(result, dbApp.deleteFromTable("myTable", null));
    }

}