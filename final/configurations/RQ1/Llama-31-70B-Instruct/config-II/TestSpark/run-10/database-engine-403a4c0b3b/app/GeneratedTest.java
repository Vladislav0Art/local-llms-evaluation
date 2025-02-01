package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import app.DBApp;
import app.IDatabase;
import app.exceptions.DBAppException;
import app.storage.Table;
import app.util.search.SQLTerm;
import app.util.search.Selector;
import app.util.validation.Validator;

public class GeneratedTest {

    private DBApp dbApp;
    private Table table;
    private Hashtable<String, String> htblColNameType;
    private Hashtable<String, String> htblColNameMin;
    private Hashtable<String, String> htblColNameMax;
    private Hashtable<String, Object> htblColNameValue;
    private SQLTerm[] arrSQLTerms;
    private String[] strarrOperators;

    @Before
    public void setUp() {
        dbApp = new DBApp();
        table = Mockito.mock(Table.class);
        htblColNameType = new Hashtable<>();
        htblColNameMin = new Hashtable<>();
        htblColNameMax = new Hashtable<>();
        htblColNameValue = new Hashtable<>();
        arrSQLTerms = new SQLTerm[0];
        strarrOperators = new String[0];
    }

    @Test
    public void testGetMyTables() {
        HashSet<String> expected = new HashSet<>();
        expected.add("table1");
        expected.add("table2");
        dbApp.myTables = expected;
        assertEquals(expected, dbApp.getMyTables());
    }

}