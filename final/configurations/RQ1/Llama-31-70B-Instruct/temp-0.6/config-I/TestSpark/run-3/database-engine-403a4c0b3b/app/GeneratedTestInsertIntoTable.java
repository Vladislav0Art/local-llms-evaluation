package app;

import org.junit.jupiter.api.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestInsertIntoTable {

    private DBApp dbApp;
    private CsvReader reader;
    private CsvWriter writer;

    @Before
    public void setUp() {
        dbApp = new DBApp();
        reader = Mockito.mock(CsvReader.class);
        writer = Mockito.mock(CsvWriter.class);
    }

    @Test
    public void testInsertIntoTable() throws DBAppException {
        String strTableName = "test";
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        dbApp.insertIntoTable(strTableName, htblColNameValue);
        assertTrue(dbApp.getMyTables().contains(strTableName));
    }

}