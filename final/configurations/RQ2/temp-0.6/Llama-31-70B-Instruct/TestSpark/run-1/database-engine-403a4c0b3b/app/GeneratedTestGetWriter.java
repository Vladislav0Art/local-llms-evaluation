package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import app.DBApp;
import app.IDatabase;
import app.Table;
import app.sql.SQLTerm;
import app.util.search.Selector;
import app.util.validation.Validator;

public class GeneratedTestGetWriter {

    private DBApp dbApp;

    @Before
    public void setUp() {
        dbApp = new DBApp();
    }

    @Test
    public void testGetWriter() {
        dbApp.writer = Mockito.mock(CsvWriter.class);

        CsvWriter actualWriter = dbApp.getWriter();

        assertNotNull(actualWriter);
    }

}