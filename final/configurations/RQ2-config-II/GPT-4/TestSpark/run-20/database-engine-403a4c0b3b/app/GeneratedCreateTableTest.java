package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito.*;

import java.util.*;

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() throws DBAppException {
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();

        DBApp dbApp = new DBApp();
        dbApp.createTable("TestTable", "key", htblColNameType, htblColNameMin, htblColNameMax);
    }

}