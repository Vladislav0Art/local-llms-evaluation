package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.Iterator;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] sqlTerms = new SQLTerm[1];
        String[] operators = new String[1];
        Iterator result = dbApp.selectFromTable(sqlTerms, operators);
        assertNotNull(result);
    }

}