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

public class GeneratedTestGetWriter {

    @Test
    public void testGetWriter() {
        DBApp dbApp = new DBApp();
        CsvWriter writer = dbApp.getWriter();
        Assert.assertNotNull(writer);
    }

}