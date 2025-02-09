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

public class GeneratedGetMyTablesShouldReturnHashSetTest {

    @Test
    public void getMyTablesShouldReturnHashSetTest() {
        DBApp dbApp = new DBApp();
        assertTrue(dbApp.getMyTables() instanceof HashSet);
    }

}