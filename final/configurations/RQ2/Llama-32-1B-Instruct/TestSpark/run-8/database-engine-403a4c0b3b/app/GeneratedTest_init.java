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

public class GeneratedTest_init {

    private IDatabase database;

    @BeforeEach
    public void setup() {
        database = new DBApp();
    }

    @Test
    public void test_init() throws IOException {
        database.init();
        assertTrue(database.getMyTables().size() > 0);

        try {
            database.close();
        } catch (IOException e) {
            // Ignore
        }

        new DBApp();
    }

    @Before
    public void initBefore2() {
        database.init();
    }

    @AfterEach
    public void tearDownAfter2() {
        // No-op
    }

}