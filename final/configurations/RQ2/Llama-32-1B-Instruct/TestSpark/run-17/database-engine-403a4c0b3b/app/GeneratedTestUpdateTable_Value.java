package app;

import app.DBAppException;
import app.IDatabase;
import app.TypeCaster;
import app.sql.SQLTerm;
import app.storage.*;
import com.opencsv.exceptions.CsvValidationException;
import org.junit.Test;

public class GeneratedTestUpdateTable_Value {

    @Test
    public void testUpdateTable_Value() throws DBAppException {
        IDatabase database = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", "value1");
        database.updateTable("test_table", "column1", htblColNameValue);
    }

}