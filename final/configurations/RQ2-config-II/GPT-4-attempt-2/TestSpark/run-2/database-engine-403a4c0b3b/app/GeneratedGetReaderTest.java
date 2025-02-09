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

public class GeneratedGetReaderTest {

    @Mock
    CsvReader mockReader;

    @Test
    public void getReaderTest() {
        DBApp dbApp = new DBApp();
        CsvReader reader = dbApp.getReader();

        Assert.assertNotNull(reader);
    }

}