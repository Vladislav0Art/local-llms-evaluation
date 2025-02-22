package app;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

public class GeneratedTestInit {

    private DBApp dbApp;
    private HashSet<String> myTables;
    private CsvReader reader;
    private CsvWriter writer;
    private Object clusteringKey;
    private String clusteringKeyValue;
    private SQLTerm[] arrSQLTerms;
    private String[] strarrOperators;
    private Iterator result;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        dbApp = new DBApp();
        myTables = Mockito.mock(HashSet.class);
        reader = Mockito.mock(CsvReader.class);
        writer = Mockito.mock(CsvWriter.class);
        clusteringKey = Mockito.mock(Object.class);
        clusteringKeyValue = Mockito.mock(String.class);
        arrSQLTerms = Mockito.mock(SQLTerm[].class);
        strarrOperators = Mockito.mock(String[].class);
        result = Mockito.mock(Iterator.class);
    }

    @Test
    public void testInit() {
        Mockito.when(reader.readAllTables()).thenReturn(myTables);
        dbApp.init();
        assertEquals(myTables, dbApp.getMyTables());
    }

}