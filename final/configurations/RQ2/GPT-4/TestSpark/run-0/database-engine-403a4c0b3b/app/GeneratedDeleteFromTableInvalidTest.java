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
public class GeneratedDeleteFromTableInvalidTest {

    @Test
    public void deleteFromTableInvalidTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> colNameValue = new Hashtable<>();
        colNameValue.put("col1", "Value1");
        dbApp.deleteFromTable(null, colNameValue);
    }

}