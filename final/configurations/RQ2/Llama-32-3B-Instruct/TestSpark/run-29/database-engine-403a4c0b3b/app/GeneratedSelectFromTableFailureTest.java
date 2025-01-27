package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.io.IOException;
import java.text.ParseException;

import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import util.filecontroller.Serializer;
import storage.*;
import util.TypeCaster;
import util.search.*;
import sql.SQLTerm;
import datamanipulation.CsvReader;
import datamanipulation.CsvWriter;
import util.validation.Validator;

public class GeneratedSelectFromTableFailureTest {

    @Test
    public void selectFromTableFailureTest() throws IOException, CsvValidationException, DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[0];
        String[] strarrOperators = new String[0];
        try {
            dbApp.selectFromTable(arrSQLTerms, strarrOperators);
            fail("Expected DBAppException");
        } catch (DBAppException e) {
            assertTrue(true);
        }
    }

}