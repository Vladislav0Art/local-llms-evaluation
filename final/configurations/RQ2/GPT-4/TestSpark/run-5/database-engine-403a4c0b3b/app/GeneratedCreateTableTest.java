package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import sql.SQLTerm;

import java.util.Hashtable;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() throws DBAppException {
        Hashtable<String, String> tableDetails = new Hashtable<>();
        tableDetails.put("col1", "val1");
        DBApp dbApp = new DBApp();
        dbApp.createTable("tableTest", "keyTest", tableDetails, tableDetails, tableDetails);
    }

}