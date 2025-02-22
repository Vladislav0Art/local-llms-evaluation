package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import com.opencsv.exceptions.CsvValidationException;

public class GeneratedTest {

    private DBApp dbApp;

    @Before
    public void setup() {
        dbApp = new DBApp();
    }

    @Test
    public void testGetMyTables() {
        assertNotNull(dbApp.getMyTables());
        assertEquals(0, dbApp.getMyTables().size());
    }

    @Test
    public void testGetReader() {
        assertNotNull(dbApp.getReader());
    }

    @Test
    public void testGetWriter() {
        assertNotNull(dbApp.getWriter());
    }

    @Test
    public void testInit() {
        dbApp.init();
        assertEquals(0, dbApp.getMyTables().size());
    }

    @Test
    public void testCreateTableInvalidTableName() throws Exception {
        dbApp.createTable("", "", null, null, null);
    }

    @Test
    public void testCreateTableInvalidClusteringKeyColumn() throws Exception {
        dbApp.createTable("table", "", null, null, null);
    }

    @Test
    public void testCreateTableInvalidDataType() throws Exception {
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("column", "invalid");
        dbApp.createTable("table", "column", htblColNameType, null, null);
    }

}