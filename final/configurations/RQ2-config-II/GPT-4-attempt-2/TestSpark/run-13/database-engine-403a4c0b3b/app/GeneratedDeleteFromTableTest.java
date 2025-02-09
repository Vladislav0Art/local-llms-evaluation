package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.Iterator;

import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDeleteFromTableTest {

    @Test
    public void deleteFromTableTest() {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> colNameValue = new Hashtable<>();
        colNameValue.put("Name", "Jane");

        try {
            dbApp.deleteFromTable("Students", colNameValue);
        } catch (DBAppException e) {
            assert (false);
        }
    }

}