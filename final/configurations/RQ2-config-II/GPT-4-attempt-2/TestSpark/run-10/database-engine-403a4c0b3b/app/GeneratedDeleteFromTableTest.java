package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;

import static org.junit.Assert.*;

public class GeneratedDeleteFromTableTest {

    @Test
    public void deleteFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> nameValue = new Hashtable<>();
        nameValue.put("id", 2);

        dbApp.deleteFromTable("TestTable", nameValue);
        assertTrue(dbApp.getReader().read("TestTable").isEmpty());
    }

}