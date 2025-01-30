package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import storage.Table;
import util.filecontroller.Serializer;

import java.io.IOException;
import java.util.Hashtable;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDeleteFromTableInvalidTableTest {

    @Test
    public void deleteFromTableInvalidTableTest() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("name", "value");
        DBApp dbApp = new DBApp();
        dbApp.deleteFromTable("testTable", htblColNameValue);
    }

}