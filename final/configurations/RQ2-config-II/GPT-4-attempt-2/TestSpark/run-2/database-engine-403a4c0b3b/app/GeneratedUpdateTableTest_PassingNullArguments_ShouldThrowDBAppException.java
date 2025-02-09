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

public class GeneratedUpdateTableTest_PassingNullArguments_ShouldThrowDBAppException {

    @Mock
    CsvReader mockReader;

    @Test
    public void updateTableTest_PassingNullArguments_ShouldThrowDBAppException() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.updateTable(null, null, null);
    }

}