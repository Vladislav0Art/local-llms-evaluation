package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import com.opencsv.exceptions.CsvValidationException;

public class GeneratedTestCreateTableInvalidClusteringKeyColumn {

    private DBApp dbApp;

    @Before
    public void setup() {
        dbApp = new DBApp();
    }

    @Test
    public void testCreateTableInvalidClusteringKeyColumn() throws Exception {
        dbApp.createTable("table", "", null, null, null);
    }

}