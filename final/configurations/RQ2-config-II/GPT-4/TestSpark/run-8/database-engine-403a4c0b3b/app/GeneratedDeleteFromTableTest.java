package app;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedDeleteFromTableTest {

    @Test
    public void deleteFromTableTest() throws DBAppException {
        // create a new instance of DBApp class
        DBApp app = new DBApp();

        // create and initialize the required hashtable
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        // testing if the deleteFromTable() methods throws an exception when we provide null as strTableName
        app.deleteFromTable(null, htblColNameValue);
    }

}