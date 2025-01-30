package app;

import static junit.framework.TestCase.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.text.ParseException;
import java.util.Hashtable;
import java.util.Iterator;

import org.junit.Test;
import org.mockito.Mockito;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import sql.SQLTerm;
import storage.Table;

public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() throws DBAppException {
        DBApp app = Mockito.mock(DBApp.class);
        SQLTerm[] arrSQLTerms = {};
        String[] strarrOperators = {};
        app.selectFromTable(arrSQLTerms, strarrOperators);
    }

}