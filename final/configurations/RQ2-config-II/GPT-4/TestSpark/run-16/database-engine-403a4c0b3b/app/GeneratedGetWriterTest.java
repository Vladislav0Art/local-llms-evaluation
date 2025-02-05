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

public class GeneratedGetWriterTest {

    @Test
    public void getWriterTest() {
        DBApp dbAppInstance = new DBApp();
        assertNotNull(dbAppInstance.getWriter());
    }

}