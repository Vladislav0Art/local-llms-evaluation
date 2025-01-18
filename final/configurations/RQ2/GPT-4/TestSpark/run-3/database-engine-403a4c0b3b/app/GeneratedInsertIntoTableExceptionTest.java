package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;

public class GeneratedInsertIntoTableExceptionTest {

    @Test
    public void insertIntoTableExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<String, Object>() {{
            put("id", "101"); //value exceeding the set maximum
            put("name", "ab");
        }};
        dbApp.insertIntoTable("student", htblColNameValue);
    }

}