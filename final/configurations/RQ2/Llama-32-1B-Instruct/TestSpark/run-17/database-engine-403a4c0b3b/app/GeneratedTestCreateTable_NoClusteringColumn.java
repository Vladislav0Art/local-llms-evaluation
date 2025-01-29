package app;

import app.DBAppException;
import app.IDatabase;
import app.TypeCaster;
import app.sql.SQLTerm;
import app.storage.*;
import com.opencsv.exceptions.CsvValidationException;
import org.junit.Test;

public class GeneratedTestCreateTable_NoClusteringColumn {

    @Test
    public void testCreateTable_NoClusteringColumn() throws DBAppException, CsvValidationException {
        IDatabase database = new DBApp();
        String tableName = "test_table";
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();

        database.createTable(tableName, htblColNameType, htblColNameMin, htblColNameMax);
    }

}