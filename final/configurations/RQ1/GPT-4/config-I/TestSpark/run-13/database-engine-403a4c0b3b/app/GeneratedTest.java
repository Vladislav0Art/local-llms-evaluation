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

public class GeneratedTest {

    @Test
    public void initTest() {
        DBApp app = new DBApp();
        try {
            app.init();
            // If no exception is thrown, then it's a success
        } catch (Exception e) {
            fail("Exception shouldn't be thrown");
        }
    }

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

    @Test
    public void insertIntoTableTest() throws DBAppException {
        DBApp app = Mockito.mock(DBApp.class);
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("id", 1);
        app.insertIntoTable("TestTable", htblColNameValue);
    }

    @Test
    public void updateTableTest() throws DBAppException {
        DBApp app = Mockito.mock(DBApp.class);
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("id", 2);
        app.updateTable("TestTable", "1", htblColNameValue);
    }

    @Test
    public void deleteFromTableTest() throws DBAppException {
        DBApp app = Mockito.mock(DBApp.class);
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("id", 1);
        app.deleteFromTable("TestTable", htblColNameValue);
    }

    @Test
    public void selectFromTableTest() throws DBAppException {
        DBApp app = Mockito.mock(DBApp.class);
        SQLTerm[] arrSQLTerms = {};
        String[] strarrOperators = {};
        app.selectFromTable(arrSQLTerms, strarrOperators);
    }

}