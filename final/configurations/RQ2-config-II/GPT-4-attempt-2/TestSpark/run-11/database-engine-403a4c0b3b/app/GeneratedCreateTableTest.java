package app;

import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import sql.SQLTerm;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Iterator;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.createTable("Users", "id", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
    }

}