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

public class GeneratedGetMyTablesTest {

    @Mock
    CsvReader mockReader;

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> myTables = dbApp.getMyTables();

        Assert.assertNotNull(myTables);
    }

}