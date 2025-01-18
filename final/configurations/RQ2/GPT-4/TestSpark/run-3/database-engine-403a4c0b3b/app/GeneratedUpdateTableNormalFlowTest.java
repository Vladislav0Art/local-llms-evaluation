package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;

public class GeneratedUpdateTableNormalFlowTest {

    @Test
    public void updateTableNormalFlowTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<String, Object>() {{
            put("name", "not_anymore");
        }};
        dbApp.updateTable("student", "1", htblColNameValue); //assuming that a row with id = 1 exists
        Iterator result = dbApp.selectFromTable(null, null); //dummy operation to get all data
        while (result.hasNext()) {
            assertNotEquals(((Hashtable) result.next()).get("name"), "ab");
        }
    }

}