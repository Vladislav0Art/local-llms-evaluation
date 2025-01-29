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

public class GeneratedTest {

    private HashSet<String> myTables = new HashSet<>();
    private Serializer serializer = new Serializer();
    private Validator validator = new Validator();

    public static class GetMyTablesTest extends AbstractDbAppTest {

        @Test
        public void testGetMyTables_WhenNotInitialized_ReturnsEmptySet() throws DBAppException {
            when(getDatabase()).thenReturn(null);
            verify(myTables).isEmpty();
        }
    }

    @Test
    public void testGetReader_ReturnsCsvReaderObject() throws DBAppException {
        csvReader = new CsvReader(validator, myTables);
        verify(csvReader).create();
        verify(myTables).contains("csvReader");
    }
}

@Test
public void testGetWriter_ReturnsCsvWriterObject() throws DBAppException {
    csvWriter = new CsvWriter(validator, myTables);
    verify(csvWriter).create();
    verify(myTables).contains("csvWriter");
}
	}

@Test
public void testGetTable_WhenInitialized_ReturnsCreatedTableObject() throws DBAppException {
    when(init()).thenReturn(table);
    verify(myTables).add("table");
}
	}

@Test
public void testCreateTable_WhenInitialized_ReturnsCreatedTableObject() throws DBAppException {
    when(init()).thenReturn(table);
    when(createTable("table_name", "column1", null, null, null)).thenReturn(sqlTerm);
    verify(myTables).add("table");
}
	}

@Test
public void testInsertIntoTable_WhenInitialized_ReturnsCreatedTableObject() throws DBAppException {
    when(init()).thenReturn(table);
    when(insertIntoTable("table_name", null)).thenReturn(tableValue);
    verify(myTables).add("table");
}
	}

@Test
public void testUpdateTable_WhenInitialized_ReturnsCreatedTableObject() throws DBAppException {
    when(init()).thenReturn(table);
    when(updateTable("table_name", null, null)).thenReturn(tableValue);
    verify(myTables).add("table");
}
	}

@Test
public void testDeleteFromTable_WhenInitialized_ReturnsCreatedTableObject() throws DBAppException {
    when(init()).thenReturn(table);
    when(deleteFromTable("table_name", null)).thenReturn(tableValue);
    verify(myTables).add("table");
}
	}

@Test
public void testSelectFromTable_WhenInitialized_ReturnsCreatedTableObject() throws DBAppException {
    when(init()).thenReturn(table);
    when(selectFromTable(null, null)).thenReturn(tableValue);
    verify(myTables).add("table");
}
		}

public static class DbApp extends AbstractDbApp {
    @Override
    public HashSet<String> getMyTables() {
        return myTables;
    }

    @Override
    public void init() {
        myTables = new HashSet<>();
        createTable("my_table", "column1", null, null, null);
    }

    @Override
    public void insertIntoTable(String strTableName, Hashtable<String, Object> htblColNameValue) throws DBAppException {
        table = getTable();
        insertIntoTable(strTableName, htblColNameValue);
    }

    @Override
    public void updateTable(String strTableName, String strClusteringKeyValue,
                            Hashtable<String, Object> htblColNameValue) throws DBAppException {
        table.update(strTableName, strClusteringKeyValue, htblColNameValue);
    }

    @Override
    public void deleteFromTable(String strTableName, Hashtable<String, Object> htblColNameValue) throws DBAppException {
        table.delete(strTableName, htblColNameValue);
    }

    @Override
    public Iterator selectFromTable(SQLTerm[] arrSQLTerms, String[] strarrOperators) throws DBAppException {
        csvReader = getReader();
        return selectFromTable(csvReader, arrSQLTerms, strarrOperators);
    }
}

static class AbstractDbAppTest extends AbstractTestDBApp {
    private IDatabase database;

    @Override
    public void setUp() {
        super.setUp();
        database = new DBApp();
    }

    public static class GetMyTablesTest extends AbstractDbAppTest {
        private DBApp dbApp;

        @Before
        public void before() throws DBAppException {
            dbApp = new DBApp();
        }

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

        @Test
        public void testGetReader_ReturnsCsvReaderObject() throws DBAppException {
            csvReader = new CsvReader(validator, myTables);
            verify(dbApp.getDatabase()).create(csvReader);
        }
    }

    public static class GetWriterTest extends AbstractDbAppTest {
        private DBApp dbApp;

        @Before
        public void before() throws DBAppException {
            dbApp = new DBApp();
        }

        @Test
        public void testGetWriter_ReturnsCsvWriterObject() throws DBAppException {
            csvWriter = new CsvWriter(validator, myTables);
            verify(dbApp.getDatabase()).create(csvWriter);
        }
    }

    public static class GetTableTest extends AbstractDbAppTest {
        private DBApp dbApp;

        @Before
        public void before() throws DBAppException {
            dbApp = new DBApp();
        }

        @Test
        public void testGetTable_WhenInitialized_ReturnsCreatedTableObject() throws DBAppException {
            when(init()).thenReturn(dbApp.table);
            verify(myTables).add("table");
        }
    }

    public static class CreateTableTest extends AbstractDbAppTest {
        private DBApp dbApp;

        @Before
        public void before() throws DBAppException {
            dbApp = new DBApp();
        }

        @Test
        public void testCreateTable_WhenInitialized_ReturnsCreatedTableObject() throws DBAppException {
            when(init()).thenReturn(dbApp.table);
            verify(myTables).add("table");
        }
    }

    public static class UpdateTableTest extends AbstractDbAppTest {
        private DBApp dbApp;

        @Before
        public void before() throws DBAppException {
            dbApp = new DBApp();
        }

        @Test
        public void testUpdateTable_WhenInitialized_ReturnsCreatedTableObject() throws DBAppException {
            when(init()).thenReturn(dbApp.table);
            verify(myTables).add("table");
        }
    }

    public static class DeleteFromTableTest extends AbstractDbAppTest {
        private DBApp dbApp;

        @Before
        public void before() throws DBAppException {
            dbApp = new DBApp();
        }

        @Test
        public void testDeleteFromTable_WhenInitialized_ReturnsCreatedTableObject() throws DBAppException {
            when(init()).thenReturn(dbApp.table);
            verify(myTables).add("table");
        }
    }

    public static class SelectFromTableTest extends AbstractDbAppTest {
        private DBApp dbApp;

        @Before
        public void before() throws DBAppException {
            dbApp = new DBApp();
        }

        @Test
        public void testSelectFromTable_WhenInitialized_ReturnsCreatedTableObject() throws DBAppException {
            when(init()).thenReturn(dbApp.table);
            verify(myTables).add("table");
        }
    }
}

}