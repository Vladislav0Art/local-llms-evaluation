package app;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;

import app.DBApp;
import storage.Table;
import exceptions.DBAppException;
import sql.SQLTerm;
import util.validation.Validator;

public class GeneratedSelectFromTableTest {

    @Mock
    CsvReader reader;
    @Mock
    CsvWriter writer;

    @Test
    public void selectFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[1];
        String[] strarrOperators = new String[1];

        Iterator result = dbApp.selectFromTable(arrSQLTerms, strarrOperators);

        Assert.assertNotNull(result);
    }

}