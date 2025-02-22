package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import exceptions.DBAppException;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestInit {

    @Mock
    private CsvReader reader;
    @Mock
    private CsvWriter writer;

    private DBApp dbApp;

    @Before
    public void setUp() {
        dbApp = new DBApp();
    }

    @Test
    public void testInit() throws DBAppException {
        HashSet<String> set = new HashSet<String>();
        set.add("test1");
        set.add("test2");
        when(reader.readAllTables()).thenReturn(set);
        dbApp.init();
        assertEquals(set, dbApp.getMyTables());
    }

}