package app;

import app.DBApp;
import app.Action;
import exceptions.DBAppException;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Hashtable;
import java.util.Iterator;

import storage.Table;
import sql.SQLTerm;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class GeneratedDeleteFromTableTest {

    @Test
    public void deleteFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> rows = new Hashtable<String, Object>();
        rows.put("id", 1);
        rows.put("name", "John");

        // Trying to delete from a table that does not exist
        dbApp.deleteFromTable("NonExistentTable", rows);
    }

}