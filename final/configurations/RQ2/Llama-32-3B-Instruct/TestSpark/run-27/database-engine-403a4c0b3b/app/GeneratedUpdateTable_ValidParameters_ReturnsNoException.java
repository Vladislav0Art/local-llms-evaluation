package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedUpdateTable_ValidParameters_ReturnsNoException {

    @Test
    public void updateTable_ValidParameters_ReturnsNoException() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = Mockito.mock(Hashtable.class);
        String strClusteringKeyValue = "clusteringKey";
        DBAppException exceptionMock = Mockito.mock(DBAppException.class);
        DBApp app = new DBApp();
        app.init();
        app.updateTable("tableName", strClusteringKeyValue, htblColNameValue);
        assertNull(exceptionMock);
    }

}