package app;

import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import util.filecontroller.Serializer;
import storage.*;
import util.TypeCaster;
import util.search.*;
import sql.SQLTerm;
import datamanipulation.CsvReader;
import datamanipulation.CsvWriter;
import util.validation.Validator;

public class GeneratedTestGetMyTables_WhenNotInitialized_ReturnsEmptySet {

    private HashSet<String> myTables = new HashSet<>();
    private Serializer serializer = new Serializer();
    private Validator validator = new Validator();

    public static class GetMyTablesTest extends AbstractDbAppTest {

        @Test
        public void testGetMyTables_WhenNotInitialized_ReturnsEmptySet() throws DBAppException {
            when(getDatabase()).thenReturn(null);
            verify(dbApp, times(1)).getMyTables();
        }
    }

    public static class GetReaderTest extends AbstractDbAppTest {
        private DBApp dbApp;

        @Before
        public void before() throws DBAppException {
            dbApp = new DBApp();
        }

    }