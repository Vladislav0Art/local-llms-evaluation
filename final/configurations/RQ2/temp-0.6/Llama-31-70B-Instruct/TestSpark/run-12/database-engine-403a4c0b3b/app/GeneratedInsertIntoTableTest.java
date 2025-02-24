package app;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedInsertIntoTableTest {

    @Test
    public void insertIntoTableTest() {
        DBApp dbApp = new DBApp();
        String strTableName = "";
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.insertIntoTable(strTableName, htblColNameValue);
    }

}