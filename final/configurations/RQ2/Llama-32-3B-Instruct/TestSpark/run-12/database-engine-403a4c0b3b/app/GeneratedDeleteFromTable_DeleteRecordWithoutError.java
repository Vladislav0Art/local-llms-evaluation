package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedDeleteFromTable_DeleteRecordWithoutError {

    @Test
    public void deleteFromTable_DeleteRecordWithoutError() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.deleteFromTable("testTable", htblColNameValue);
    }

}