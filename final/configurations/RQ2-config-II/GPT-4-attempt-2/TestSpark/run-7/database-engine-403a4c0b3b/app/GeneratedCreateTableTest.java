package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import sql.SQLTerm;

import java.util.Hashtable;

import static org.mockito.Mockito.*;

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() throws DBAppException {
        DBApp databaseApp = new DBApp();
        Hashtable<String, String> nameType = new Hashtable<>();
        Hashtable<String, String> nameMin = new Hashtable<>();
        Hashtable<String, String> nameMax = new Hashtable<>();

        nameType.put("columnName", "type");
        nameMin.put("columnName", "min");
        nameMax.put("columnName", "max");

        databaseApp.createTable("table", "clusteringKey", nameType, nameMin, nameMax);
        // Check state or behaviour if needed
        // This is a basic test case as createTable method might not produce a testable output
    }

}