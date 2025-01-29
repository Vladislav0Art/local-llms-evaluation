package app;

import app.DBApp;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetMyTables {

    @Test
    public void testGetMyTables() {
        HashSet<String> result = new HashSet<>();
        when(DBApp.getValidator().getDatabaseName()).thenReturn("myDatabase");
        when(DBApp gettingStorage().getDatabaseId()).thenReturn("myDatabaseId");

        DBApp dbApp = new DBApp();
        dbApp.setMyTables(new HashSet<>(Arrays.asList("table1", "table2")));

        verify(DBApp.getValidator()).getDatabaseName();
        verify(DBApp.getStorage()).getDatabaseId();

        assertEquals(2, result.size());

        verifyAll();

        when(DBApp gettingSerializer().getFilePath()).thenReturn("/path/to/file.txt");

        dbApp.init();
    }

}