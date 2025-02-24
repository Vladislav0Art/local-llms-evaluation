package app;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

import org.junit.jupiter.api.Test;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import util.filecontroller.Serializer;
import util.search.SQLTerm;
import util.validation.Validator;

public class GeneratedGetMyTablesTest {

    private static final String TABLE_NAME = "test";
    private static final String CLUSTERING_KEY_COLUMN = "test";
    private static final String COLUMN_NAME = "test";
    private static final String COLUMN_TYPE = "test";
    private static final String COLUMN_VALUE = "test";
    private static final String CLUSTERING_KEY_VALUE = "test";
    private static final String OPERATOR = "test";
    private static final String VALID_FILE_PATH = "test.csv";
    private static final String INVALID_FILE_PATH = "invalid.csv";

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> expectedResult = new HashSet<>();
        expectedResult.add(TABLE_NAME);

        HashSet<String> actualResult = dbApp.getMyTables();

        assertEquals(expectedResult, actualResult);
    }

}