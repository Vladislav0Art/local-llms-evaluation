package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedInsertIntoTable_MockOk_ThrowsDBAppException {

    @Test
    public void insertIntoTable_MockOk_ThrowsDBAppException() throws DBAppException {
        Hashtable<String, Object> htblColNameValueMock = Mockito.mock(Hashtable.class);
        dbApp.insertIntoTable("Test", htblColNameValueMock);
    }

}