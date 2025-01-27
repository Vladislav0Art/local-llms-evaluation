package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedDeleteFromTable_MockOk_ThrowsDBAppException {

    @Test
    public void deleteFromTable_MockOk_ThrowsDBAppException() throws DBAppException {
        Hashtable<String, Object> htblColNameValueMock = Mockito.mock(Hashtable.class);
        dbApp.deleteFromTable("Test", htblColNameValueMock);
    }

}