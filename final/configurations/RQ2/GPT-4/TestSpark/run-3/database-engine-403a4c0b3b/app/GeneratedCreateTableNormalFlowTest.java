package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;

public class GeneratedCreateTableNormalFlowTest {

    @Test
    public void createTableNormalFlowTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<String, String>() {{
            put("id", "int");
            put("name", "string");
        }};
        Hashtable<String, String> htblColNameMin = new Hashtable<String, String>() {{
            put("id", "0");
            put("name", "a");
        }};
        Hashtable<String, String> htblColNameMax = new Hashtable<String, String>() {{
            put("id", "100");
            put("name", "z");
        }};
        dbApp.createTable("student", "id", htblColNameType, htblColNameMin, htblColNameMax);
        HashSet<String> myTables = dbApp.getMyTables();
        assertTrue(myTables.contains("student"));
    }

}