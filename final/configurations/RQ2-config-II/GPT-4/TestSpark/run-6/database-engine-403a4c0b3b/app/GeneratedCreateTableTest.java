package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.HashSet;

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();

        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("Name", "String");
        htblColNameType.put("Age", "Int");

        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        htblColNameMin.put("Age", "0");

        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameMax.put("Age", "100");

        dbApp.createTable("Persons", "Name", htblColNameType, htblColNameMin, htblColNameMax);

        Assert.assertTrue(dbApp.getMyTables().contains("Persons"));
    }

}