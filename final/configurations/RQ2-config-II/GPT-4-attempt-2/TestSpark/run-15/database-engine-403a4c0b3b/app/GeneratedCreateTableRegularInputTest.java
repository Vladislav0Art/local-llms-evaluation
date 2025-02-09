package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.Hashtable;
import java.util.HashSet;

import exceptions.DBAppException;
import sql.SQLTerm;

public class GeneratedCreateTableRegularInputTest {

    @Test
    public void createTableRegularInputTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameType.put("id", "integer");
        htblColNameMin.put("id", "1");
        htblColNameMax.put("id", "100");

        dbApp.createTable("TestTable", "id", htblColNameType, htblColNameMin, htblColNameMax);
        assertTrue(dbApp.getMyTables().contains("TestTable"));
    }

}