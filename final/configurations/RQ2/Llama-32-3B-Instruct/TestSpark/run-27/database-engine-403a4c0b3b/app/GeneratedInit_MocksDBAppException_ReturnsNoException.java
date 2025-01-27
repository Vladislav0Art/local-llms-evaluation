package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedInit_MocksDBAppException_ReturnsNoException {

    @Test
    public void init_MocksDBAppException_ReturnsNoException() throws DBAppException {
        DBAppException exceptionMock = Mockito.mock(DBAppException.class);
        DBApp app = new DBApp();
        DBApp result = app.init();
        assertNull(result);
    }

}