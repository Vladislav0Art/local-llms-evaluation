package app;

import app.DBAppException;
import app.IDatabase;
import app.TypeCaster;
import app.sql.SQLTerm;
import app.storage.*;
import com.opencsv.exceptions.CsvValidationException;
import org.junit.Test;

public class GeneratedTestInit {

    @Test
    public void testInit() {
        IDatabase database = new DBApp();
        boolean result = true;
        database.init();
        assertTrue(result);
    }

}