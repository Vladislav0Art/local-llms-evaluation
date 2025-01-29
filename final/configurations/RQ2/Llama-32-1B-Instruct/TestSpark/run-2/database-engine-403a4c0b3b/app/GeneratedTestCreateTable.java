package app;

import app.DBApp;
import org.junit.jupiter.api.Test;

public class GeneratedTestCreateTable {

    @Test
    public void testCreateTable() throws DBAppException {
        HashSet<String> result = new HashSet<>();
        DBApp dbApp = new DBApp();
        dbApp.createTable("testTable", null, null, null, null);

        verify(DBApp.getValidator()).getDatabaseName();
        verify(DBApp gettingSerializer()).createTable("testTable", null, null, null, null);
    }

}