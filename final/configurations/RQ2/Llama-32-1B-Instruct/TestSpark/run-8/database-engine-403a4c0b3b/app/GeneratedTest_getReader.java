package app;

import com.opencsv.exceptions.CsvValidationException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.*;

import com.opencsv.exceptions.CsvValidationExceptionReader;
import exceptions.DBAppException;
import util.filecontroller.Serializer;
import storage.*;
import util.TypeCaster;
import util.search.*;
import sql.SQLTerm;
import datamanipulation.CsvReader;
import datamanipulation.CsvWriter;
import util.validation.Validator;

public class GeneratedTest_getReader {

    private IDatabase database;

    @BeforeEach
    public void setup() {
        database = new DBApp();
    }

    @Test
    public void test_getReader() throws IOException, CsvValidationExceptionReader {
        String[] arrSQLTerms = {"column1", "column2"};
        SQLTerm[] sqlTerms = new SQLTerm[arrSQLTerms.length];
        for (int i = 0; i < arrSQLTerms.length; i++) {
            sqlTerms[i] = new SQLTerm();
        }
        CSVReader reader = new CsvReader(database.getReader(), sqlTerms);
        Iterator<String> iterator = reader.iterator();

        while (iterator.hasNext()) {
            String row = iterator.next();
            assertTrue(row != null && !row.isEmpty());
        }

        try {
            reader.readNext();
        } catch (CsvValidationException e) {
            // Ignore
        }
    }

}