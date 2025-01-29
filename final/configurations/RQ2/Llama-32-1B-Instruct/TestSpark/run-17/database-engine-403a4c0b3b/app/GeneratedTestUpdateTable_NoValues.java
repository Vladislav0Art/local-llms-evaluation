package app;

import app.DBAppException;
import app.IDatabase;
import app.TypeCaster;
import app.sql.SQLTerm;
import app.storage.*;
import com.opencsv.exceptions.CsvValidationException;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTestUpdateTable_NoValues {

    @Test
    public void testUpdateTable_NoValues() throws DBAppException {
        IDatabase database = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        database.updateTable("test_table", "column1", htblColNameValue);
    }

}