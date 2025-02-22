package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import com.opencsv.exceptions.CsvValidationException;

public class GeneratedTestCreateTableInvalidDataType {

    private DBApp dbApp;

    @Before
    public void setup() {
        dbApp = new DBApp();
    }

    @Test
    public void testCreateTableInvalidDataType() throws Exception {
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("column", "invalid");
        dbApp.createTable("table", "column", htblColNameType, null, null);
    }

}