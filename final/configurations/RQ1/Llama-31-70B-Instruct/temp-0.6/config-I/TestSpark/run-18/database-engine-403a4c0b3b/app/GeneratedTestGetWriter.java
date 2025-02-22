package app;

import static org.junit.Assert.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;

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
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestGetWriter {

    private DBApp app;

    @Before
    public void setup() {
        app = new DBApp();
    }

    @Test
    public void testGetWriter() {
        CsvWriter expected = Mockito.mock(CsvWriter.class);
        CsvWriter actual = app.getWriter();

        assertSame(expected, actual);
    }

}