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

public class GeneratedInitShouldRunWithoutExceptionsTest {

    @Test
    public void initShouldRunWithoutExceptionsTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
    }

}