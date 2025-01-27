package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedDeleteFromTable_FailsWithDBAppException {

    @Test
    public void deleteFromTable_FailsWithDBAppException() {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        DBApp dbApp = new DBApp();
        assertTrue(dbApp.deleteFromTable("testTable", htblColNameValue).getClass().equals(DBAppException.class));
    }

}