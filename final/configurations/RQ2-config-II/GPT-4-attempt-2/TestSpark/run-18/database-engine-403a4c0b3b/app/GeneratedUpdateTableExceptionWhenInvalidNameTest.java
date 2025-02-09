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

public class GeneratedUpdateTableExceptionWhenInvalidNameTest {

    @Test
    public void updateTableExceptionWhenInvalidNameTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> values = new Hashtable<>();
        dbApp.updateTable("InvalidName", "Key", values);
    }

}