package app;

import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;
import org.junit.Test;
import org.junit.Assert;

import java.util.*;

import static org.mockito.Mockito.*;

public class GeneratedGetWriterTest {

    @Test
    public void getWriterTest() {
        DBApp dbApp = mock(DBApp.class);
        when(dbApp.getWriter()).thenReturn(null);
        Assert.assertNull(dbApp.getWriter());
    }

}