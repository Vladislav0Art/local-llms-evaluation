package app;

import app.DBApp;
import org.junit.jupiter.api.Test;

public class GeneratedTestDeleteFromTable {

    @Test
    public void testDeleteFromTable() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.deleteFromTable("testTable", null);

        verify(DBApp.getValidator()).getDatabaseName();
        verify(DBApp gettingStorage()).deleteFromTable("testTable", null);
    }

}