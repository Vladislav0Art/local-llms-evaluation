package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;
import java.io.IOException;

import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import datamanipulation.CsvReader;
import datamanipulation.CsvWriter;
import sql.SQLTerm;

public class GeneratedSelectFromTableShouldReturnIteratorTest {

    @Test
    public void selectFromTableShouldReturnIteratorTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = {new SQLTerm("TableName", "ColumnName", "Operator", "Value")};
        String[] strarrOperators = {"and"};
        assertNotNull(dbApp.selectFromTable(arrSQLTerms, strarrOperators));
    }

}