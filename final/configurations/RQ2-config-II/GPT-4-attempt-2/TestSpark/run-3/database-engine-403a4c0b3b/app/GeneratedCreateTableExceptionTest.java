package app;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

public class GeneratedCreateTableExceptionTest {

    @Test
    public void createTableExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameType.put("TestCol", "InvalidType");
        htblColNameMin.put("TestCol", "A");
        htblColNameMax.put("TestCol", "Z");
        dbApp.createTable("TestTable", "TestCol", htblColNameType, htblColNameMin, htblColNameMax);
    }

}