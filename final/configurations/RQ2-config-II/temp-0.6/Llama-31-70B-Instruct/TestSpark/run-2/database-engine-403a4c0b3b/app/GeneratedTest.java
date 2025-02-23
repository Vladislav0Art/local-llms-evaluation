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

public class GeneratedTest {

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

    @Test
    public void testCreateTable() throws DBAppException, CsvValidationException {
        // Arrange
        String strTableName = "test";
        String strClusteringKeyColumn = "test";
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();

        // Act
        dbApp.createTable(strTableName, strClusteringKeyColumn, htblColNameType, htblColNameMin, htblColNameMax);

        // Assert
        assertTrue(dbApp.getMyTables().contains(strTableName));
    }

}