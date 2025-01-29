package app;

import app.DBAppException;
import app.IDatabase;
import app.TypeCaster;
import app.sql.SQLTerm;
import app.storage.*;
import com.opencsv.exceptions.CsvValidationException;
import org.junit.Test;

public class GeneratedTestGetMyTables {

    @Test
    public void testGetMyTables() throws IOException {
        IDatabase database = new DBApp();
        HashSet<String> result = database.getMyTables();
        assertEquals(1, result.size());
    }

}