package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;

import static org.junit.Assert.*;

public class GeneratedInsertIntoTableTest {

    @Test
    public void insertIntoTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> nameValue = new Hashtable<>();
        nameValue.put("id", 1);

        dbApp.insertIntoTable("TestTable", nameValue);
        assertEquals(1, dbApp.getReader().read("TestTable").size());
    }

}