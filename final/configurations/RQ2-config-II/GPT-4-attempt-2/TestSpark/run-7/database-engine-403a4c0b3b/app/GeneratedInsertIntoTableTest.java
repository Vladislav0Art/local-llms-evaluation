package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import sql.SQLTerm;

import java.util.Hashtable;

import static org.mockito.Mockito.*;

public class GeneratedInsertIntoTableTest {

    @Test
    public void insertIntoTableTest() throws DBAppException {
        DBApp databaseApp = new DBApp();
        Hashtable<String, Object> nameValue = new Hashtable<>();
        nameValue.put("columnName", "value");
        databaseApp.insertIntoTable("table", nameValue);
        // Check state or behaviour if needed
        // This is a basic test case as insertIntoTable method might not produce a testable output
    }

}