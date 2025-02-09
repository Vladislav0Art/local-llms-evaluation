package app;

import app.DBApp;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import sql.SQLTerm;

import java.io.IOException;
import java.text.ParseException;
import java.util.Hashtable;
import java.util.Iterator;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() throws DBAppException {
        DBApp app = Mockito.spy(DBApp.class);
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        app.createTable("testTable", "keyCol", htblColNameType, htblColNameMin, htblColNameMax);
        Mockito.verify(app).createTable("testTable", "keyCol", htblColNameType, htblColNameMin, htblColNameMax);
    }

}