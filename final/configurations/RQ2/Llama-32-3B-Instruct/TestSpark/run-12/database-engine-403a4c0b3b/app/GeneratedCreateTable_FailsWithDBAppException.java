package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCreateTable_FailsWithDBAppException {

    @Test
    public void createTable_FailsWithDBAppException() {
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();

        DBApp dbApp = new DBApp();
        dbApp.init();

        dbApp.createTable("testTable", "id", htblColNameType, htblColNameMin, htblColNameMax);
        assertEquals(DBAppException.class, dbApp.createTable("testTable", "id", htblColNameType, htblColNameMin, htblColNameMax).getClass());
    }

}