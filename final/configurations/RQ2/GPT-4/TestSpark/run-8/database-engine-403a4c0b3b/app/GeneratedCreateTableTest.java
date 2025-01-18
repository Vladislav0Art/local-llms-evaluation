package app;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.util.*;

import exceptions.DBAppException;
import sql.SQLTerm;

import static org.mockito.Mockito.*;

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() throws DBAppException {
        DBApp dbApp = spy(new DBApp());
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();

        dbApp.createTable("table", "key", htblColNameType, htblColNameMin, htblColNameMax);
        Mockito.verify(dbApp, atLeastOnce()).createTable(eq("table"), eq("key"), any(Hashtable.class), any(Hashtable.class), any(Hashtable.class));
    }

}