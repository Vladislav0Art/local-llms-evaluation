package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedUpdateTable_MockOk_ThrowsDBAppException {

    @Test
    public void updateTable_MockOk_ThrowsDBAppException() throws DBAppException {
        dbApp.updateTable("Test", "Test", null);
    }

}