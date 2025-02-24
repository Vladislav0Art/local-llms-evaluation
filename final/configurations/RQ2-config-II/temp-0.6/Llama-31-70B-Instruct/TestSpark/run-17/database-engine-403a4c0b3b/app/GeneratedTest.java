package app;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> expectedResult = new HashSet<>();
        expectedResult.add("table1");
        assertEquals(expectedResult, dbApp.getMyTables());
    }

    @Test
    public void createTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        String strTableName = "table1";
        String strClusteringKeyColumn = "column1";
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("column1", "type1");
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        htblColNameMin.put("column1", "min1");
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameMax.put("column1", "max1");
        dbApp.createTable(strTableName, strClusteringKeyColumn, htblColNameType, htblColNameMin, htblColNameMax);
    }

    @Test
    public void insertIntoTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        String strTableName = "table1";
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", "value1");
        dbApp.insertIntoTable(strTableName, htblColNameValue);
    }

}