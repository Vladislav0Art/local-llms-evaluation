package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedInit_MockOk_ThrowsDBAppException {

    @Test
    public void init_MockOk_ThrowsDBAppException() {
        DBAppException e = new DBAppException("Mock error");
        try {
            dbApp.init();
            fail("Expected DBAppException");
        } catch (DBAppException e1) {
            assertEquals(e, e1);
        }
    }

}