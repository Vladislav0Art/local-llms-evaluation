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

public class GeneratedInsertIntoTableNormalFlowTest {

    @Test
    public void insertIntoTableNormalFlowTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.insertIntoTable("tableName", new Hashtable<String, Object>());
        // Assert no error in execution
    }

}