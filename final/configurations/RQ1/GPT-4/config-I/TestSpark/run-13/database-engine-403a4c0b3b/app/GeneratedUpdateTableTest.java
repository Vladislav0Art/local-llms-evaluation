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

public class GeneratedUpdateTableTest {

    @Test
    public void updateTableTest() throws DBAppException {
        DBApp app = Mockito.mock(DBApp.class);
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("id", 2);
        app.updateTable("TestTable", "1", htblColNameValue);
    }

}