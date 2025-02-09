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
public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() throws DBAppException {
        DBApp app = Mockito.spy(DBApp.class);
        SQLTerm[] arrSQLTerms = new SQLTerm[0];
        String[] strarrOperators = new String[0];
        Iterator it = app.selectFromTable(arrSQLTerms, strarrOperators);
        assertNotNull("selectFromTable method failed", it);
    }

}