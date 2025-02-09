package app;

import org.junit.Test;
import org.junit.Assert;

import java.util.*;

import exceptions.DBAppException;
import sql.SQLTerm;

import static org.mockito.Mockito.*;

public class GeneratedUpdateTableBasicTest {

    @Test
    public void updateTableBasicTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> colNameValue = new Hashtable<>();

        dbApp.updateTable("TestTable", "TestKey", colNameValue);
    }

}