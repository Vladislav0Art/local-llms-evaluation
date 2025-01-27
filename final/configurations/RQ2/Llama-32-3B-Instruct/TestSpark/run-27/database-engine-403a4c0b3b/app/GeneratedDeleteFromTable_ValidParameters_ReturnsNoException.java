package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedDeleteFromTable_ValidParameters_ReturnsNoException {

    @Test
    public void deleteFromTable_ValidParameters_ReturnsNoException() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = Mockito.mock(Hashtable.class);
        String strClusteringKeyValue = "clusteringKey";
        DBAppException exceptionMock = Mockito.mock(DBAppException.class);
        DBApp app = new DBApp();
        app.init();
        app.deleteFromTable("tableName", htblColNameValue);
        assertNull(exceptionMock);
    }

}