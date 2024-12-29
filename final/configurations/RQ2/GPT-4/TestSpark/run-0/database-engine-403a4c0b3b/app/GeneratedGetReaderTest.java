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
public class GeneratedGetReaderTest {

    @Test
    public void getReaderTest() {
        DBApp dbApp = new DBApp();
        Assert.assertNotNull(dbApp.getReader());
    }

}