package app;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.Test;

public class GeneratedInsertIntoTableTest {

    @Test
    public void insertIntoTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        String strTableName = "table1";
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", "value1");
        dbApp.insertIntoTable(strTableName, htblColNameValue);
    }

}