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

public class GeneratedSelectFromTableFailureTest3 {

    @Test
    public void selectFromTableFailureTest3() throws DBAppException {
        DBApp dbApp = new DBApp();
        String[] strarrOperators = new String[1];
        dbApp.selectFromTable(null, strarrOperators);
    }

}