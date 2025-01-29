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

public class GeneratedTest_getWriter {

    private IDatabase database;

    @BeforeEach
    public void setup() {
        database = new DBApp();
    }

    @Test
    public void test_getWriter() throws IOException, CsvValidationException {
        CSVWriter writer = new CSVWriter(database.getWriter(), "output.csv");
        String[] arrSQLTerms = {"column1", "column2"};
        SQLTerm[] sqlTerms = new SQLTerm[arrSQLTerms.length];
        for (int i = 0; i < arrSQLTerms.length; i++) {
            sqlTerms[i] = new SQLTerm();
        }
        writer.writeArray(sqlTerms);

        try {
            // Check that output.csv has been created
            assertTrue(new File("output.csv").exists());
        } catch (Exception e) {
            // Ignore
        }

        try {
            // Try to write another CSV with the same header
            String[] arrSQLTerms2 = {"column1", "column2"};
            writer.writeArray(arrSQLTerms2);
            assertEquals(0, new File("output.csv").length());
        } catch (Exception e) {
            // Ignore
        }
    }

}