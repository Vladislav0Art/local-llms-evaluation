package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.HashSet;

public class GeneratedTestGetReader {

    @Test
    public void testGetReader() {
        DBApp dbApp = new DBApp();
        CsvReader reader = dbApp.getReader();
        Assert.assertNotNull(reader);
    }

}