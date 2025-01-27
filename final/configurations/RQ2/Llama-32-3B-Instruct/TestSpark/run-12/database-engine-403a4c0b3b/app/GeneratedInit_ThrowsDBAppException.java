package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedInit_ThrowsDBAppException {

    @Test
    public void init_ThrowsDBAppException() {
        DBApp dbApp = new DBApp();
        assertTrue(dbApp.init().getClass().equals(DBAppException.class));
    }

}