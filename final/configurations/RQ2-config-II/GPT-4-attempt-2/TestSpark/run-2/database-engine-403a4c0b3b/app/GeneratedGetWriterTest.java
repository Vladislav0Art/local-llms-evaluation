package app;

import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import sql.SQLTerm;
import util.TypeCaster;
import util.search.SearchCriteria;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;

public class GeneratedGetWriterTest {

    @Mock
    CsvReader mockReader;

    @Test
    public void getWriterTest() {
        DBApp dbApp = new DBApp();
        CsvWriter writer = dbApp.getWriter();

        Assert.assertNotNull(writer);
    }

}