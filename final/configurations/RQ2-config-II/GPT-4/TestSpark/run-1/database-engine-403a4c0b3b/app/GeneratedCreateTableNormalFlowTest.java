package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

import java.util.Hashtable;
import java.util.HashSet;

import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateTableNormalFlowTest {

    @Test
    public void createTableNormalFlowTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> anyTable = new Hashtable<>();
        dbApp.createTable(anyString(), anyString(), anyTable, anyTable, anyTable);
    }

}