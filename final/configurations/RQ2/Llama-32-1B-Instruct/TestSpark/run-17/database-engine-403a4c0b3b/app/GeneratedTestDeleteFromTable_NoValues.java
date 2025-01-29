package app;

import app.DBAppException;
import app.IDatabase;
import app.TypeCaster;
import app.sql.SQLTerm;
import app.storage.*;
import com.opencsv.exceptions.CsvValidationException;
import org.junit.Test;

public class GeneratedTestDeleteFromTable_NoValues {

    @Test
    public void testDeleteFromTable_NoValues() throws DBAppException {
        IDatabase database = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        database.deleteFromTable("test_table", htblColNameValue);
    }

}