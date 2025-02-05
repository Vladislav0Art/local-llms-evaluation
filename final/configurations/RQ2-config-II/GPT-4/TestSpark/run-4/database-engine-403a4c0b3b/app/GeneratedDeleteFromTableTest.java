package app;

import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;
import org.junit.Test;
import org.junit.Assert;

import java.util.*;

import static org.mockito.Mockito.*;

public class GeneratedDeleteFromTableTest {

    @Test
    public void deleteFromTableTest() throws DBAppException {
        Hashtable<String, Object> colNameValue = new Hashtable<>();
        DBApp dbApp = new DBApp();
        dbApp.deleteFromTable("testTable", colNameValue);
        // As deleteFromTable() is void method, no assertion is required, the test is for checking exceptions.
    }

}