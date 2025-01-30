package app;

import static junit.framework.TestCase.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.text.ParseException;
import java.util.Hashtable;
import java.util.Iterator;

import org.junit.Test;
import org.mockito.Mockito;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import sql.SQLTerm;
import storage.Table;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        DBApp app = new DBApp();
        try {
            app.init();
            // If no exception is thrown, then it's a success
        } catch (Exception e) {
            fail("Exception shouldn't be thrown");
        }
    }

}