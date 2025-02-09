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

public class GeneratedSelectFromTableTest_ValidParams_ShouldNotThrowException {

    @Mock
    CsvReader mockReader;

    @Test
    public void selectFromTableTest_ValidParams_ShouldNotThrowException() {
        Mockito.when(mockReader.parseSqlTerms(Mockito.any(SQLTerm[].class))).thenReturn(new SearchCriteria());
        DBApp reference = new DBApp();
        SQLTerm[] terms = new SQLTerm[]{new SQLTerm()};
        String[] operators = new String[]{"AND"};
        try {
            reference.selectFromTable(terms, operators);
        } catch (Exception e) {
            Assert.fail("This should not have thrown an exception");
        }
    }

}