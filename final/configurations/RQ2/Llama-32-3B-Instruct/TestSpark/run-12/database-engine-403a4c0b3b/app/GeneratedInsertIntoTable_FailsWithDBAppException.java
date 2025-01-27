package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedInsertIntoTable_FailsWithDBAppException {

    @Test
    public void insertIntoTable_FailsWithDBAppException() {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        DBApp dbApp = new DBApp();
        assertTrue(dbApp.insertIntoTable("testTable", htblColNameValue).getClass().equals(DBAppException.class));
    }

}