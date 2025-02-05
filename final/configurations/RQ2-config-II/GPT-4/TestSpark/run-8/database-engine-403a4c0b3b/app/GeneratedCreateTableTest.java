package app;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() throws DBAppException {
        // create a new instance of DBApp class
        DBApp app = new DBApp();

        // create and initialize the required hashtables
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();

        // testing if the createTable() method throws an exception when we provide null as strTableName, strClusteringKeyColumn
        app.createTable(null, null, htblColNameType, htblColNameMin, htblColNameMax);
    }

}