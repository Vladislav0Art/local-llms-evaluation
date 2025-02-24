package app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;

public class GeneratedTest {

    private static final String TABLE_NAME = "testTable";
    private static final String CLUSTERING_KEY_COLUMN_NAME = "testClusteringKeyColumn";
    private static final String CLUSTERING_KEY_VALUE = "123";
    private static final String COLUMN_NAME = "testColumn";
    private static final String COLUMN_TYPE = "String";
    private static final String COLUMN_MIN = "1";
    private static final String COLUMN_MAX = "10";
    private static final String COLUMN_VALUE = "testValue";

    private static final DBApp dbApp = new DBApp();

    @Test
    public void getMyTablesTest() {
        HashSet<String> expectedTables = new HashSet<>();
        expectedTables.add(TABLE_NAME);

        HashSet<String> actualTables = dbApp.getMyTables();

        assertEquals(expectedTables, actualTables);
    }

}