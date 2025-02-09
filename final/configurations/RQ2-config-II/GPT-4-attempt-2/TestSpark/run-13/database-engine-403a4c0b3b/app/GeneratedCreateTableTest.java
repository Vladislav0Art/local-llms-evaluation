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
public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> colNameType = new Hashtable<>();
        colNameType.put("Name", "String");
        Hashtable<String, String> colNameMin = new Hashtable<>();
        colNameMin.put("Name", "A");
        Hashtable<String, String> colNameMax = new Hashtable<>();
        colNameMax.put("Name", "Z");

        try {
            dbApp.createTable("Students", "Name", colNameType, colNameMin, colNameMax);
        } catch (DBAppException e) {
            assert (false);
        }
    }

}