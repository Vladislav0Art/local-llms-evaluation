package app;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.util.*;

import exceptions.DBAppException;
import sql.SQLTerm;

import static org.mockito.Mockito.*;

public class GeneratedDeleteFromTableTest {

    @Test
    public void deleteFromTableTest() throws DBAppException {
        DBApp dbApp = spy(new DBApp());
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        dbApp.deleteFromTable("table", htblColNameValue);
        Mockito.verify(dbApp, atLeastOnce()).deleteFromTable(eq("table"), any(Hashtable.class));
    }

}