package app;

import org.junit.jupiter.api.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestInsertIntoTable {

    private DBApp dbApp;

    @Before
    public void setup() {
        dbApp = new DBApp();
    }

    @Test
    public void testInsertIntoTable() throws DBAppException {
        String strTableName = "testTable";
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.insertIntoTable(strTableName, htblColNameValue);
        assertEquals(dbApp.getMyTables(), dbApp.getReader().readAllTables());
    }

}