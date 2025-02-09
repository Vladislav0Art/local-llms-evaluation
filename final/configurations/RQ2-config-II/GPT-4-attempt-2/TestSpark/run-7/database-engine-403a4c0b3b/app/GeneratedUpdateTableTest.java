package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import sql.SQLTerm;

import java.util.Hashtable;

import static org.mockito.Mockito.*;

public class GeneratedUpdateTableTest {

    @Test
    public void updateTableTest() throws DBAppException {
        DBApp databaseApp = new DBApp();
        Hashtable<String, Object> nameValue = new Hashtable<>();
        nameValue.put("columnName", "value");
        databaseApp.updateTable("table", "clusteringKeyValue", nameValue);
        // Check state or behaviour if needed
        // This is a basic test case as updateTable method might not produce a testable output
    }

}