package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCreateTable_MockOk_ThrowsDBAppException {

    @Test
    public void createTable_MockOk_ThrowsDBAppException() throws DBAppException {
        Hashtable<String, String> htblColNameTypeMock = Mockito.mock(Hashtable.class);
        Hashtable<String, String> htblClusteringKeyColumnMock = Mockito.mock(Hashtable.class);
        dbApp.createTable("Test", "Test", htblColNameTypeMock, htblClusteringKeyColumnMock, null);
    }

}