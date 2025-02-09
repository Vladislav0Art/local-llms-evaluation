package app;

import org.junit.Test;
import org.junit.Assert;

import java.util.*;

import exceptions.DBAppException;
import sql.SQLTerm;

import static org.mockito.Mockito.*;

public class GeneratedCreateTableBasicTest {

    @Test
    public void createTableBasicTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> colNameType = new Hashtable<>();
        Hashtable<String, String> colNameMin = new Hashtable<>();
        Hashtable<String, String> colNameMax = new Hashtable<>();

        dbApp.createTable("TestTable", "TestKey", colNameType, colNameMin, colNameMax);
    }

}