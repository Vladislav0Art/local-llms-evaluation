package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.HashSet;
import java.util.Hashtable;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import util.search.SQLTerm;

public class GeneratedTestInit {

    @Mock
    private CsvReader reader;
    @Mock
    private CsvWriter writer;
    @Mock
    private HashSet<String> myTables;

    private DBApp dbApp;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        dbApp = new DBApp();
    }

    @Test
    public void testInit() throws DBAppException, CsvValidationException, IOException {
        when(reader.readAllTables()).thenReturn(myTables);

        dbApp.init();

        verify(reader).readAllTables();
        assertNotNull(dbApp.getMyTables());
        assertEquals(myTables, dbApp.getMyTables());
    }

}