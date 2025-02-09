package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.HashSet;

public class GeneratedDeleteFromTableFailureTest {

    @Test
    public void deleteFromTableFailureTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.deleteFromTable("TestTable", null);
    }

}