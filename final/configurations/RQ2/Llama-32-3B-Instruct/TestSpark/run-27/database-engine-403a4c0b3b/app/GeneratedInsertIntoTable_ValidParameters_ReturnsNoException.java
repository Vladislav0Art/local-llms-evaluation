package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedInsertIntoTable_ValidParameters_ReturnsNoException {

    @Test
    public void insertIntoTable_ValidParameters_ReturnsNoException() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = Mockito.mock(Hashtable.class);
        DBAppException exceptionMock = Mockito.mock(DBAppException.class);
        DBApp app = new DBApp();
        app.init();
        app.insertIntoTable("tableName", htblColNameValue);
        assertNull(exceptionMock);
    }

}