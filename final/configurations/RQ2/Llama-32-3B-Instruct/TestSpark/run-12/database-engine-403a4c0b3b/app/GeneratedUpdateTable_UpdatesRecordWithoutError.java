package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedUpdateTable_UpdatesRecordWithoutError {

    @Test
    public void updateTable_UpdatesRecordWithoutError() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.updateTable("testTable", "id", htblColNameValue);
    }

}