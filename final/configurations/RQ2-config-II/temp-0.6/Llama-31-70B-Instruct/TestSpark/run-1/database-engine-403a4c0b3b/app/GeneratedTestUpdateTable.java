package app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

public class GeneratedTestUpdateTable {

    private DBApp dbApp;

    @Before
    public void setUp() {
        dbApp = new DBApp();
    }

    @Test
    public void testUpdateTable() {
        String strTableName = "table1";
        String strClusteringKeyValue = "value1";
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        dbApp.updateTable(strTableName, strClusteringKeyValue, htblColNameValue);
    }

}