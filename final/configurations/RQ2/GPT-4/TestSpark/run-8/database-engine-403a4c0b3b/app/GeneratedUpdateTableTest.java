package app;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.util.*;

import exceptions.DBAppException;
import sql.SQLTerm;

import static org.mockito.Mockito.*;

public class GeneratedUpdateTableTest {

    @Test
    public void updateTableTest() throws DBAppException {
        DBApp dbApp = spy(new DBApp());
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        dbApp.updateTable("table", "key", htblColNameValue);
        Mockito.verify(dbApp, atLeastOnce()).updateTable(eq("table"), eq("key"), any(Hashtable.class));
    }

}