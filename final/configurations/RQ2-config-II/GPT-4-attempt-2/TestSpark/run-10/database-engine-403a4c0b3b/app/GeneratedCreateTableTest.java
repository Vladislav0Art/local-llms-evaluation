package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;

import static org.junit.Assert.*;

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> nameType = new Hashtable<>();
        Hashtable<String, String> nameMin = new Hashtable<>();
        Hashtable<String, String> nameMax = new Hashtable<>();
        nameType.put("id", "int");
        nameMin.put("id", "1");
        nameMax.put("id", "100");

        dbApp.createTable("TestTable", "id", nameType, nameMin, nameMax);
        assertTrue(dbApp.getMyTables().contains("TestTable"));
    }

}