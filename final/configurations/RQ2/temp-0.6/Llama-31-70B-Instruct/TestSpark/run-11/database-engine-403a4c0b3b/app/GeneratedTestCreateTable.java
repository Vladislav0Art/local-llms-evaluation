package app;

import static org.junit.Assert.assertNotNull;

import java.util.HashSet;
import java.util.Hashtable;

import org.junit.Test;
import app.DBApp;
import app.IDatabase;

public class GeneratedTestCreateTable {

    @Test
    public void testCreateTable() {
        DBApp dbApp = new DBApp();
        String strTableName = "testTable";
        String strClusteringKeyColumn = "testKeyColumn";
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        dbApp.createTable(strTableName, strClusteringKeyColumn, htblColNameType, htblColNameMin, htblColNameMax);
    }

}