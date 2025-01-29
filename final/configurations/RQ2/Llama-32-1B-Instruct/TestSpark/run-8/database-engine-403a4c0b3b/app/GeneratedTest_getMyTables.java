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

public class GeneratedTest_getMyTables {

    private IDatabase database;

    @BeforeEach
    public void setup() {
        database = new DBApp();
    }

    @Test
    public void test_getMyTables() {
        HashSet<String> result = database.getMyTables();
        assertTrue(result.contains("table1"));
        assertFalse(result.contains("nonExistentTable"));
    }

    @Before
    public void initBefore() {
        database.init();
    }

    @AfterEach
    public void tearDownAfter() {
        // No-op
    }

}