package app;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() {
        DBApp dbApp = new DBApp();
        String strTableName = "testTable";
        String strClusteringKeyColumn = "clusteringKey";
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameType.put("col1", "String");
        htblColNameMin.put("col1", "0");
        htblColNameMax.put("col1", "100");
        try {
            dbApp.createTable(strTableName, strClusteringKeyColumn, htblColNameType, htblColNameMin, htblColNameMax);
        } catch (DBAppException e) {
            fail(e.getMessage());
        }
    }

}