package app;

import org.junit.Test;
import org.junit.Assert;

import java.util.*;

import exceptions.DBAppException;
import sql.SQLTerm;

import static org.mockito.Mockito.*;

public class GeneratedCreateTableExceptionTest {

    @Test
    public void createTableExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> colNameType = new Hashtable<>();
        Hashtable<String, String> colNameMin = new Hashtable<>();
        Hashtable<String, String> colNameMax = new Hashtable<>();

        dbApp.createTable(null, "TestKey", colNameType, colNameMin, colNameMax);
    }

}