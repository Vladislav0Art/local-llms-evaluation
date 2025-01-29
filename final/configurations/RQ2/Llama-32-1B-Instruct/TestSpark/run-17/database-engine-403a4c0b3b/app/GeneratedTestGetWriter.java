package app;

import app.DBAppException;
import app.IDatabase;
import app.TypeCaster;
import app.sql.SQLTerm;
import app.storage.*;
import com.opencsv.exceptions.CsvValidationException;
import org.junit.Test;

public class GeneratedTestGetWriter {

    @Test
    public void testGetWriter() throws IOException {
        IDatabase database = new DBApp();
        CsvWriter csvWriter = new CsvWriter(database);
        assertNotNull(csvWriter);
    }

}