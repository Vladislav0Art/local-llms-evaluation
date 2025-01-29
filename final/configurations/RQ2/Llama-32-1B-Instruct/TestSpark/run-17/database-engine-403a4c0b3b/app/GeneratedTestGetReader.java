package app;

import app.DBAppException;
import app.IDatabase;
import app.TypeCaster;
import app.sql.SQLTerm;
import app.storage.*;
import com.opencsv.exceptions.CsvValidationException;
import org.junit.Test;

public class GeneratedTestGetReader {

    @Test
    public void testGetReader() throws IOException {
        IDatabase database = new DBApp();
        CsvReader csvReader = new CsvReader(database);
        assertNotNull(csvReader);
    }

}