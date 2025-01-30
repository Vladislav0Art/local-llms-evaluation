package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.*;

import static org.mockito.Mockito.*;

public class GeneratedUpdateTableTest_withDBAppException {

    @Test
    public void updateTableTest_withDBAppException() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.updateTable("testTable", "100", htblColNameValue);
    }

}