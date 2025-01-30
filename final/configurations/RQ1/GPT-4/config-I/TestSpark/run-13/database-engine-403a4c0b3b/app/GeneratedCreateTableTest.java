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

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() throws DBAppException {
        DBApp app = new DBApp();
        String strTableName = "TestTable";
        String strClusteringKeyColumn = "id";
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();

        htblColNameType.put("id", "java.lang.Integer");
        htblColNameMin.put("id", "0");
        htblColNameMax.put("id", "100");

        app.createTable(strTableName, strClusteringKeyColumn, htblColNameType, htblColNameMin,
                htblColNameMax);
    }

}