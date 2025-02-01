package app;

import app.DBApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Hashtable;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInsertIntoTableTest {

    @Mock
    private DBApp mockDbApp;

    @Test
    public void insertIntoTableTest() throws Exception {
        Hashtable<String, Object> mockhtblColNameValue = new Hashtable<>();

        // Exception is expected due to mocking method.
        doThrow(new RuntimeException()).when(mockDbApp).insertIntoTable("table", mockhtblColNameValue);
        mockDbApp.insertIntoTable("table", mockhtblColNameValue);
    }

}