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

public class GeneratedGetWriterTest {

    @Test
    public void getWriterTest() throws IOException, CsvValidationException, DBAppException {
        DBApp dbApp = new DBApp();
        CsvWriter writer = dbApp.getWriter();
        assertNotNull(writer);
    }

}