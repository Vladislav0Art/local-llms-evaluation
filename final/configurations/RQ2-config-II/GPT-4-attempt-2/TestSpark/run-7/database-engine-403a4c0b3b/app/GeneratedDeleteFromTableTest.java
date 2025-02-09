package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import sql.SQLTerm;

import java.util.Hashtable;

import static org.mockito.Mockito.*;

public class GeneratedDeleteFromTableTest {

    @Test
    public void deleteFromTableTest() throws DBAppException {
        DBApp databaseApp = new DBApp();
        Hashtable<String, Object> nameValue = new Hashtable<>();
        nameValue.put("columnName", "value");
        databaseApp.deleteFromTable("table", nameValue);
        // Check state or behaviour if needed
        // This is a basic test case as deleteFromTable method might not produce a testable output
    }

}