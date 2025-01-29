package app;

import app.DBAppException;
import app.IDatabase;
import app.TypeCaster;
import app.sql.SQLTerm;
import app.storage.*;
import com.opencsv.exceptions.CsvValidationException;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTestInsertIntoTable_NoValues {

    @Test
    public void testInsertIntoTable_NoValues() throws DBAppException {
        IDatabase database = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        database.insertIntoTable("test_table", htblColNameValue);
    }

}