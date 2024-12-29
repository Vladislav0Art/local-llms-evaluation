package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Assert;

import java.util.*;

import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import sql.SQLTerm;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateTableInvalidTest {

    @Test
    public void createTableInvalidTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> colNameType = new Hashtable<>();
        colNameType.put("col1", "String");
        Hashtable<String, String> colNameMin = new Hashtable<>();
        colNameMin.put("col1", "A");
        Hashtable<String, String> colNameMax = new Hashtable<>();
        colNameMax.put("col1", "Z");
        dbApp.createTable(null, null, colNameType, colNameMin, colNameMax);
    }

}