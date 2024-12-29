package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateTableTest_NullTableName_ThrowsDBAppException {

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void createTableTest_NullTableName_ThrowsDBAppException() {
        try {
            dbApp.createTable(null, "column1", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
            fail("Expected DBAppException to be thrown");
        } catch (Exception e) {
            assertTrue(e instanceof DBAppException);
        }
    }

}