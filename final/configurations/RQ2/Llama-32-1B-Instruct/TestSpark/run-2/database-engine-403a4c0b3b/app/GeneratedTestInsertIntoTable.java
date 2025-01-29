package app;

import app.DBApp;
import org.junit.jupiter.api.Test;

public class GeneratedTestInsertIntoTable {

    @Test
    public void testInsertIntoTable() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.insertIntoTable("testTable", null);

        verify(DBApp.getValidator()).getDatabaseName();
        verify(DBApp gettingStorage()).insertIntoTable("testTable", null);
    }

}