package app;

import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;
import org.junit.Test;
import org.junit.Assert;

import java.util.*;

import static org.mockito.Mockito.*;

public class GeneratedUpdateTableTest {

    @Test
    public void updateTableTest() throws DBAppException {
        Hashtable<String, Object> colNameValue = new Hashtable<>();
        DBApp dbApp = new DBApp();
        dbApp.updateTable("testTable", "1", colNameValue);
        // As updateTable() is void method, no assertion is required, the test is for checking exceptions.
    }

}