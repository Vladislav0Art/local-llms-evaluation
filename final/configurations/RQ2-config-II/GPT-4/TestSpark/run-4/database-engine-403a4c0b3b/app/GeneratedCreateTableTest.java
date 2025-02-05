package app;

import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;
import org.junit.Test;
import org.junit.Assert;

import java.util.*;

import static org.mockito.Mockito.*;

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() throws DBAppException {
        Hashtable<String, String> colNameType = new Hashtable<>();
        Hashtable<String, String> colNameMin = new Hashtable<>();
        Hashtable<String, String> colNameMax = new Hashtable<>();
        DBApp dbApp = new DBApp();
        dbApp.createTable("testTable", "id", colNameType, colNameMin, colNameMax);
        // As createTable() is void method, no assertion is required, the test is for checking exceptions.
    }

}