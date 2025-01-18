package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Hashtable;

import static org.mockito.Mockito.*;

import exceptions.DBAppException;
import sql.SQLTerm;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInsertIntoTableWithInvalidArgumentsTest {

    @Test
    public void insertIntoTableWithInvalidArgumentsTest() throws DBAppException {
        DBApp app = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        app.insertIntoTable(null, htblColNameValue);
    }

}