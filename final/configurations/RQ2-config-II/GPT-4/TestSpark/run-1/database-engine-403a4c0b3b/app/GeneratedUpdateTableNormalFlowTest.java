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
public class GeneratedUpdateTableNormalFlowTest {

    @Test
    public void updateTableNormalFlowTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> anyTable = new Hashtable<>();
        dbApp.updateTable(anyString(), anyString(), anyTable);
    }

}