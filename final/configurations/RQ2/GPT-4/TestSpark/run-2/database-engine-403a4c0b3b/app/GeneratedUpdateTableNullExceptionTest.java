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

public class GeneratedUpdateTableNullExceptionTest {

    @Test
    public void updateTableNullExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.updateTable(null, "keyValue", new Hashtable<String, Object>());
    }

}