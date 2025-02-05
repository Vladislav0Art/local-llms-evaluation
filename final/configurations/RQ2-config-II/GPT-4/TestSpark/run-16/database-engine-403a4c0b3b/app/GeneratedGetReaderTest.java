package app;

import app.DBApp;
import org.junit.Test;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import sql.SQLTerm;

import java.util.Hashtable;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;
import static org.mockito.Mockito.*;

public class GeneratedGetReaderTest {

    @Test
    public void getReaderTest() {
        DBApp dbAppInstance = new DBApp();
        assertNotNull(dbAppInstance.getReader());
    }

}