package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedUpdateTable_FailsWithDBAppException {

    @Test
    public void updateTable_FailsWithDBAppException() {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        DBApp dbApp = new DBApp();
        assertTrue(dbApp.updateTable("testTable", "id", htblColNameValue).getClass().equals(DBAppException.class));
    }

}