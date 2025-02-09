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

public class GeneratedSelectFromTableFailureTest1 {

    @Test
    public void selectFromTableFailureTest1() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.selectFromTable(null, null);
    }

}