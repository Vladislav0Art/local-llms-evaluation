package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;
import java.io.IOException;

import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import datamanipulation.CsvReader;
import datamanipulation.CsvWriter;
import sql.SQLTerm;

public class GeneratedCreateTableExceptionWhenInvalidNameTest {

    @Test
    public void createTableExceptionWhenInvalidNameTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> columnTypes = new Hashtable<>();
        Hashtable<String, String> columnMins = new Hashtable<>();
        Hashtable<String, String> columnMaxs = new Hashtable<>();
        dbApp.createTable("InvalidName", "Key", columnTypes, columnMins, columnMaxs);
    }

}