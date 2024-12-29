package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Assert;

import java.util.*;

import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import sql.SQLTerm;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSelectFromTableInvalidTest {

    @Test
    public void selectFromTableInvalidTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[1];
        SQLTerm sqlTerm1 = new SQLTerm("col1", "string", "=", "Value1");
        arrSQLTerms[0] = sqlTerm1;
        String[] strarrOperators = new String[1];
        strarrOperators[0] = "and";
        dbApp.selectFromTable(arrSQLTerms, strarrOperators);
    }

}