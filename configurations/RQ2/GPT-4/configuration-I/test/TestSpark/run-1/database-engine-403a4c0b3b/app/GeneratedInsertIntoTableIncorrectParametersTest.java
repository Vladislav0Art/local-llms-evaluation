package app;

import org.junit.Test;

import java.util.Hashtable;
import java.util.HashSet;
import java.util.Iterator;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

public class GeneratedInsertIntoTableIncorrectParametersTest {

    @Test
    public void insertIntoTableIncorrectParametersTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        String tableName = "table1";
        Hashtable<String, Object> colNameValue = new Hashtable<>();
        dbApp.insertIntoTable(tableName, colNameValue);
    }

}