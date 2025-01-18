package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import storage.*;
import util.TypeCaster;
import util.search.*;
import sql.SQLTerm;
import datamanipulation.CsvReader;
import datamanipulation.CsvWriter;
import util.validation.Validator;

public class GeneratedGetWriterNormalFlowTest {

    @Test
    public void getWriterNormalFlowTest() {
        DBApp dbApp = new DBApp();
        CsvWriter writer = dbApp.getWriter();
        assertNotNull(writer);
    }

}