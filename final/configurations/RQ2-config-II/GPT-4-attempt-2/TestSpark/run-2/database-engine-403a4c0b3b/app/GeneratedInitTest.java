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

public class GeneratedInitTest {

    @Mock
    CsvReader mockReader;

    @Test
    public void initTest() {
        // No Exception testing, just makes sure the code runs
        DBApp dbApp = new DBApp();
        dbApp.init();
    }

}