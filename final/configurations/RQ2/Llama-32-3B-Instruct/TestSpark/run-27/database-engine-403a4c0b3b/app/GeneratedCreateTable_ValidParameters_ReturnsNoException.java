package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCreateTable_ValidParameters_ReturnsNoException {

    @Test
    public void createTable_ValidParameters_ReturnsNoException() throws DBAppException {
        Hashtable<String, String> htblColNameType = Mockito.mock(Hashtable.class);
        Hashtable<String, String> htblColNameMin = Mockito.mock(Hashtable.class);
        Hashtable<String, String> htblColNameMax = Mockito.mock(Hashtable.class);
        DBAppException exceptionMock = Mockito.mock(DBAppException.class);
        DBApp app = new DBApp();
        app.init();
        app.createTable("tableName", "clusteringKeyColumn", htblColNameType, htblColNameMin, htblColNameMax);
        assertNull(exceptionMock);
    }

}