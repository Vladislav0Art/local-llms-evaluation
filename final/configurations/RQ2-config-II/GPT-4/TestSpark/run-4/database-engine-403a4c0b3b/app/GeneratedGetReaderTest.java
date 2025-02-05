package app;

import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;
import org.junit.Test;
import org.junit.Assert;

import java.util.*;

import static org.mockito.Mockito.*;

public class GeneratedGetReaderTest {

    @Test
    public void getReaderTest() {
        DBApp dbApp = mock(DBApp.class);
        when(dbApp.getReader()).thenReturn(null);
        Assert.assertNull(dbApp.getReader());
    }

}