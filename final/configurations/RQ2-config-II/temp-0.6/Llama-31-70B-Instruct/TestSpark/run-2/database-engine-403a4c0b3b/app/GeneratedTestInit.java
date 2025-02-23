package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import com.opencsv.exceptions.CsvValidationException;

public class GeneratedTestInit {

    private DBApp dbApp;

    @Before
    public void setUp() throws Exception {
        dbApp = new DBApp();
    }

    @Test
    public void testInit() {
        // Arrange
        dbApp.init();

        // Act
        HashSet<String> myTables = dbApp.getMyTables();

        // Assert
        assertEquals(myTables.size(), 0);
    }

}