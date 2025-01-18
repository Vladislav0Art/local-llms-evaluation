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
public class GeneratedUpdateTableTest {

    @Test
    public void updateTableTest() throws DBAppException {
        Hashtable<String, Object> tableValues = new Hashtable<>();
        tableValues.put("col1", "val1");
        DBApp dbApp = new DBApp();
        dbApp.updateTable("tableTest", "keyTest", tableValues);
    }

}