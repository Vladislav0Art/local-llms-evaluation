package app;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestCreateTable {

    private DBApp dbApp;

    @Before
    public void setUp() {
        dbApp = new DBApp();
    }

    @Test
    public void testCreateTable() throws DBAppException {
        String tableName = "testTable";
        String clusteringKeyColumn = "testColumn";
        Hashtable<String, String> columnNameType = new Hashtable<>();
        columnNameType.put("testColumn", "String");
        Hashtable<String, String> columnNameMin = new Hashtable<>();
        columnNameMin.put("testColumn", "0");
        Hashtable<String, String> columnNameMax = new Hashtable<>();
        columnNameMax.put("testColumn", "10");

        dbApp.createTable(tableName, clusteringKeyColumn, columnNameType, columnNameMin, columnNameMax);
        assertEquals(1, dbApp.getMyTables().size());
    }

}