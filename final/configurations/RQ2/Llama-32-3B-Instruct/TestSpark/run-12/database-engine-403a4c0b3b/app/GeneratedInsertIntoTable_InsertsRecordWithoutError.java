package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedInsertIntoTable_InsertsRecordWithoutError {

    @Test
    public void insertIntoTable_InsertsRecordWithoutError() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.insertIntoTable("testTable", htblColNameValue);
    }

}