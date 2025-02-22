package app;

import static org.junit.Assert.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;

import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import util.filecontroller.Serializer;
import storage.*;
import util.search.*;
import sql.SQLTerm;
import datamanipulation.CsvReader;
import datamanipulation.CsvWriter;
import util.validation.Validator;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    private DBApp dbApp;
    private CsvReader reader;
    private CsvWriter writer;
    private Object clusteringKey;
    private String clusteringKeyValue;

    @Before
    public void setUp() throws Exception {
        dbApp = new DBApp();
        reader = Mockito.mock(CsvReader.class);
        writer = Mockito.mock(CsvWriter.class);
        clusteringKey = Mockito.mock(Object.class);
    }

    @Test
    public void testInit() {
        // TODO: Add test code
    }

}