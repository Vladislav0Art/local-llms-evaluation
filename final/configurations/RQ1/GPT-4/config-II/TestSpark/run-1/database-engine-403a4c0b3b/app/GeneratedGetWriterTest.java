package app;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

public class GeneratedGetWriterTest {

    @Test
    public void getWriterTest() {
        DBApp dbApp = new DBApp();
        Assert.assertNotNull(dbApp.getWriter());
        Assert.assertTrue(dbApp.getWriter() instanceof CsvWriter);
    }

}